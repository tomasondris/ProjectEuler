package sk.tho.euler;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ProjectEuler {

    private static boolean[] primes = new boolean[500000]; 	
    private static int[] stvorce = new int[500+7]; 	
    private static int[] prvocisla = new int[50000]; 	
    
	
	public static void main(String[] args) {

		String input;
		int line = 0;
		int testNum;
	    int[] testCases;
	    
	    fillPrimes();
	    naplnStvorce();
	    naplnPrvocisla();
	    
	    Scanner in = new Scanner(System.in);

	    System.out.println("Zadajte cislo:");
    	input = in.nextLine();

    	testNum = Integer.parseInt(input);
	    testCases = new int[testNum];

	    int i = 0;

	    while(i < testNum) {
    		input = in.nextLine();
    		testCases[i] = Integer.parseInt(input);
    		i++;
	    }

	    for(Integer t : testCases) {
           //if(t != null) {
        	   //if (t%2 != 0) {
        		   System.out.println(goldenbach(t));
        	   //}
           //}
	    }	    
	}

	private static void fillPrimes() {
	      Arrays.fill(primes,true);
	      primes[0]=primes[1]=false;
	      for (int i=2;i<primes.length;i++) {
	          if(primes[i]) {
	              for (int j=2;i*j<primes.length;j++) {
	                  primes[i*j]=false;
	              }
	          }
	      }
	  } 	
	
	private static void naplnStvorce () {
	    Arrays.fill(stvorce,0);
		
		for(int q=1;q<501;q++) {
			stvorce[q-1] = q*q*2;
			System.out.println(stvorce[q]);
		}
	}

	private static void naplnPrvocisla () {
	    int p = 0;
		Arrays.fill(prvocisla,0);
		
		for(int q=0;q<500000;q++) {
			if (isPrime(q)) {
				prvocisla[p++] = q;
				System.out.println(prvocisla[p-1]);
			}
		}

	}
	
	
//	private static int goldenbach (int i) {
//	    int gb = 0;
//	    double temp;
//	    
//	    if (!isPrime(i)) {
//	    	for (int x=3; x<i; x+=2) {
//				if (x<i) {
//					if (isPrime(x)==true) {
//						for (int q=0; q<i; q++) {
//							temp = (double)(x + 2 * Math.pow((double)q, 2));
//							//System.out.println(temp);
//
//								if ((double)i == temp) {
//									gb++;
//									//System.out.println("!!!");
//									break;
//								}
//								else if (temp>i) break;							
//							
//						}
//					}
//				}
//				else break;
//			}		
//	    } 
//
//	    return gb;
//	}

	private static int goldenbach (int i) {
	    int gb = 0;
	    
	    	for (int x=9; x<i; x+=2) {

	    		//if ( primes[] + stvorce[] == i) gb++;
	    		
			}		

	    return gb;
	}
	
	private static boolean isPrime (int i) {
		return primes[i];
	}
}
