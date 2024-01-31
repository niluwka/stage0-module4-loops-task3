package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int p = 0;
        int n = 1;

        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(p);

            int x = p + n;
            p = n;
            n = x;
        }
    }
}
