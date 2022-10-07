import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular
{
    public boolean isIp(String str)
    {
        String patternIp = "((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b)"+
                "((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b)" + "((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b)" +
                "((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b)";

        Pattern pattern = Pattern.compile(patternIp);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean isGuid(String str)
    {
        String patternIp = "^[{]?[0-9a-fA-F]{8}"
                + "-([0-9a-fA-F]{4}-)"
                + "{3}[0-9a-fA-F]{12}[}]?$";

        Pattern pattern = Pattern.compile(patternIp);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
