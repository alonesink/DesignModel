package temp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
* Created by  WangDi  on 2017/9/4 0004
*/
public class PropertiesFactory {

    static String classPath;

    static Animal getPropertiesFactory(String str){

        Animal animal = null;
        Properties pps = new Properties();

        //确定加载文件全路径
        String resoucesPath = "/src/main/resources/reflectFactory.properties";
        StringBuilder sb = new StringBuilder();
        sb.append(System.getProperty("user.dir")).append(resoucesPath);

        try {

            //读取文件并加载
            FileInputStream fileInputStream = new FileInputStream(sb.toString());
            pps.load(fileInputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(!"".equals(str) && str != null){

            classPath = pps.getProperty(str.toLowerCase());

            if(classPath == null){

                classPath = pps.getProperty("others".toLowerCase());
            }

            try {
                animal = (Animal) Class.forName(classPath).newInstance();

            } catch (InstantiationException e) {
                e.printStackTrace();

            } catch (IllegalAccessException e) {
                e.printStackTrace();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();

            }

            return animal;

        }

        return null;
    }
}
