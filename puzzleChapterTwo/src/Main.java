// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();

        int x = 0;
        while (x< 4){
            e1.hello();
            e1.count = e1.count + 1;
            if (x == 3) {
              e2.count = e2.count + 1;n
            }
            if (x > 0){
                e2.count = e2.count + e1.count;
            }
            x++;
        }
        System.out.println(e2.count);
    }
}