package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    //将来查询我的帖子可以用这个方法
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //@Param("userId")给参数取别名
    //只有一个参数，且在<if>里使用时必须用@Param
    int selectDiscussPostRows(@Param("userId") int userId);

}
