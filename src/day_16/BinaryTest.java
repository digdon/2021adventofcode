package day_16;

public class BinaryTest {

    public static void main(String[] args) {
        String test = "04005AC33890";

        if (test.length() % 2 != 0) {
            test = "0" + test;
        }
        
        for (int pos = 0; pos < test.length(); pos += 2) {
            int value = Integer.parseInt(test.substring(pos, pos + 2), 16);
            String binary = "0000000" + Integer.toBinaryString(value);
            binary = binary.substring(binary.length() - 8);
            System.out.println(binary);
        }
    }
}
