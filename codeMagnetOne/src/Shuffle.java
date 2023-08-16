public class Shuffle {
    public static void main(String[] args) {
        int x = 0, y = 0;

        while( x < 5){
            if ( y < 5){
                x = x + 1;
                if ( y < 3){
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print(x + "" + y + " ");
            x += 1;
        }

//        while (x > 0){
//            if (x > 2){
//                System.out.print("a");
//            }
//            x = x - 1;
//            System.out.print("-");
//            if (x == 2){
//                System.out.print("b c");
//            }
//            x = x - 1;
//            System.out.print("-");
//            if (x == 1) {
//                System.out.print("d");
//                x -= 1;
//            }
//        }


    }
}