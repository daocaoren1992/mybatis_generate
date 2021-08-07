import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-08-05 21:56
 */
public class GeneratorFromXML {
    public static void main(String[] args) throws Exception {
        System.out.println("hot-fix-2");
        System.out.println("hot-fix-1");
        System.out.println("hot-fix-3");
       /* List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);*/
    }
}
