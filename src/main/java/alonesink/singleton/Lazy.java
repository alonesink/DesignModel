package alonesink.singleton;
/*
* Created by  WangDi  on 2017/9/3
*/


public class Lazy {

    private static Lazy lazy1 = null;
    private static Lazy lazy2 = null;
    private static Lazy lazy3 = null;


    /*
    * 相比饿汉模式不太消耗内存，线程不安全
    */
    public static Lazy getLazy1(){

        if(lazy1 == null){

            return new Lazy();
        }else {

            return lazy1;
        }
    }

    /*
    *同步方法，使得该方法具有可见性，一个线程对其方法调用完之后，其线程才可以访问
    */
    public static synchronized Lazy getLazy2(){

        if(lazy2 == null){

            return new Lazy();
        }else {

            return lazy2;
        }
    }

    /*
    * 同步代码块针对某一个对象进行锁操作，这里锁住整个类,和单一对象i，第二个锁只对i添加了互斥行为
    * 相较于同步方法，该方法更加减少内存的消耗。
    * */
    public static  Lazy getLazy3(){

        Integer i = 0;
        if (lazy3 == null){

            synchronized (Lazy.class){
                synchronized (i){
                    i++;
                }
                return new Lazy();
            }

        }else {

            return lazy3;
        }
    }
}
