
public class FrequencyCounter {
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 3, 5};
        int P = 5;
        int N = arr.length;
        frequencyCountt(arr, N, P);
    }

    public static void frequencyCountt(int arr[], int N, int P) {
        // do modify in the given array
        int[] ans = new int[P + 1];  // Create an array to hold frequencies from 1 to P

        // Count frequencies
        for (int i = 0; i < N; i++) {
            if (arr[i] <= P) {
                ans[arr[i]]++;  // Increment the count for the value in arr
            }
        }

        // Copy results back into arr (optional, if you want to modify arr directly)
        for (int i = 0; i < P; i++) {
            arr[i] = ans[i + 1]; // Populate arr with frequencies
        }

        // Output the frequencies
        for (int i = 1; i <= P; i++) {
            System.out.println("Frequency of " + i + ": " + ans[i]);
        }
    }
}


