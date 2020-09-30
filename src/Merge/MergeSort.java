package Merge;

import Sort.Sorts;

public class MergeSort {

	public void sort(Comparable[] arr,Comparable[] aux, int begin, int end) {

		if(end-begin<7) {
			
			Sorts.InstertSort(arr,begin,end);
			return;
		}
		

			int mid =(begin+end)/2;
			sort(arr,aux,begin,mid);
			sort(arr,aux,mid+1,end);
			if(arr[mid].compareTo(arr[mid+1])!=1) {
				return;
			}else {
				
				merge(arr,aux,begin,mid,end);

			}
	


		
	}

	private void merge(Comparable[] arr, Comparable[] aux, int begin, int mid, int end) {
		// TODO Auto-generated method stub
		int i = begin;
		int j = mid+1;
		int k = begin;
		

		while(i<=mid && j<=end) {
			
			if(arr[i].compareTo(arr[j])<=-1) {
				aux[k]= arr[i];
				i++;
			}else {
				
				aux[k]=arr[j];
				j++;
			}
			k++;
			
		}
		
		 if(i>mid) { 
			 
			 for(int t=j;t<=end;t++,k++)	{
				 
				 aux[k] = arr[t];
				 
			 }
			 
		 }else {
			 for(int t=i;t<=mid;t++,k++) {
				 
				 aux[k]=arr[t];
			 }
			 
		 }
		
		 for(int t =begin;t<=end;t++) {
			 
			 arr[t] = aux[t];
		 }
	
	}
	

	
}