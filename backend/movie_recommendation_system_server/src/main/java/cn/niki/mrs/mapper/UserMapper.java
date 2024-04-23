package cn.niki.mrs.mapper;

import cn.niki.mrs.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper extends BaseMapper<User> {
    /**
     * 获取用户的类型喜好
     * @param id 用户id
     * @return 类型喜好
     */
    List<String> selectUserTypes(Long id);

    /**
     * 获取用户的地区喜好
     * @param id 用户id
     * @return 地区喜好
     */
    List<String> selectUserRegions(Long id);
}




