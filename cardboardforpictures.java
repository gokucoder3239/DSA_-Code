import java.util.*;
 
class cardBoardforpictures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
 
            long[] s = new long[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.nextLong();
            }
 
            long low = 1, high = (long)2e9;
            long answer = 1;
 
            while (low <= high) {
                long mid = (low + high) / 2;
 
                long total = 0;
                boolean overflow = false;
 
                for (long x : s) {
                    long side = x + 2 * mid;
                    long area = side * side;
 
                    total += area;
 
                    if (total > c) {   // Avoid unnecessary work
                        overflow = true;
                        break;
                    }
                }
 
                if (!overflow && total <= c) {
                    answer = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}