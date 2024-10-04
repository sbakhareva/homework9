public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
            System.out.println(sum);
        }
    }
}