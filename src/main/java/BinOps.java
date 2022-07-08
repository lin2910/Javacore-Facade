public class BinOps {
    public String sum(String a, String b) {
        return Integer.toBinaryString(
                Integer.parseInt(a, 2)
                        + Integer.parseInt(b, 2));
    }

    public String mult(String a, String b) {
        return Integer.toBinaryString(
                Integer.parseInt(a, 2)
                        * Integer.parseInt(b, 2));
    }

    private static int intToBin(int str) {
        int deg = 1;
        int result = 0;
        while (str > 0) {
            result += str % 10 * deg;
            deg *= 2;
            str /= 10;
        }
        return result;
    }
}