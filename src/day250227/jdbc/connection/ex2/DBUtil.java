package day250227.jdbc.connection.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public class DBUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/ssgdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "wjdaudco";

    private Connection createConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public static Connection getConnection() throws SQLException {
        try {
            return Optional.ofNullable(new DBUtil().createConnection())
                    .orElseThrow(() -> new SQLException("DB 연결을 얻지 못했습니다."));
        } catch (Exception e) {
            throw new SQLException("DB 연결 생성 중 오류 발생", e);
        }
    }
}
