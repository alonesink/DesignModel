package alonesink.factory;

/*
* Created by  WangDi  on 2017/9/4 0004
*/
public class Others implements Animal{
    @Override
    public Integer sleepHours() {
        return null;
    }

    @Override
    public void run() {

        System.out.println("Others is Running!");
    }
}
