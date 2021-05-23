import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Pankaj Kumar
 * @since 5/22/2021
 */
public class dataprovideExample {

    @Test(dataProvider = "dpMethod")
    public void test1(int a,int b){
        System.out.println(a+b);
    }

    @DataProvider
    public Object[][] dpMethod(){
        return new Object[][]{{1,2},{1,3}};
    }
}
