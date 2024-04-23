package cn.niki.mrs.vo.movie.relation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkVo {

    /**
     * 起点
     */
    private String source;

    /**
     * 终点
     */
    private String target;

    /**
     * 相似指数
     */
    private Double idx;
}
