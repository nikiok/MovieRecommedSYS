package cn.niki.mrs.vo.movie.relation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class NodeVo {
    private Long id;
    private Long mid;
    private String name;
    private String value;
    private Integer category;
    private String types;
    private String regions;
}
