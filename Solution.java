import java.util.*;

public class Solution {
    public static String getName(int x){
        ArrayList diary = new ArrayList();
        for (int i = 0;i < x;i++) {
            String name = tr.nextLine();
            if (diary.contains(name))
            {
               return ("YES");
            }
            else
            {
                return ("NO");
                diary.add(name);
            }
        }
    }// end of Tom Riddle's Diary @author:AlundayKylaKate(855A)

   public static String getPie(int a){
        int x[] = new int[a+1];
        int sumix[] = new int [a+1];

        for (int i = 0;i < a;i++)
        {
            x[i] = pie.nextInt();
        }

        sumix[a] = 0;
        int dope[] = new int [a+1];
        for (int i = a-1;i >= 0;i--)
        {
            sumix[i] = sumix[i+1] + x[i];
            dope[i] = Math.max(dope[i+1], sumix[i+1] - dope[i+1] + x[i]);
        }
        return (sumix[0] - dope[0]) + " " + dope[0]);
    }// end of Pie Rules @author:AlundayKylaKate(859C)


     public static int getFloor(int a, int b){
        int ab = 0;
        int[][] c = new int[b][2];

        for (int i = 0;i < b;i++)
        {
            c[i][0] = wf.nextInt();
            c[i][1] = wf.nextInt();
        }

        for (int i = 1;i <=100;i++)
        {
            boolean fail = false;
            for (int j = 0;j < b;j++)
            {
                if(0 <= i*c[j][1] - c[j][0] && i*c[j][1] - c[j][0] < i)
                {
                }
                else
                {
                    fail = true;
                    break;
                }
            }
            if(!fail)
            {
                if(ab == 0)
                {
                    ab = (int)Math.ceil((double)a/i);
                }
                else if (ab != (int)Math.ceil((double)a/i))
                {
                    ab = -1;
                }
            }
        }
        return ab;
    }// end of Which floor @author:AlundayKylaKate(858B)

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

    // @author Mendoza, Noelle (869B)
    public static long theEternalImmortality() throws Exception
    {

		Scanner scan = new Scanner(System.in);

        	long firstInput = scan.nextLong();
        	long secondInput = scan.nextLong();

        	long res = 1;

        	for(long i = firstInput + 1; i <= secondInput; i++)
        	{
            	res = (res % 10) * (i % 10);
            	if(res % 10 == 0)
            	break;
        	}
        	return (res % 10);
    } // end of TheEternalImmortality

	// @author Mendoza, Noelle (868A)
	public static String barkToUnlock()
	{

		Scanner scan = new Scanner(System.in);

		String pass = scan.next();
		int n = scan.nextInt();
		String[] words = new String[n];

		for(int i = 0; i < n; i++)
		{
			words[i] = scan.next();
		}

		for(int x = 0; x < n; x++)
		{
			for(int y = 0; y < n; y++)
			{
				String z = words[x] + words[y];

				if(z.contains(pass))
				{
					return ("YES");
				}
			}
		}
		return ("NO");
	} // end of BarkToUnlock

	// @author Mendoza, Noelle (858C)
	public static String didYouMean()
	{

        Scanner input = new Scanner(System.in);

        String string = input.next();
        int number = string.length();
        int count = 0;
        boolean isEqual = true;

        for(int i = 0; i < number; i++)
        {
            if((string.charAt(i) == 'a') || (string.charAt(i) == 'o') ||
               (string.charAt(i) == 'e') || (string.charAt(i) == 'i') ||
               (string.charAt(i) == 'u'))
            {
                System.out.print(string.charAt(i));
                count = 0;
                isEqual = true;
            }
            else
            {
                if(count == 0)
                {
					System.out.print(string.charAt(i));
                   	count++;
                }
                else if(count == 1)
                {
                    System.out.print(string.charAt(i));
                    isEqual = isEqual && ((string.charAt(i) == string.charAt(i - 1)));
                    count++;
                }
                else if(count > 1)
                {
                    if(isEqual && (string.charAt(i) == string.charAt(i - 1)))
                    {
                        System.out.print(string.charAt(i));
                        count++;
                    }
                    else
                    {
                        System.out.print(" " + string.charAt(i));
                        count = 1;
                        isEqual = true;
                    }
                }
            }
        }
        return string;
    } // end of DidYouMean

	

	//Emeterio, Ricamelle 865A, 879A, 879B
	public static int SaveTheProblem(int a) {
		Scanner in = new Scanner (System.in);

		if (a == 1) {
			return("1 1");
			return("1");

		} else {
			return((a - 1)*2+ " " +2);
			return("1 2");

		}
	}
	}//end of 865A - Save the Problem

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
			if(c > b) {				k = 1;
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

	//Almayda, Audry Jane 851A, 870C, 873A`
	public static int getSpectators(int n, int k, int t) {

		if( t <= k && t <= n) {
			return (t);
		} else if(t <= n) {
			return (k);
		} else {
			return(Math.max(0, k - (t - n)));
		}
	}//end of 851A - getSpectators

	public static int splitMaximum(int ans, int n, int t) {

		t = kbd.nextInt();
		while(t-- != 0) {
			n = kbd.nextInt();

			if(n == 1 || n == 2 || n == 3 || n == 5 || n == 7 || n == 11)
			{
			ans = -1;
			}
			else if (n % 2 == 1)
			{
			ans = (n - 9) / 4 + 1;
			}
			else
			{
			ans = n / 4;
		}
		return ans;
		}
	return t;

	}//end of 870C - splitMaximum

    public static int getChores(int numOfChores, int maxNumOfChores, int unitOfTime) {
        int numOfChores = sc.nextInt();
        int maxNumOfChores = sc.nextInt();
        int unitOfTime = sc.nextInt();
        int total = 0;

        for(int i = 0; i < numOfChores; i++) {

            if(i >= numOfChores - maxNumOfChores) {
                total += unitOfTime;
            } else {
                total += sc.nextInt();
            }

        }

        System.out.println(total);
    }//end of 873A - getChores





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

	//Viloria, Brendon Bruce 867A,859B,876A
	public static String getOffices(int data, int fracisco, int seattle){
            data= input.nextInt();
	    francisco = 0;
	    seattle = 0;
	    if(2 <= data && data <= 100)
	    {
	       String travels = input.next();
               for(int index = 1; i < data; i++) 
	       {
            	   if(travels.charAt(index - 1) == 'S' && travels.charAt(index) == 'F')
		   {
            		francisco++;
            	    }
		    else if(travels.charAt(index - 1) == 'F' && travels.charAt(index) == 'S')
		    {
                    	seattle++;
                    }
	        }
	     }
	     if(francisco > seattle)
	     {
		return "YES";
	     } 
	     else
	     {
	    	return "NO";
	     }
	}// end of 867A - between offices

	public static int getDistance(int data, int big){
	    data = input.nextInt();
	    big = -1;
	    if(1<=data && data<=1000000)
	    {
            	for(int index = 1; index < 1001; index++)
		{
			if(index * index >= data)
			{
			   big = i;
                       	   break;
             		}
            	}
	     }
	     if(big * big == data)
	     {
                return big * 4;
             }
	     else
	     {
        	big--;
        	int x = data - big * big;
        	if(x <= big)
		{
        	   return (2 * (big + big + 1));
        	}
		else
		{
       		   return ((big + 1) * 4);
            	}
             }
	}// end of 859B - lazy security guard

	public static int getMeal(int data, int distancea, int distanceb, int distancec, int sum, int times, int minimum, int pause){
		data = input.nextInt();
		distancea = input.nextInt();
		distanceb = input.nextInt();
		distancec = input.nextInt();
		sum = 0;
		times = 1;
		minimimum = Integer.MAX_VALUE;
		pause =1;

		while(times < data) {
			if(pause == 1)
			{
			   minimum = Math.min(distancea, distanceb);
			   if(minimum == distancea)
			   {
			      sum+=distancea;
			      pause=2;
			   }
			   else
			   {
			      sum+=distanceb;
		              pause=3;
		           }
		    	 }
			 else if(pause == 2)
			 {
		    	    minimum = Math.min(distancea, distancec);
		    	    if(minimum == distancea)
			    {
		    	       sum+=distancea;
		               pause=1;
		            }
			    else
			    {
		               sum+=distancec;
		               pause=3;
		            }
		         }
			else
			{
		    	    minimum = Math.min(distanceb, distancec);
		    	    if(minimum == distanceb) 
			    {
		    	       sum+=distanceb;
		    	       pause=1;
		    	    }
			    else
			    {
		    	       sum+=distancec;
		    	       pause=2;
		    	    }
		    	}
		        times++;
		     }
		     return sum;
	}// end of 876A - trip for a meal

	//  Justine Garcia
	public static String getWinner(String karenInput, String koyomiInput){
	    String karenArray[] = karenInput.split(" ");
	    String koyomiArray[] = koyomiInput.split(" ");
	    int counter = (int) Math.pow(2,array1.length);
	    if(counter % 2 == 0)  
            {
	    	return "Karen";
	    } 
	    else 
	    {
		return "Koyomi";
	    }
	}// end of getWinner


	// Justine Garcia
	public static int getMaximum(int digit,int pair){
  	    Scanner sc = new Scanner(System.in);
    	    int[] input = new int[n];
    	    for(int i = 0; i < digit; i++) 
	    {
                input[i]=sc.nextInt();
	    }
            if(pair == 1)
	    {
                Arrays.sort(input);
        	return input[0];
            }
	    else if(pair == 2) 
	    {
        	return (Math.max(input[0],input[digit-1]);
	    } 
	    else 
	    {
        	Arrays.sort(input);
                return input[digit-1];
	    }
        } // end of getMaximum()
		       
 	// justine garcia #868B
	public static String raceOfTime(int hour, int minute, int second, int time1, int time2){
	    if(time1 > time2)
	    {
      		int temporary = time1;
		time1 = time2;
		time2 = temporary;
	    }
	    int counter = 0;
	    if(time1 <= hour && hour < time2) 
	    {
	        counter++;
	    } 
	    else if(time1 <= (double)minute / 5 && (double)minute / 5 < time2) 
	    {
        	counter++;
	    } 
	    else if(time1 < (double)second / 5 && (double)second / 5 < time2) 
	    {
		counter++;
	    } 
	    else 
	    {
	    }
            if(ounter == 0 || counter == 3) 
	    {
                return "YES";
	    } 
	    else 
	    {
                return "NO";
	    }
	} // end of TimeRace


   	// Lovelyn Paris 877A
 	public static String alexBrokenContest(String s){
		String[] names={"Danil", "Olya", "Slava", "Ann","Nikita"};
		int count=0;
		for (int i=0;i<5 ;i++)
		{
			
			int index = s.indexOf(name[i]);
			while (index!=-1)
			{
				
				count++;
				index=s.indexOf(name[i],index+1);
			}
		}
		if(count==1)
		{
		
		System.out.println("YES");
		}
		else
		{

		System.out.println("NO");
		}
	}// end of Alex And Broken Contest @author:Paris,Lovelyn(877A)
	

	// Lovelyn Paris 875A
	public static String classroomWatch (int number) {
		ArrayList<Integer> answers = new ArrayList<>();

		for (int i=1; i<=9*9; i++) {
			if(number<=i)
				break;
			else {
				int variables1=number - i; 
				int variables2=0; 
				int variables3=variables1; 
				while(t > 0) {
					variables2+=variables3 % 10;
					variables3/=10;
				}
				if(variables2==i) 
					answers.add(x);
			}
		}

		System.out.println(answers.size());
		Collections.sort(answers);
		for (int i = 0; i < answers.size(); i++){
			System.out.print(answers.get(i) + " ");

		}

	}// end of Classroom Watch @author:Paris,Lovelyn(875A)
	
	// Lovelyn Paris 873B
	public static int balancedString(int r, String d) {
		HashMap<Integer,Integer> hash = new HashMap<>();
		int variable1 = 0;
		hash.put(0,-1);
		int m = 0;

		for(int i=0;i<r;i++){
			
			variable1 += d.charAt(i) == '1' ? 1 : -1;
			if(hash.get(variable1) == null)
				hash.put(variable1,i);
			else
				m = Math.max(m, i-hash.get(variable1));
		}
		System.out.println(m);
		sc.close();

    	}// end of 873B Balanced String @author:Paris,Lovelyn(873B)



	public static string fairGame(){
		Scanner kbd = new Scanner(System.in); //assuming no scanner for the class, otherwise use that
		int cardsNum = kbd.nextInt;
		int cards[] = new int[cardsNum+1];
		for (int i = 1; i < cardsNum+1; i++){
			cards[i] = kbd.nextInt();
		}

		Arrays.sort(cards);
		if(cards[1]==cards[cardsNum/2] && cards[(cardsNum/2)]==cards[cardsNum] && cards[1]!=cards[cardsNum]){
			return "YES" + cards[1] + " " + cards[cardsNum];
		} else return "NO";
	} // end of fair game

	public static long kRounding(){
		Scanner kbd = new Scanner(System.in); //see fairgame
		int input = kbd.nextInt();
		int Nput = input;
		int rounding = kbd.nextInt();

		int div2 = 0;
		int div5 = 0;

		while (input % 2 == 0){
			div2++;
			input = input/2;
		}
		while (input % 5 == 0){
			div5++;
			input = input/5;
		}

		int multiplierTwo = 1;
		int multiplierFive = 1;
		if(rounding - div2 > 0){
			multiplierTwo = (int) Math.pow(2, rounding - div2);
		}
		if(rounding - div5 > 0){
			multiplierFive = (int) Math.pow(5, rounding - div5)
		}

		return multiplierTwo*(long)multiplierFive*(long)Nput;
	} // end of k-rounding
	
	public class Chores {
	        Scanner kbd = new Scanner(System.in);
	        int n = 0;
	        int k = 0;
	        int x = 0;
	        int sum = 0, 

	        n = jin.nextInt();
	        k = jin.nextInt();
	        x = jin.nextInt();
	        for(int i = 0; i < n-k; i++){
	        	int ctr = kbd.nextInt();
	        	sum += ctr;
	        	}
	        return (sum +k*x);
	}

} // end of Solution
