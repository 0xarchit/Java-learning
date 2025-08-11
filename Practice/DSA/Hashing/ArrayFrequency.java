package DSA.Hashing;

import java.util.*;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] arr = {2,4,2,5,2};
        int n = arr.length;
        // int[] freq = new int[n];

        // for(int i = 0; i < n; i++){
        //     if(arr[i] >= 1 && arr[i] <= n){
        //         freq[arr[i]-1]++;
        //     }
        // }

        // List<Integer> lst = new ArrayList<>();
        // for(int count : freq){
        //     lst.add(count);
        // }

        // return lst;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            res.add(map.getOrDefault(i, 0));
        }
        System.out.println(map);
        System.out.println(res);
    }
}
