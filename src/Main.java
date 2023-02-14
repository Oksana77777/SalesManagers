public class Main {

    public static void main(String[] args) {
        int[] sales = new int[]{7, 8, 777, 888};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        System.out.println(max);

    }
}

