package FirstEvalution.Day3_TestNG;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {

    public static void main(String[] args) throws IOException {
       // setProperties();
        getProperties();
    }

    public static void setProperties() throws IOException {
        Properties properties=new Properties();
        OutputStream outputStream=new FileOutputStream("C:\\Akshay Kumar TFT Java\\PracticeAllProjects\\src\\test\\java\\Day3_TestNG\\confilg.properties");
        properties.setProperty("Browser","Google");
        properties.setProperty("Name","File");
        properties.store(outputStream,"data Stored");


    }


    public static  void getProperties() throws IOException{
        Properties properties=new Properties();
        InputStream inputStream=new FileInputStream("C:\\Akshay Kumar TFT Java\\PracticeAllProjects\\src\\test\\java\\Day3_TestNG\\confilg.properties");
        properties.load(inputStream);
        System.out.println(properties.getProperty("Browser"));
        System.out.println(properties.getProperty("Name"));
        System.out.println(properties.getProperty("Username"));
        System.out.println(properties.getProperty("firstname"));
        System.out.println(properties.getProperty("surname"));

    }
}


