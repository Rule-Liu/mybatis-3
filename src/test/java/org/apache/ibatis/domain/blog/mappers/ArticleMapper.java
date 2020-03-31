package org.apache.ibatis.domain.blog.mappers;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.domain.blog.Article;

import java.util.List;


public interface ArticleMapper {

    Article selectByPrimaryKey(@Param("id") int id);

    List<Article> selectAll();
}
