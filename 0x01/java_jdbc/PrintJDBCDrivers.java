import java.sql.Driver;

public class PrintJDBCDrivers {

    public static void print(Driver driver) {
        String className = driver.getClass().getName();
        int majorVersion = driver.getMajorVersion();
        int minorVersion = driver.getMinorVersion();
        System.out.println("----------------------------------------");
        System.out.println("Name Driver: " + className);
        System.out.println("Driver Major Version: " + majorVersion);
        System.out.println("Driver Minor Version: " + minorVersion);
        System.out.println("----------------------------------------");
    }

}
