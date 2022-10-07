import org.junit.Test;
import org.junit.Assert;

public class RegularTests
{
    @Test
    public void ipCorrTest1()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isIp("250.250.250.250"));
    }

    @Test
    public void ipCorrTest2()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isIp("178.44.41.38"));
    }

    @Test
    public void ipCorrTest3()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isIp("124.86.57.0"));
    }

    @Test
    public void ipCorrTest4()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isIp("89.64.128.255"));
    }

    @Test
    public void ipCorrTest5()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isIp("244.255.64.11"));
    }

    @Test
    public void ipCorrTest6()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isIp("212.65.88.99"));
    }

}
