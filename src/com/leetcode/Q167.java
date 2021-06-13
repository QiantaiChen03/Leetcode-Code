package com.leetcode;

import java.util.HashMap;

public class Q167 {
    //Two Sum II - Input Array is Sorted
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        //HashSet<Integer> hs = new HashSet<Integer>();

        //key,value
        HashMap<Integer, Integer> hm = new HashMap();


        for(int i = 0; i < numbers.length; i++){

            int j = target - numbers[i];

            if(hm.containsKey(j)){
                result[0] = hm.get(j) + 1;
                result[1] = i + 1;;
                break;
            }else{
                hm.put(numbers[i] , i);
            }
            //System.out.println(hm);
        }



        return result;
    }
}
