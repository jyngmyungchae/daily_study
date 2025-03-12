package day250305.jdbc.callablestmt;

import day250227.jdbc.connection.ex2.DBUtil;
import java.sql.*;

public class CallableStmtEx04 {
    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getConnection();
            conn.setAutoCommit(false);

            cs = conn.prepareCall("{CALL SP_MEMBER_LIST()}");
            rs = cs.executeQuery();

            while (rs.next()) {
                int m_seq = rs.getInt("m_seq");
                String m_userid = rs.getString("m_userid");
                String m_email = rs.getString("m_email");
                String m_hp = rs.getString("m_hp");
                Timestamp m_registdate = rs.getTimestamp("m_registdate");

                System.out.printf("%d %-8s %-15s %-2s %-20s%n",
                        m_seq, m_userid, m_email, m_hp, m_registdate);
            }

            conn.commit();

        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                    System.out.println("트랜잭션 롤백 완료");
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (cs != null) cs.close();
                if (conn != null) conn.close();
            } catch (SQLException closeEx) {
                closeEx.printStackTrace();
            }
        }
    }
}