package org.apache.ibatis.domain.blog;

import java.util.Date;


public class Article {

  private Integer id;

  private String title;

  private String content;

  private Date createTime;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    return "Article{" +
      "id=" + id +
      ", title='" + title + '\'' +
      ", content='" + content + '\'' +
      ", createTime=" + createTime +
      '}';
  }
}
