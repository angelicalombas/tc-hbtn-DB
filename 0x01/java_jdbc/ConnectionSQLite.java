import java.sql.*;

public class ConnectionSQLite {
    public static void main(String[] args) {
        initConnection();

    }

    public static void initConnection(){
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:sqlite_database_2022.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}
