package DataTypes;

public class EX_1_2_15 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println(!((a >= (b + c)) || (b >= (a + c)) || (c >= (a + b))));
    }
}