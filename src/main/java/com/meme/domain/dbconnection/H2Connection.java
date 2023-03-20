package com.meme.domain.dbconnection;

import java.sql.Connection;

public class H2Connection implements ConnectionMaker {

  public H2Connection() {

  }

  @Override
  public ConnectionMaker connectionMaker(Connection conn) {
    return new H2Connection();
  }
}
