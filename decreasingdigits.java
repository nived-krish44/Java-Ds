public class decreasingdigits {
    public int monotoneIncreasingDigits(int n) {
        int str = n;
        int no = String.valueOf(str).length();
        int[] arr = new int[no];
        int k = 0;

        // Store digits in array
        while (n != 0) {
            arr[no - 1 - k] = n % 10;
            n = n / 10;
            k++;
        }

        int i = 1;
        // Find the point where the digits are not increasing
        while (i < no && arr[i] >= arr[i - 1]) {
            i++;
        }

        // If no decrease is found, return the original number
        if (i == no) {
            return str;
        }

        // Adjust digits to make the number monotone increasing
        while (i > 0 && arr[i] < arr[i - 1]) {
            arr[i - 1]--;
            i--;
        }

        // Set all digits after the decrease point to 9
        for (i += 1; i < no; i++) {
            arr[i] = 9;
        }

        // Convert array back to integer
        int res = 0;
        for (i = 0; i < no; i++) {
            res = res * 10 + arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        decreasingdigits solution = new decreasingdigits();
        int result = solution.monotoneIncreasingDigits(887);
        System.out.println(result);  // Output should be 299
    }
}
    

