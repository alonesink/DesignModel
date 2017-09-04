package temp;

/*
* Created by  WangDi  on 2017/9/4
*/
public interface Animal {

    static Integer i = 8;
    default Integer sleepHours(){

        return i;
    }

    void run();

}
