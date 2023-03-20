package com.meme.domain.dbconnection;

import java.sql.Connection;

public class MySqlConnection implements ConnectionMaker {

  public MySqlConnection() {

  }

  @Override
  public ConnectionMaker connectionMaker(Connection conn) {
    return new MySqlConnection();
  }

}
