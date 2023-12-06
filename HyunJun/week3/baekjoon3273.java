package HyunJun.character.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class baekjoon3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = toIntArray(br.readLine());
        int x = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        int cnt = 0;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == x) {
                cnt++;
                start++;
                end--;
            } else if (sum < x) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(cnt);
    }

    public static int[] toIntArray(String input) {
        return
                Arrays.stream(input.split("\\s"))
                        .mapToInt(Integer::parseInt).toArray();
    }
}



