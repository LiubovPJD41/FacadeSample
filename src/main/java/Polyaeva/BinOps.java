package Polyaeva;

public class BinOps {
    public String sum(String a, String b) {
        int x = Integer.parseInt(a, 2);                  //Переведите числа из двоичной записи в
        int y = Integer.parseInt(b, 2);                  // строках в int, сложите и переведите
        int z = x + y;

        return Integer.toBinaryString(z);                      // обратно в двоичную запись
    }

    public String mult(String a, String b) {
        int x = Integer.parseInt(a, 2);                  //Переведите числа из двоичной записи в
        int y = Integer.parseInt(a, 2);                  // строках в int, перемножьте и переведите
        int z = x * y;

        return Integer.toBinaryString(z);                     // обратно в двоичную запись
    }
}
