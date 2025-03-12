package day250305.jdbc.callablestmt;

import day250227.jdbc.connection.ex2.DBUtil;
import java.sql.*;

public class CallableStmtEx03 {
    public static void main(String[] args) {
        try (Connection conn = DBUtil.getConnection();
             CallableStatement cs = conn.prepareCall("{CALL SP_MEMBER_INSERT(?, ?, ?, ?, ?)}")) {

            // 1. IN 파라미터 설정 (회원 정보 입력)
            cs.setString(1, "testUser");  // 사용자 ID
            cs.setString(2, "testPass123"); // 비밀번호
            cs.setString(3, "testUser@example.com"); // 이메일
            cs.setString(4, "010-9876-5432"); // 핸드폰 번호

            // 2. OUT 파라미터 등록 (5번째 매개변수)
            cs.registerOutParameter(5, Types.VARCHAR);

            // 3. 프로시저 실행
            cs.execute();

            // 4. OUT 파라미터 값 가져오기
            String resultMsg = cs.getString(5);
            System.out.println("결과 메시지: " + resultMsg);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}