package alonesink.factory;

/*
* Created by  WangDi  on 2017/9/4 0004
*/
public class EnumFactory {

    static Animal getEnumFactory(String str){

        switch (AnimalType.getRealType(str)){

            case CAT:

                return new Cat();

            case PIG:

                return new Pig();

            //相当于OHTERS
            default:
                return new Others();
        }
    }
}
