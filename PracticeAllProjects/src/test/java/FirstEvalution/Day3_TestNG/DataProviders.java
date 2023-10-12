package FirstEvalution.Day3_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
    @Test(dataProvider = "logindata")
    void testDataprovider(Object name,String secondname){

        System.out.println(name );
        System.out.println(secondname );
    }

    @DataProvider
    public Object[][]  logindata(){
        Object[][] data=new Object[2][2];
        data[0][0]="Akshay";
        data[0][1]="Kumar";
        data[1][0]="Vikas";
        data[1][1]="sir";

        return  data;

    }


}
