import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtils {
    private static final String URL = "src/main/java/configuration/configs.properties";
    Properties file = new Properties();

    public static String getProperty(String key){
        FileReader pro=null;
        Properties p=null;
        try{
            pro=new FileReader(URL);
            p=new Properties();
            p.load(pro);
        }catch (IOException e){
            System.out.println(e.toString());
        }
        return p.getProperty(key);
    }

    public static void main(String[] args) /*throws IOException */ {
//        FileReader pro = new FileReader("src/main/java/configuration/configs.properties");
//        Properties p = new Properties();
//        p.load(pro);
//        System.out.println(p.getProperty("base_url"));
//        System.out.println(p.getProperty("email_1"));
        System.out.println(PropertiesFileUtils.getProperty("base_url"));
        System.out.println(PropertiesFileUtils.getProperty("email_1"));
        System.out.println(PropertiesFileUtils.getProperty("password_1"));
        System.out.println(PropertiesFileUtils.getProperty("email_2"));
        System.out.println(PropertiesFileUtils.getProperty("password_2"));

    }
}
