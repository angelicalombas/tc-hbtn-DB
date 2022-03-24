import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;


public class PrintDrivers {

    public static void main(String[] args) {
        System.out.println("List of loaded JDBC drivers");
        for (Enumeration<Driver> e = DriverManager.getDrivers(); e.hasMoreElements();) {
            Driver driver = e.nextElement();
            System.out.println(driver);
        }
    }
}
