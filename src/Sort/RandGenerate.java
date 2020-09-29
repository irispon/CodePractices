package Sort;

import java.util.Random;

import StdRandom.StdRandom;

public class RandGenerate {

	public static double[] GetDatas() {
	
		double[] random= new double[10000];
		
		for(int i =0;i<10000;i++) {
		random[i]=StdRandom.gaussian();
		
		}
		
		return random;
	}
	
	public static double[] GetDatas(int n) {
		
		double[] random= new double[n];
		
		for(int i =0;i<n;i++) {
		random[i]=StdRandom.gaussian();
		
		}
		
		return random;
	}
	
	public static int[] GetIntegerDatas(int n) {
		
		int[] random= new int[n];
		Random rand = new Random();
		
		for(int i =0;i<n;i++) {
		random[i]=rand.nextInt(100);
		
		}
		
		return random;
	}
}
//랜덤 10000을 생성하는 클래스입니다.