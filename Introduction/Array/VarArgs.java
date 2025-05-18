package Array;

public class VarArgs {
    public static void main(String[] args){
        System.out.println(add(1,2,3,4,5,6,7,8,9,10));
    }
    static int add(int... nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }
}
