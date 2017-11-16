package algorithm;

/*
*  Created by WangDi on 2017\11\8 0008
*/

public class JudgeHuiwen {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
//        System.out.println(getHuiWen(12321));
        getHuiWen2(12321);
    }

    static String getHuiWen(int num){

        String needStr = null;
        String result = new Integer(num).toString();
        for (int i = 0; i < result.length(); i++) {

            if(result.charAt(i) != result.charAt(result.length() - i - 1)){
                needStr = "不是";
            }else{
                needStr = "是";
            }
        }
        return needStr;
    }

    static String getHuiWen2(int i){

        String needStr = null;
        String oldStr = String.valueOf(i);
        StringBuilder sb = new StringBuilder(i);
        String newStr = sb.reverse().toString();
        if(oldStr.equals(newStr)){
            System.out.println("是");
        }else{
            System.out.println("不是");
        }
        return needStr;
    }
}
