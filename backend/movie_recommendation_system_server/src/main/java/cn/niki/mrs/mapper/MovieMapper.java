package cn.niki.mrs.mapper;

import cn.niki.mrs.vo.movie.MovieCardVo;
import cn.niki.mrs.vo.movie.ReviewedMovieStripVo;
import cn.niki.mrs.entity.Movie;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface MovieMapper extends BaseMapper<Movie> {

    /**
     * 查询某部电影的“喜欢这部电影的人也喜欢。。”的电影列表
     * @param id 电影id
     * @return “喜欢这部电影的人也喜欢。。”电影列表
     */
    List<MovieCardVo> selectRecommendedMoviesByMovieId(Long id);

    /**
     * 查询某个用户评价过的所有电影基本信息
     * @param uid 用户id
     * @param currentIndex 从第几条开始取
     * @param pageSize 每页条数
     * @return 评价过的所有电影基本信息
     */
    List<ReviewedMovieStripVo> selectMoreReviewedMoviesByUserId(Long uid, Integer currentIndex, Integer pageSize);

    /**
     * 查询某个用户最近评价过的若干电影基本信息
     * @param uid 用户id
     * @param num  最近评价的前num部电影
     * @return 评价过的若干电影基本信息
     */
    List<ReviewedMovieStripVo> selectSomeReviewedMoviesByUserId(Long uid, Integer num);

    /**
     * 查询最多人看过的（评价过）的电影列表（前num部）
     * @param num 要查询的电影数量
     * @return 最多人看过的（评价过）的电影列表
     */
    List<MovieCardVo> selectMostWatchedMovies(Integer num);

    /**
     * 查询评分最高的前n部电影列表
     * @param num 要查询的电影数量
     * @return 评分最高的前n部电影列表
     */
    List<MovieCardVo> selectHighestRatedMovies(Integer num);
}




