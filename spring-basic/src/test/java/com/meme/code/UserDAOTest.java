package com.meme.code;

import com.meme.domain.dbconnection.ConnectionMaker;
import com.meme.domain.dbconnection.H2Connection;
import com.meme.user.UserDAO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDAOTest {

  @Test
  public void userAddTest() {
    // ConnectionMaker connectionMaker = new H2Connection();
    ConnectionMaker connectionMaker = new H2Connection();

    UserDAO user = new UserDAO(connectionMaker);
    user.setName("백인걸");
    user.setPassword("test");

  }

  @Test
  public void userAssertionNotEqualsTest() {
    // ConnectionMaker connectionMaker = new H2Connection();
    ConnectionMaker connectionMaker = new H2Connection();
    UserDAO user1 = new UserDAO(connectionMaker);
    UserDAO user2 = new UserDAO(connectionMaker);

    user1.setName("백인걸");
    user1.setPassword("test1");

    user2.setName("배긴걸");
    user2.setPassword("test2");

    Assertions.assertNotEquals(user1, user2);

  }

}
