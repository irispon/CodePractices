package Sort;

public class Sorts {

	static void SelectSort(double[] data) 
	{
		int pivot=-1;
		double tmp;
		
		
		for(int i =0;i<data.length-1;i++) 		
		{
			pivot = i;
			
			for(int j =i+1;j<data.length;j++) 
			{
				if(data[pivot]>data[j]) 
				{
				  pivot =j;
					
				}
				
			}
			
			if(pivot!=i)
			{
				tmp = data[i];
				data[i]=data[pivot];
				data[pivot] = tmp;
			}
			
			
		}
		
	}
	
	
	static void InstertSort(double[] data) 
	{


		double key;
		int j;
		
		for(int i =1;i<data.length;i++) 		
		{
	
			key = data[i];
			for(j =i-1;j>=0;j--) 
			{
				if(data[j]>key) 
				{
					data[j+1] = data[j];
					
					
				}else {
					
					break;
				}
				
				
				
			}
			
			data[j+1]=key;
			
		}
		
	}
	
	
	static void ShellShort(double[] data) {
		int h =1;
		double tmp;
		double key;
		while(h<data.length/3) {
			
			h=3*h+1;
			
		}
		
		
		while(h>=1) {
			for(int i = h; i<data.length;i++) {


				for(int j=i;j>=h&&data[j]<data[j-h];j-=h) 
				{
	
						tmp =data[j];
						data[j]=data[j-h];
						data[j-h]=tmp;
						
				}
					
					
				}
				
				h=h/3;
				
				
			}
			
			
		}
		
		

	
	
	static void Check(double[] data) //정렬 확인하는 함수
	{
		for(int i =0;i<10;i++) {
			
			System.out.print(" "+data[i]);
			
		}
		
	}
	
}
