package cn.niki.mrs.vo.movie.relation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryVo {

    private String name;

    private String base;

    public CategoryVo(String name) {
        this.name = name;
    }
}
