package test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class ForkJoinAdd2 extends RecursiveTask<Long> {

    private final long[] numbers;
    private final int start;
    private final int end;
    public static final long threshold = 10_000;

    public ForkJoinAdd2(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    private ForkJoinAdd2(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {

        int length = end - start;
        if (length <= threshold) {
            return add();
        }

        ForkJoinAdd2 firstTask = new ForkJoinAdd2(numbers, start, start + length / 2);
        firstTask.fork(); 

        ForkJoinAdd2 secondTask = new ForkJoinAdd2(numbers, start + length / 2, end);
        secondTask.fork();

        Long secondTaskResult = secondTask.join();
        Long firstTaskResult = firstTask.join();

        return firstTaskResult + secondTaskResult;

    }

    private long add() {
        long result = 0;
        for (int i = start; i < end; i++) {
            result += numbers[i];
        }
        return result;
    }

    public static long startForkJoinSum(long n) {
        long[] numbers = LongStream.rangeClosed(1, n).toArray();
        ForkJoinTask<Long> task = new ForkJoinAdd(numbers);
        return new ForkJoinPool().invoke(task);
    }

}