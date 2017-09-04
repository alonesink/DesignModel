package alonesink.factory;

/*
* Created by  WangDi  on 2017/9/4 0004
*/
public class LowFactory {

    public static Animal getAnimal(String str){

        //每一个类型的对象都有一个标识，传入相应的标识，可以获得对应的对象，这里是一个最简单的工厂
        if ("cat".equals(str)){

            return new Cat();

        }else if("pig".equals(str)) {

            return new Pig();
        }else {

            return new Others();
        }
    }
}
