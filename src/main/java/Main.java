public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("1 + 5 = " + bins.sum("1", "101"));
        System.out.println("1 + 1 = " + bins.sum("1", "1"));
        System.out.println("4 + 4 = " + bins.sum("100", "100"));
        System.out.println("2 * 5 = " + bins.mult("10", "101"));
        System.out.println("2 * 3 = " + bins.mult("10", "11"));
        System.out.println("4 * 4 = " + bins.mult("100", "100"));
    }
}