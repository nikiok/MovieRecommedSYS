package cn.niki.mrs.vo.movie;

import lombok.Data;


@Data
public class MovieStripVo {
    private Long id;

    private Long did;

    private String name;

    private double score;

    private String pic;

    private String directors;

    private String actors;

    private String regions;

    private String types;
}
