package algorithm;

/*
*  Created by WangDi on 2017/10/31 0031
*/

//必须采用顺序存储结构
public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1,3,5,7,12,14,16,21};
        System.out.println(binarySerach(array,4));

    }

    public static int binarySerach(int[] argArray,int des){

        int low = 0;
        int high = argArray.length - 1;

        while (low <= high){

            int middle = (low + high)/2;
            if(des == argArray[middle]){

                return middle;
            }else if(des < argArray[middle]){

                high = middle - 1;
            }else{

                low = middle + 1;
            }
        }
        return  -1;
    }
}
