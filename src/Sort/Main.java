package Sort;

import StdRandom.*;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	//셀렉션 정렬
		double[] random = RandGenerate.GetDatas();
		long beforeTime = System.currentTimeMillis();
		Sorts.SelectSort(random);	
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
	
		System.out.println("셀렉션 정렬 소요시간 : "+secDiffTime/1000.0);
	//셀렉션 정렬	
		
   //삽입 정렬
		random = RandGenerate.GetDatas();
		beforeTime = System.currentTimeMillis();
		
		Sorts.InstertSort(random);
		
		afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
		System.out.println("삽입정렬 소요 시간 : "+secDiffTime/1000.0);
   //삽입 정렬	

   //쉘정렬
		random = RandGenerate.GetDatas();
		beforeTime = System.currentTimeMillis();
		Sorts.ShellShort(random);
		afterTime = System.currentTimeMillis();
		secDiffTime = (afterTime - beforeTime);
		System.out.println("쉘정렬 소요 시간 : "+secDiffTime/1000.0);
   //쉘정렬
		
		
		

		beforeTime = System.currentTimeMillis();
		Sorts.InstertSort(random);
		afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
		System.out.println("정렬되었을 때의 소요시간(삽입) : "+secDiffTime/1000.0);
		
		
		beforeTime = System.currentTimeMillis();
		Sorts.SelectSort(random);
		afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
		System.out.println("정렬되었을 때의 소요시간(셀렉트) : "+secDiffTime/1000.0);
		
		
		
		beforeTime = System.currentTimeMillis();
		Sorts.ShellShort(random);
		afterTime = System.currentTimeMillis();
		secDiffTime = (afterTime - beforeTime);
		System.out.println("정렬되었을 때의 소요시간(쉘소트) : "+secDiffTime/1000.0);
	
	
	}

	

	

	
	
}
