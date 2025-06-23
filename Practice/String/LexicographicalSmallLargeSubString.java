package String;

public class LexicographicalSmallLargeSubString {

    public static void main(String[] args){
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        int n = s.length();

        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=1; i<=n-k; i++){
            String m = s.substring(i, i+k);
            if(m.compareTo(largest)>0){
                largest = m;
            }
            if(m.compareTo(smallest)<0){
                smallest = m;
            }
        }


        return smallest + "\n" + largest;
    }
}
