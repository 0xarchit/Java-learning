package src;

public class BrkCont {
    public static void main(String[] args){
//        for (int i = 0; i <= 10; i++){
//
//            if(i == 3){
//                continue;
//            } else if (i == 7) {
//                break;
//            }
//
//            System.out.println(i + " ");
//        }

        for (int i = 0; i <= 10; i++){

            if(i % 3 == 0){
                continue;
            } else if (i == 7) {
                break;
            }

            System.out.println(i + " ");
        }

    }
}
