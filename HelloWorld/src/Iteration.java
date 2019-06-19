import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Iteration {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        int max = nums.get(0);
        for (int n : nums) {

            if (n > max) {
                max = n;
            }
        }
        System.out.println("Max number: " + max);

        int min = nums.get(0);
        for (int n : nums) {

            if (n < min) {
                min = n;
            }
        }
        System.out.println("Min number:" + min);
        List<Integer> evenNums = new ArrayList<>(nums);
        ArrayList<Integer> toRemoveOdd = new ArrayList<Integer>();
        for (int n : nums) {
            if (n % 2 != 0) {
                toRemoveOdd.add(n);
            }
        }
        evenNums.removeAll(toRemoveOdd);
        System.out.println("Even number list: " + evenNums);

        List<Integer> oddNums = new ArrayList<>(nums);
        ArrayList<Integer> toRemoveEven = new ArrayList<Integer>();
        for (int n : nums) {
            if (n % 2 == 0) {
                toRemoveEven.add(n);
            }
        }
        oddNums.removeAll(toRemoveEven);
        System.out.println("Odd number list: " + oddNums);

        int sum = 0;
        for (int n : nums) {
            sum = sum + n;

        }
        System.out.println("Sum: " + sum);

        List<Integer> sqEvenMin = new ArrayList<>(nums);
        ArrayList<Integer> toRemEven = new ArrayList<Integer>();
        for (int n : nums) {
            int sq = n * n;
            if (sq % 2 != 0) {
                toRemEven.add(sq);
            }
        }
        int minSq = toRemEven.get(0);
        for (int n : toRemEven) {

            if (n < minSq) {
                minSq = n;
            }
        }
        System.out.println("The square even min value is: " + minSq);
        int maxStream = nums.stream()
                .filter(x -> x % 2 == 0)
                .map(i -> i * i)
                .reduce((a, b) -> Math.max(a, b))
                .get();
        System.out.println(maxStream);
        int minStream = nums.stream()
                .filter(x -> x % 2 == 0)
                .map(i -> i * i)
                .reduce((a, b) -> Math.min(a, b))
                .get();
        System.out.println(minStream);
        List<Integer> evenStream = nums.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenStream);

        List<Integer> oddStream = nums.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddStream);

        int sumStream = nums.stream()

                .reduce((a, b) -> a + b)
                .get();
        System.out.println(sumStream);

        int sumSqStream = nums.stream()
                .map(i -> i * i)
                .filter(x -> x % 2 != 0)
                .reduce((a, b) -> Math.min(a,b))
                .get();
        System.out.println(sumSqStream);

//						.forEach(i -> System.out.println(i));
    }
}

