package Praktikum3.Materi;

public class ClassWrapper {
    public static void main(String[] args) {
        // Autoboxing - primitif ke wrapper
        int primitifInt = 100;
        Integer wrapperInt = primitifInt; // Autoboxing

        Integer anotherWrapper = 200;
        int anotherPrimitif = anotherWrapper; // Unboxing

        // String ke Wrapper/Primitif
        String strNumber = "123";
        String strDouble = "45.67";
        String strBoolean = "true";

        // Parse Methods
        int num = Integer.parseInt(strNumber);
        double decimal = Double.parseDouble(strDouble);
        boolean flag = Boolean.parseBoolean(strBoolean);

        System.out.println("Parse int: " + num);
        System.out.println("Parse double: " + decimal);
        System.out.println("Parse boolean: " + flag);

        Integer wrapperNum = Integer.valueOf(strNumber);
        Double wrapperDecimal = Double.valueOf(strDouble);

        System.out.println("Wrapper Integer: " + wrapperNum);
        System.out.println("Wrapper Double: " + wrapperDecimal);

        // Wrapper/Primitif ke String
        int value = 789;
        String strValue1 = Integer.toString(value);
        String strValue2 = String.valueOf(value);

        System.out.println("toString(): " + strValue1);
        System.out.println("valueOf(): " + strValue2);

        // Integer Methods
        System.out.println("Max Integer: " + Integer.MAX_VALUE);
        System.out.println("Min Integer: " + Integer.MIN_VALUE);

        // Konversi Sistem Bilangan
        int decimalNum = 255;
        System.out.println("Binary: " + Integer.toBinaryString(decimalNum));
        System.out.println("Octal: " + Integer.toOctalString(decimalNum));
        System.out.println("Hexadecimal: " + Integer.toHexString(decimalNum));

    }
}
