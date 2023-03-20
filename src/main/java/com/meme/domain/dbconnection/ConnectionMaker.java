package com.meme.domain.dbconnection;

import java.sql.Connection;

public interface ConnectionMaker {
  public ConnectionMaker connectionMaker(Connection conn);
}
