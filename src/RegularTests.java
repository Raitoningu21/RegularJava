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

    @Test
    public void ipWrongTest1()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isIp("256.256.256.256"));
    }

    @Test
    public void ipWrongTest2()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isIp("0.0.0.0"));
    }

    @Test
    public void ipWrongTest3()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isIp(" 56.122.14.1"));
    }

    @Test
    public void ipWrongTest4()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isIp("45/16/14/77"));
    }

    @Test
    public void ipWrongTest5()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isIp("144.1234.11.55"));
    }

    @Test
    public void ipWrongTest6()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isIp("9/ 12314.4 .55"));
    }

}
