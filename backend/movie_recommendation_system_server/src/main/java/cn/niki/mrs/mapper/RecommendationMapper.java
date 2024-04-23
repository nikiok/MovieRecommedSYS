package cn.niki.mrs.mapper;

import cn.niki.mrs.vo.movie.RecommendedMovieVo;
import cn.niki.mrs.entity.Recommendation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;


public interface RecommendationMapper extends BaseMapper<Recommendation> {

    /**
     * 获取用户id为uid的电影推荐列表
     * @param num 推荐指数排名前n部电影
     * @param uid 用户id
     * @return 电影推荐列表
     */
    List<RecommendedMovieVo> selectRecommendedMoviesByUserId(Long uid, Integer num);
}




