package Praktikum3;

public class OperatorBitwise {
    public static void main(String[] args) {
        int a = 12; // 1100 dalam biner
        int b = 10; // 1010 dalam biner

        System.out.println("a & b = " + (a & b)); // AND: 8 (1000)
        System.out.println("a | b = " + (a | b)); // OR: 14 (1110)
        System.out.println("a ^ b = " + (a ^ b)); // XOR: 6 (0110)
        System.out.println("~a = " + (~a)); // NOT: -13
        System.out.println("a << 1 = " + (a << 2)); // Shift Left: 48 (110000)
        System.out.println("a >> 1 = " + (a >> 2)); // Shift Right: 3 (0011)
    }
}
