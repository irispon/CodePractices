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
//���� 10000�� �����ϴ� Ŭ�����Դϴ�.