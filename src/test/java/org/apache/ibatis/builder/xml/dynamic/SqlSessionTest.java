package org.apache.ibatis.builder.xml.dynamic;

import org.apache.ibatis.domain.blog.Article;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class SqlSessionTest {

  @Test
  public void testSqlSession() throws IOException {
    String resource = "org/apache/ibatis/builder/mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    List<Object> objects = sqlSession.selectList("org.apache.ibatis.domain.blog.mappers.ArticleMapper.selectByPrimaryKey",
      1);
    System.out.println(Arrays.toString(objects.toArray(new Article[0])));
  }
}
