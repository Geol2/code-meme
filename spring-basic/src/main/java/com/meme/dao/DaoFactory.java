package com.meme.dao;

import com.meme.user.UserDAO;
import org.apache.catalina.User;

public class DaoFactory {

  public UserDAO userDao;

  public void DaoFactory(UserDAO userDao) {
    this.userDao = userDao;
  }

}
