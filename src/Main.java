public class Main {

    public static void main(String[] args) {
       long[] sales = new long[]{7, 8, 777, 888};
        SalesManager salesManager = new SalesManager(sales);
        long max = salesManager.max();
        System.out.println(max);

    }
}

