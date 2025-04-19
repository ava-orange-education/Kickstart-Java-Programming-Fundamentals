import java.util.concurrent.Callable;

class MyCalculatorExample implements Callable<Integer> {
    private int n;

    public MyCalculatorExample(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
