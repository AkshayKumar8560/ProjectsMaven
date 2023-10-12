package TestNG.day4;

import java.io.*;
import java.util.Properties;

public class PropertileFile {
    public static void main(String[] args) throws IOException {
        getproperties();
        setDataProperties();
     //  getproperties();
        /*try {
            Properties properties=new Properties();
            //String projectpath=System.getProperty("user.dir");
            FileInputStream inputStream=new FileInputStream("C:/Akshay Kumar TFT Java/TestNG_maven/src/test/java/day4/config.properties");
            properties.load(inputStream);
            String brs=properties.getProperty("Browser");
            System.out.println(brs);
        }
        catch (Exception exception){
            exception.printStackTrace();
            System.out.println(exception);

        }*/
    }

   // How to get data prom properties

    public static void getproperties() throws IOException {
        Properties properties=new Properties();
       // String projectpath=System.getProperty("user.dir");
        InputStream inputStream=new FileInputStream("C:\\Akshay Kumar TFT Java\\TestNG_maven\\src\\test\\java\\TestNG\\day4\\config.properties");
         properties.load(inputStream);
         String brs=properties.getProperty("Browser");
        System.out.println(brs);
         String fle=properties.getProperty("File");
        System.out.println(fle);



    }


    // how to setData to properties file

    // set data to .properties file
    public static void setDataProperties() throws IOException {
        Properties properties=new Properties();
        OutputStream outputStream=new FileOutputStream("C:\\Akshay Kumar TFT Java\\TestNG_maven\\src\\test\\java\\TestNG\\day4\\config.properties");

        properties.setProperty("Browser","GoogleChrome");
        properties.setProperty("File","Chrome");
        properties.store(outputStream,null);

    }


}
