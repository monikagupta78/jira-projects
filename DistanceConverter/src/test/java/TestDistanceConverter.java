import org.junit.Assert;
import org.junit.Test;

//jira issue test - to test build
//to check if after build issue numnber link is created 

public class TestDistanceConverter {
    @Test
    public void testConvertToKm()
    {
        DistanceConverter converter=new DistanceConverter();
        //removed something
        Assert.assertEquals(8.04672,converter.fromMilesToKm(5),0.001d);
    }
}
