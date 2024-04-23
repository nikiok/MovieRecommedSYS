package cn.niki.mrs.vo.movie;

import lombok.Data;


@Data
public class MovieCardVo {
    private Long id;

    private String name;

    private double score;
    
    private String pic;

    private Long num;
}
