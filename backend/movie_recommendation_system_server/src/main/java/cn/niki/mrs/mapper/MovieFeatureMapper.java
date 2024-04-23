package cn.niki.mrs.mapper;

import cn.niki.mrs.entity.MovieFeature;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;


public interface MovieFeatureMapper extends BaseMapper<MovieFeature> {
    /**
     * 查询用户id为uid的用户，所有没有评价过的评分超过5分的电影矩阵列表
     * @param uid 用户id
     * @return 所有没有评价过的评分超过5分的电影矩阵列表
     */
    List<MovieFeature> selectAllMovieFeaturesWhereUserNotWatchedAndScoreMoreThanFive(Long uid);

    /**
     * 获取用户id为uid的用户，其推荐电影列表中每部电影的特征矩阵
     * @param uid 用户id
     * @param num 取多少部电影
     * @return 推荐电影列表中每部电影的特征矩阵
     */
    List<MovieFeature> selectRecommendedMoviesFeaturesByUserId(Long uid, Integer num);

    /**
     * 获取用户id为uid的用户，其看过的电影列表（最近看过的前num部电影）中每部电影的特征矩阵
     * @param uid 用户id
     * @param num 最近评价过的num部电影
     * @return 看过的电影列表中每部电影的特征矩阵
     */
    List<MovieFeature> selectWatchedMoviesFeaturesByUserId(Long uid, Integer num);
}




