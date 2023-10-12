package SecondEvalution.Day1;

import java.io.*;
import java.util.Properties;

public class PropertiesFileDemo {

    public static void main(String[] args) throws IOException {
       getProperties();
       setProperties();
    }

    public static void getProperties() throws IOException {
        Properties properties=new Properties();
        InputStream inputStream=new FileInputStream("C:\\Akshay Kumar TFT Java\\PracticeAllProjects\\src\\test\\java\\SecondEvalution\\config.properties");
        properties.load(inputStream);

        System.out.println( properties.getProperty("name"));
        System.out.println( properties.getProperty("fullname"));
        System.out.println( properties.getProperty("surname"));


    }
    public static void setProperties() throws IOException {
        Properties properties=new Properties();
        OutputStream outputStream=new FileOutputStream("C:\\Akshay Kumar TFT Java\\PracticeAllProjects\\src\\test\\java\\SecondEvalution\\config.properties");
        properties.setProperty("name","Akshay");
        properties.setProperty("fullname","Akshay Kumar");
        properties.setProperty("surname","Doodwal");
        properties.store(outputStream,"File stored");





    }

}
