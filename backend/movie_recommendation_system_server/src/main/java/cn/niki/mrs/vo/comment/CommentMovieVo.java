package cn.niki.mrs.vo.comment;

import cn.niki.mrs.vo.movie.MovieStripVo;
import lombok.Data;


@Data
public class CommentMovieVo {

    private CommentStripVo commentStripVo;

    private MovieStripVo movieStripVo;

}
