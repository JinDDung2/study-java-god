package chapter4;

public class PrimitiveTypes {
    public static void main(String[] args) {
        Byte byteMin = -128;
        Byte byteMax = 127;
        System.out.println("byteMin = " + byteMin); // - 128
        System.out.println("byteMax = " + byteMax); // 127

        byteMin--;
        byteMax++;
        System.out.println("byteMin = " + byteMin); // 127
        System.out.println("byteMax = " + byteMax); // -128
    }
}
