import java.util.*;

public class Solution {
    public static String Fraction() {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        
        double max = 0.0;
        int numerator = 1;
        
        for(int i = 1; i <= n / 2; ++i) {
            int a = i;
            int b = n - i;
            
            if(gcd(a, b) == 1) {
              if (a > b * max) {
                max = a / b;
                numerator = i;
              }
            }
        }
        return (numerator+" "+(n - numerator));
    }
    
    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return gcd(b, a % b);
        }
    }
    
    public static int PolycarpAndLetters() {
        Scanner kb = new Scanner(System.in);

        int i = 0, answer = 0;
        int n = kb.nextInt();
        String s = kb.next();

        while (i != s.length()) {
            if (!Character.isLowerCase(s.charAt(i))) {
                ++i; continue;
            }

            Map<Character, Integer> uniques = new TreeMap<>();

            int j = i;

            while (j != s.length() && Character.isLowerCase(s.charAt(j))) {
                uniques.put(s.charAt(j), 1);

                ++j;
            }

            if (uniques.size() > answer) {
                answer = uniques.size();
            }

            i = j;
        }

        return answer;
    }

	    public static String MaximBuysAnApartment() {
        Long n, k;
        Scanner in = new Scanner(System.in);
        n = in.nextLong();
        k = in.nextLong();
        
        
        if(k == 0 || k == n) {
            System.out.println(0+" "+0);
        }
        
       Long max;
        if(n > 3 * k) {
            max = 2 * k;
        }
        else {
            max = n - k;
        }
        
       return (1 + " " + max);
    }
    
    public static long TheEternalImmortality() throws Exception {
        
	Scanner scan = new Scanner(System.in);
        
        long a, b;
     
        a = scan.nextLong();
        b = scan.nextLong();
        
        long res = 1;
        
        for (long i = a + 1; i <= b; i++) {
            res = (res % 10) * (i % 10);
            if (res % 10 == 0) break;
        }
        
        return (res % 10);
    }
    
}