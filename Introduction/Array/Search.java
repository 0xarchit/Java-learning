package Array;

import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] nums = {1,2,3,4,567,78,3,2,1,3};
//        int target = 111;
        int target = 2;
        boolean isFound = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                System.out.println("Found at index " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Not Found");
        }
    }
}
