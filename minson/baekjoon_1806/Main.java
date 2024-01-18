package stonehee.baekjoon.minson.baekjoon_1806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0;
        int len = Integer.MAX_VALUE;
        int sum = 0;
        while(start <= end && end <= n) {
            if(sum < s) {
                sum += arr[end++];
            } else if(sum >= s) {
                len = Math.min(len, end-start);
                sum -= arr[start++];
            }
        }
        System.out.println(len == Integer.MAX_VALUE ? 0 : len);
    }
}

//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int min = Integer.MAX_VALUE;
//        int max = 0;
//        int length = 0;
//        int sum = 0;
//        int N = Integer.parseInt(st.nextToken());
//        int S = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        int[] numbers = new int[N];
//        for (int i = 0; i < N; i++) {
//            numbers[i] = Integer.parseInt(st.nextToken());
//            sum += numbers[i];
//            length++;
//            if (sum >= S) {
//                min = Integer.min(length, min);
//                max = Integer.max(max, sum);
//                sum = numbers[i];
//                length = 1;
//            }
//        }
//        System.out.println(max >= S ? min : 0);
//        br.close();
//    }
//}
