package temp;

/*
* Created by  WangDi  on 2017/9/4 0004
*/
public enum AnimalType {

    CAT,PIG,OTHERS;

    public static AnimalType getRealType(String str){

        AnimalType animalType = null;
        try {

            animalType = valueOf(str.toUpperCase());
        }catch (IllegalArgumentException e){//捕捉到不合法异常，定义一个值统一处理不存在于枚举类中的情况，相当于if else中else

            animalType = AnimalType.OTHERS;
        }

        return animalType;
    }
}
