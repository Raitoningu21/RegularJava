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
        Assert.assertFalse(ex.isIp("256.256.256.256"));
    }

    @Test
    public void ipWrongTest2()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isIp("0.0.0.f"));
    }

    @Test
    public void ipWrongTest3()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isIp(" 56.122.14.1"));
    }

    @Test
    public void ipWrongTest4()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isIp("45/16/14/77"));
    }

    @Test
    public void ipWrongTest5()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isIp("144.1234.11.55"));
    }

    @Test
    public void ipWrongTest6()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isIp("9/ 12314.4 .55"));
    }

    @Test
    public void GuidCorrTest1()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isGuid("941b6a97-ff5b-4e8a-bf29-36e72c59cb67"));
    }

    @Test
    public void GuidCorrTest2()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isGuid("8009c62b-d398-4b12-9de6-2634605d953a"));
    }

    @Test
    public void GuidCorrTest3()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isGuid("0913fef2-d7fd-488f-940b-6420fd8cd2eb"));
    }

    @Test
    public void GuidCorrTest4()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isGuid("24c192b5-addb-43bb-9373-9b3ccd1dfd13"));
    }

    @Test
    public void GuidCorrTest5()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isGuid("97da9576-bf48-49a6-837e-c8068349c082"));
    }

    @Test
    public void GuidCorrTest6()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isGuid("1b19554d-c6e0-475d-8c6d-13f841b60ca8"));
    }

    @Test
    public void GuidWrongTest1()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isGuid("1b19554d-c6e0-475d-8c6d-13f841b60ca"));
    }

    @Test
    public void GuidWrongTest2()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isGuid("1b193412554d-c6e130-475d415-8c6d6-13f84176b60ca8"));
    }
    @Test
    public void GuidWrongTest3()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isGuid("97da9576 bf48 49a6 837e c8068349c082"));
    }

    @Test
    public void GuidWrongTest4()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isGuid("97hh9576-hh48-49h6-837h-h8068349h082"));
    }

    @Test
    public void GuidWrongTest5()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isGuid("24-ad-bb-73-cd"));
    }

    @Test
    public void GuidWrongTest6()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isGuid("24sh-adsdffds-bbsfd-73-cddfs"));
    }

    @Test
    public void UrlCorrTest1()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isUrl("https://3k.ucoz.org/forum/2-76-1"));
    }

    @Test
    public void UrlCorrTest2()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isUrl("https://3k.mail.ru/"));
    }

    @Test
    public void UrlCorrTest3()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isUrl("https://www.itranslit.com/slugify/"));
    }

    @Test
    public void UrlCorrTest4()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isUrl("https://www.guidgenerator.com/online-guid-generator.aspx"));
    }

    @Test
    public void UrlCorrTest5()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isUrl("https://tools.icoder.uz/uuid-validator.php"));
    }

    @Test
    public void UrlCorrTest6()
    {
        Regular ex = new Regular();
        Assert.assertTrue(ex.isUrl("https://www.lastpass.com/features/password-generator"));
    }

    @Test
    public void UrlWrongTest1()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isUrl("httspd://3k.mail.ru/"));
    }

    @Test
    public void UrlWrongTest2()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isUrl("https-3k.mail.ru-"));
    }

    @Test
    public void UrlWrongTest3()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isUrl("https://b"));
    }

    @Test
    public void UrlWrongTest4()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isUrl("https:/3k"));
    }

    @Test
    public void UrlWrongTest5()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isUrl("3k.mail.ru"));
    }

    @Test
    public void UrlWrongTest6()
    {
        Regular ex = new Regular();
        Assert.assertFalse(ex.isUrl("http:**3k.mail.ru**"));
    }

}
