package com.lianggzone.springboot.action.data.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lianggzone.springboot.action.data.mybatis.entity.Author;

/**
 * <h3>概要:</h3><p>AuthorMapper</p>
 * <h3>功能:</h3><p>AuthorMapper（通过注解的方式）</p>
 * <h3>履历:</h3>
 * <li>2016年12月13日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
@Mapper
public interface AuthorMapper {
    
    @Insert("insert into t_author(real_name, nick_name) values(#{real_name}, #{nick_name})")
    int add(@Param("realName") String realName, @Param("nickName") String nickName);
    
    @Update("update t_author set real_name = #{real_name}, nick_name = #{nick_name} where id = #{id}")
    int update(@Param("real_name") String realName, @Param("nick_name") String nickName, @Param("id") Long id);
    
    @Delete("delete from t_author where id = #{id}")
    int delete(Long id);
    
    @Select("select id, real_name as realName, nick_name as nickName from t_author where id = #{id}")
    Author findAuthor(@Param("id") Long id);
    
    @Select("select id, real_name as realName, nick_name as nickName from t_author")
    List<Author> findAuthorList();
}