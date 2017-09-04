package temp;

/*
* Created by  WangDi  on 2017/9/4 0004
*/
public class ReflectFactory {//反射工厂

    static Animal getReflectInstance(Class reflectFactory){

        Animal animal = null;
        try {

          animal = (Animal) Class.forName(reflectFactory.getCanonicalName()).newInstance();
        } catch (InstantiationException e) {

            e.printStackTrace();
        } catch (IllegalAccessException e) {

            e.printStackTrace();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }


        return animal;
    }
}
