package alonesink.singleton;
/*
* Created by  WangDi  on 2017/9/3 0003
*/


public class Hungury {

    private static Hungury hungury = new Hungury();

    public static Hungury getHungury(){//饿汉模式(比较消耗内存)

        return hungury;
    }
}
