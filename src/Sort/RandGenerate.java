package Sort;

import StdRandom.StdRandom;

public class RandGenerate {

	static double[] GetDatas() {
	
		double[] random= new double[10000];
		
		for(int i =0;i<10000;i++) {
		random[i]=StdRandom.gaussian();
		
		}
		
		return random;
	}
}
//랜덤 10000을 생성하는 클래스입니다.