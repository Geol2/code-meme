package com.meme.user;

import com.meme.dao.DaoFactory;
import com.meme.domain.dbconnection.ConnectionMaker;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDAO {
  public String name;

  public String password;

  public ConnectionMaker connectionMaker;

  public UserDAO() {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
    this.connectionMaker = context.getBean("connectionMaker", ConnectionMaker.class);
  }

  public UserDAO(ConnectionMaker connectionMaker) {
    this.connectionMaker = connectionMaker;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public String getName() {
    return name;
  }
}
