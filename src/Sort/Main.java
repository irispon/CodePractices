package Sort;

import StdRandom.*;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	//������ ����
		double[] random = RandGenerate.GetDatas();
		long beforeTime = System.currentTimeMillis();
		Sorts.SelectSort(random);	
		long afterTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
		long secDiffTime = (afterTime - beforeTime); //�� �ð��� �� ���
	
		System.out.println("������ ���� �ҿ�ð� : "+secDiffTime/1000.0);
	//������ ����	
		
   //���� ����
		random = RandGenerate.GetDatas();
		beforeTime = System.currentTimeMillis();
		
		Sorts.InstertSort(random);
		
		afterTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
		secDiffTime = (afterTime - beforeTime); //�� �ð��� �� ���
		System.out.println("�������� �ҿ� �ð� : "+secDiffTime/1000.0);
   //���� ����	

   //������
		random = RandGenerate.GetDatas();
		beforeTime = System.currentTimeMillis();
		Sorts.ShellShort(random);
		afterTime = System.currentTimeMillis();
		secDiffTime = (afterTime - beforeTime);
		System.out.println("������ �ҿ� �ð� : "+secDiffTime/1000.0);
   //������
		
		
		

		beforeTime = System.currentTimeMillis();
		Sorts.InstertSort(random);
		afterTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
		secDiffTime = (afterTime - beforeTime); //�� �ð��� �� ���
		System.out.println("���ĵǾ��� ���� �ҿ�ð�(����) : "+secDiffTime/1000.0);
		
		
		beforeTime = System.currentTimeMillis();
		Sorts.SelectSort(random);
		afterTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
		secDiffTime = (afterTime - beforeTime); //�� �ð��� �� ���
		System.out.println("���ĵǾ��� ���� �ҿ�ð�(����Ʈ) : "+secDiffTime/1000.0);
		
		
		
		beforeTime = System.currentTimeMillis();
		Sorts.ShellShort(random);
		afterTime = System.currentTimeMillis();
		secDiffTime = (afterTime - beforeTime);
		System.out.println("���ĵǾ��� ���� �ҿ�ð�(����Ʈ) : "+secDiffTime/1000.0);
	
	
	}

	

	

	
	
}
