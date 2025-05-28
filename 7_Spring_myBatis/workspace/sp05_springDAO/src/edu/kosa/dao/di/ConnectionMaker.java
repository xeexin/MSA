package edu.kosa.dao.di;

import java.sql.Connection;

// 확장, 관계 느슨하게 처리하기 위해 interface
public interface ConnectionMaker {

	Connection makeConn() throws Exception;

}
