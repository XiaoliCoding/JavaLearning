import java.util.Arrays;
import java.util.ArrayList;

public class ArrayPractice {
	public static void main(String [] args)
	{
		int [] Arr={2,1,3,4,5};
		int [] Arr1=new int[5];
		int [] Arr2={2,1,3,4,5};
		int i;
		//�����������Arr��ֵ
		for(i=0;i<Arr.length;i++)   
		{
			System.out.print(Arr[i]+" ");
			
		}
		System.out.println();  //����
		//���������е�Ԫ�أ���Arr�еڶ���Ԫ���𣬸���3��Ԫ�ص�Arr1�����У���Arr1�е�һ��Ԫ�ؿ�ʼ
		System.arraycopy(Arr,2,Arr1,0,3);  
		for(int j=0;j<3;j++)
		{
			System.out.print(Arr1[j]+" ");
		}
		System.out.println();//����
		 //�Ƚ���������Ĵ�С
		System.out.println(Arrays.equals(Arr,Arr1)); 
		System.out.println(Arrays.equals(Arr,Arr2));
		//����3�������е�λ��
		int loca = Arrays.binarySearch(Arr, 3);  
		System.out.println("3��λ���ǣ�" + loca +",Arr[" + loca + "]=" +Arr[loca]);
		//������Arr��������
		Arrays.sort(Arr);  
		System.out.print("����������Ϊ�� ");
		for(i=0;i<Arr.length;i++)
		{
		System.out.print(Arr[i] +" ");
		}
		System.out.println();//����
		//foreach��䣬inte������������
		for(int inte:Arr)  
		{
			System.out.print(inte);
		}
		System.out.println();//����
		 //��̬�����ʼ��
		ArrayList<String> A1 = new ArrayList<String>(); //StringΪ����
		A1.add("A");  //��̬���������Ԫ��
		A1.add("B");
		A1.add("C");
		for(i=0;i<A1.size();i++)  //�����̬�����е�Ԫ��
		{
			String A1Each = (String)A1.get(i);
			System.out.print(A1Each + " ");
		}
			A1.remove(1);  //ɾ���ڶ���Ԫ��
			A1.add(1,"1");  //�ڵڶ���λ���������1
			for(i=0;i<A1.size();i++)  //�����̬�����е�Ԫ��
			{
				String A1Each = (String)A1.get(i);
				System.out.print(A1Each + " ");
		}
		
	}
}
