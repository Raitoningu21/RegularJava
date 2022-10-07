import java.util.regex.*;

public class Regular
{
    public boolean isIp(String str)
    {
        String patternIp = "";
        Pattern pattern = Pattern.compile(patternIp);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
