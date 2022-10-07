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

    public boolean isUrl(String str)
    {
        String patternUrl = "\\b(https?)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

        Pattern pattern = Pattern.compile(patternUrl);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean isPassword(String str)
    {
        String patternPass = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";

        Pattern pattern = Pattern.compile(patternPass);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
