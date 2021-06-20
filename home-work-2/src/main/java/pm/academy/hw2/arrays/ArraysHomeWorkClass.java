package pm.academy.hw2.arrays;

import java.util.StringTokenizer;

public class ArraysHomeWorkClass {

    public Integer sumValues(int[] array) {
        int res = 0;
        for(int i = 0; i < array.length; i++)
            res += array[i];
        return res;
    }

    public Integer getMaxValue(int[] array) {
        int res = 0;
        for(int i = 0; i < array.length; i++){
            if (i == 0 || res < array[i])
                res = array[i];
        }
        return res;
    }

    public Integer getIndexOfMinValue(int[] array) {
        int index = -1, temp = 0;
        for(int i = 0; i < array.length; i++){
            if(i == 0 || temp > array[i]){
                    temp = array[i];
                    index = i;
            }
        }
        return index;
    }

    public Integer countLetterAInString(String str) {
        return str.length() - str.replace("a", "").length();
    }

    public Boolean checkIfPalindromeString(String str) {
        StringBuffer rev = new StringBuffer(str.toLowerCase()).reverse();
        return str.toLowerCase().equals(rev.toString()) ? true : false;
    }
}
