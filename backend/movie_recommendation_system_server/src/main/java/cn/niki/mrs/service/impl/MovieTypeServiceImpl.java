package cn.niki.mrs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.niki.mrs.entity.MovieType;
import cn.niki.mrs.service.MovieTypeService;
import cn.niki.mrs.mapper.MovieTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author zjw
* @description 针对表【movie_type】的数据库操作Service实现
* @createDate 2022-04-21 22:58:26
*/
@Service
public class MovieTypeServiceImpl extends ServiceImpl<MovieTypeMapper, MovieType>
    implements MovieTypeService{

}




