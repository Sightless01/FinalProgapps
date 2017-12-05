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
    } // end of Fraction
    
    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return gcd(b, a % b);
        }
    } // end of gcd
    
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
    } // end of PolycarpAndLetters

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
    } // end of MaximBuysAnApartment
    
    public static long TheEternalImmortality() throws Exception {
        
	Scanner scan = new Scanner(System.in);
        
        long a;
        long b;
     
        a = scan.nextLong();
        b = scan.nextLong();
        
        long res = 1;
        
        for (long i = a + 1 ; i <= b ; i++) {
            res = (res % 10) * (i % 10);
            if (res % 10 == 0)
            break;
        } return (res % 10);
    } // end of TheEternalImmortality

	public static String BarkToUnlock(){
		
		Scanner scan = new Scanner(System.in);
		
		String pass = scan.next();
		int n = scan.nextInt();
		String[] words = new String[n];
		
		for (int i = 0 ; i < n ; i++){
			words[i] = scan.next();
		}

		for(int x = 0 ; x < n ; x++){
			
			for(int y = 0 ; y < n ; y++){
				String z = words[x] + words[y];
				
				if(z.contains(pass)){
					return ("YES");
				}
			}
		} return ("NO");
	} // end of BarkToUnlock

	public static String DidYouMean() {
        
        Scanner input = new Scanner(System.in);
        
        String string = input.next();
        int number = string.length();
        int count = 0;
        boolean isEqual = true;
        
        for (int i = 0; i < number; i++) {
            if ((string.charAt(i) == 'a') || (string.charAt(i) == 'o') || (string.charAt(i) == 'e') || (string.charAt(i) == 'i') || (string.charAt(i) == 'u')) {
                System.out.print(string.charAt(i));
                count = 0;
                isEqual = true;
            } else { 
                if (count == 0) {
                   System.out.print(string.charAt(i));
                   count++;
                } else if (count == 1) {
                    System.out.print(string.charAt(i));
                    isEqual = isEqual && ((string.charAt(i) == string.charAt(i - 1)));
                    count++;
                } else if (count > 1) {
                    if (isEqual && (string.charAt(i) == string.charAt(i - 1))) {
                        System.out.print(string.charAt(i));
                        count++;
                    } else {
                        System.out.print(" " + string.charAt(i));
                        count = 1;
                        isEqual = true;
                    }
                }
            }
        } return string;
    } // end of DidYouMean
	
	// justine garcia #868B
	public static String TimeRace (int h, int m, int s, int t1, int t2) {
		if (t1>t2) {
			int temp=t1; t1=t2; t2=temp; 
		}
		int ctr=0;
		if (t1<=h && h<t2) {
			ctr++;
		} else if (t1<=(double)m/5 && (double)m/5<t2) {
			ctr++;
		} else if (t1<(double)s/5 && (double)s/5<t2) {
			ctr++;
		} else {
			
		}
		if (ctr==0 || ctr==3) {
			return "YES";
		} else {
			return "NO";
		}
	} // end of TimeRace

	//Emeterio, Ricamelle 876A, 879A, 879B
	public static int TripForMeal(int first, int second, int third, int fourth){
		Scanner in = new Scanner(System.in);
		
		 first = in.nextInt();
		 second = in.nextInt();
		 third = in.nextInt();
		 fourth = in.nextInt();
		
		if (first == 1) {
			return (0);
			
		}else if (first == 2) {
			return (Math.min(second,third));
			
		}else if (second <= third && second <= fourth) {
			return ((first - 1) * second);
			
		}else if (third <= second && third < fourth) {
			return ((first - 1) * third);
			
		}else {
			return (Math.min(second, third) + (first - 2) * fourth);
		}
	}//end of 876A - trip for meal
	
	public static int boryaDiagnosis(int a, int b){
		 Scanner in = new Scanner(System.in);
        
        a = 0;
        b = in.nextInt();
        
        for (int x = 0; x < b; ++x){
         	int j = in.nextInt();
        	int k = in.nextInt();
        	
            while (j <= a){
              	j += k;
            } 
            a = j;
        } 
       	return (a);
    }//879A - borya's diagnosis
    
	public static long tableTennis(){
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		long j = in.nextLong();
		int b = in.nextInt();
		long k = 0;
		
		for(int x = 1; x < a; x++) {
			
		int c = in.nextInt();
			if(c > b) {
				k = 1;
				b = c;
			} else {
				k++;
			}
			if(k >= j) {
				break;
			}
		}
		return (b);
		
	}// end of 879B - Table Tennis 
	
	//Almayda, Audry Jane 851A, 877C, 870C
	public static int arpaAndAResearchInMexicanWave(int n, int k, int t) {
		
		Scanner kbd = new Scanner(System.in);
		n = kbd.nextInt();
		k = kbd.nextInt();
		t = kbd.nextInt();{

		if( t <= k && t <= n) {
			return (t);
		} else if(t <= n) {
			return (k);
		} else {
			return(Math.max(0, k - (t - n)));
		}
	}//end of 851 - Arpa and a Research in Mexican Wave

//fayps uncoverted 858C
	public class DidYouMean {

    		public static void main(String[] args) {

        		Scanner kbd = new Scanner(System.in);

        		String input = kbd.next();
       		 	int n = input.length();
        		int count = 0;
        		boolean isEqual = true;

        		for (int i = 0; i < n; i++) {
            		if ((input.charAt(i) == 'a') || (input.charAt(i) == 'e') || (input.charAt(i) == 'i') || (input.charAt(i) == 'o') || (input.charAt(i) == 'u')) {
                		System.out.print(input.charAt(i));
                		count = 0;
                		isEqual = true;
            		} else {
                		if (count == 0) {
                   		System.out.print(input.charAt(i));
                   		count++;
                		} else if (count == 1) {
                    		System.out.print(input.charAt(i));
                    		isEqual = isEqual && ((input.charAt(i) == input.charAt(i - 1)));
                   		 count++;
               		 } else
               		 if (count > 1) {
                		    if (isEqual && (input.charAt(i) == input.charAt(i - 1))) {
                 		       System.out.print(input.charAt(i));
                     		   count++;
                  		  } else {
                   		     System.out.print(" " + input.charAt(i));
                     		   count=1;
                    		    isEqual = true;
                   		 }
               		 }
           		 }
       		 }

    		}
		}//end of DidYouMean
		
		//Ivan Torcuato 859A
		public static int declinedFinalist(int numFinalist, String list) {
	
			Scanner scan = new Scanner(list);
			int num = Integer.parseInt(scan.next());
			boolean check = true;
			
			while (scan.hasNext()) {
				
				int nextNum = Integer.parseInt(scan.next());
				
				if (num <= nextNum) {
					
					num = nextNum;
					
				}
							
			}
			
			if (num >= 25) {
				
				return num - 25;
				
			} else {
				
				return 0;
				
			}
			
		}
		
		//Ivan Torcuato 788B
		 public static int nikitaAndStrings(String input) {

	        int fst = 0;
	        int snd = 0;
	        int trd = 0;
	        
	        for (int i = 0; i < input.length(); i++) {
	            
	            if (input.charAt(i) == 'a') {
	                
	                fst++;
	                trd++;
	                
	            } else {
	                
	                snd++;
	                
	            }
	            
	            snd = Math.max(fst, snd);
	            trd = Math.max(trd, snd);
	            
	        }
	        
	        return trd;
	        
	    }
} // end of Solution
