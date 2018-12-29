import org.junit.Assert;
import org.junit.Test;

public class IdeographicTest {

    @Test
    public void ideogrphicSumTest1(){
        Assert.assertEquals(70,Ideographic.ideogrphicSum(15,100));
    }

    @Test
    public void ideogrphicSumTest2(){
        Assert.assertEquals(120,Ideographic.ideogrphicSum(20,200));
    }

    @Test
    public void findNumberTest1(){
        Assert.assertEquals(102,Ideographic.findNumber(213));
    }

    @Test
    public void findNumberTest2(){
        Assert.assertEquals(10,Ideographic.findNumber(15));
    }

    @Test
    public void findNumberTest3(){
        Assert.assertEquals(11,Ideographic.findNumber(11));
    }

    @Test
    public void findNumberTest4(){
        for(int i=1;i<9;i++){
            Assert.assertEquals(1,Ideographic.findNumber(i));
        }
    }

}
