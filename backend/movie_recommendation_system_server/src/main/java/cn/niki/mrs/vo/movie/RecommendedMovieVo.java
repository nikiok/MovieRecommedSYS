package cn.niki.mrs.vo.movie;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecommendedMovieVo {
    private Long id;

    private Long did;

    private String name;

    private Double score;

    private String pic;

    private String directors;

    private String actors;

    private String regions;

    private String types;

    /**
     * 推荐指数
     */
    private Double idx;
}
