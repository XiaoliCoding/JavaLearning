package Sorting;
import java.util.Arrays;
import java.util.Random;

public class Sorting {
	//ð������    �����Ƚϣ����򽻻�
	void BubbleSortDemo(int a[]){
		for(int i = 0;i < a.length-1;i++){
			for(int j = 0;j < a.length-i-1;j++){
				if(a[j+1] < a[j]){
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("ð������������Ϊ��" + Arrays.toString(a));
	}
	//ѡ������  ÿ��Ԫ���������һ��Ԫ�رȽϣ�ѡ����С��Ԫ�ط��ڵ�һ��λ�ã����еڶ���λ�õıȽϣ�����n-1���������
	void SelectSortDemo(int a[]){
		for(int i = 0;i< a.length-1;i++){
			for(int j = i+1;j < a.length; j++){
				if(a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("ѡ������������Ϊ��" + Arrays.toString(a));
	}
	//��������    ���󲿷ֵ�ÿ��Ԫ����һ��ǰ����ÿ��Ԫ�رȽϣ������ǰԪ��С���滻
	void InsertionSortDemo(int a[]){
		int i,j,k;
		for(i = 1;i < a.length;i++){
			k = a[i];//ȡ��������Ԫ��
			//�ҵ�����λ��
			for(j = i-1;j > 0 && a[j] > k;j--){
				a[j+1] = a[j];
			}
			//����Ԫ��
			a[j+1] = k;
		}
		System.out.println("��������������Ϊ��" + Arrays.toString(a));
	}
	//��������  ѡ����׼ֵ������low����Ӧ��Ԫ��λ��Ϊ��׼ֵ ��low<high�������£��жϸ�λֵ�Ƿ���ڻ�׼ֵ�������ϼ���Ѱ�ң�ֱ���ҵ������ϵ��������ֵ������λ����λ�ã�
	//�Ե�λ�������ƵĴ���Ѱ�Ҵ��ڻ�׼ֵ����ֹͣ���ݹ鴦���׼ֵ����
	void QuickSortDemo(int a[],int low,int high){
		if(low < high){
			int pivot,p_pos,i;
			p_pos = low;//����λΪ0λ��
			pivot = a[p_pos];//���û�׼ֵΪ��һ��Ԫ�ص�ֵ
            for(i = low + 1;i <= high;i++){
            	if(a[i] > pivot){//1λ�õ�����0λ�õ������бȽ�a[1]>a[0]
            		p_pos ++;
            		int temp = a[p_pos];
            		a[p_pos] = a[i];
            		a[i] = temp;
            	}
            }
            int temp1 = a[low];
            a[low] = a[p_pos];
            a[p_pos] = temp1;
            QuickSortDemo(a,low,p_pos-1);
            QuickSortDemo(a,p_pos+1,high);
		}
	}
    public static void main(String [] args){
    	int a[] = {7,5,3,6,7,8,9,2};
    	int b[] = {33,4,5,77,3,8,9};
    	int c[] = {22,11,55,44,33,44,66};
    	System.out.println("ʹ��java.util.Arrays�еķ����������" + Arrays.toString(a));
    	Sorting S = new Sorting();
    	S.BubbleSortDemo(a);
    	S.SelectSortDemo(a);
    	S.InsertionSortDemo(a);
    	S.QuickSortDemo(b, 0, b.length-1);
    	System.out.println("��������������Ϊ��" + Arrays.toString(b));
    	//���������aΪ�����������
    	System.out.println("ʹ��java.util.Arrays�еķ����������" + Arrays.toString(a));
    	Arrays.sort(c);//������C��������
    	System.out.println("ʹ��java.util.Arrays�еķ�����������" + Arrays.toString(c));
    	int index = Arrays.binarySearch(c, 44);//ʹ���������ʱ������ӦΪ�����������
    	System.out.println("ʹ��java.util.Arrays�еķ�������������11��λ��Ϊ��" + index);
    	//���������������������������������
    	Random R = new Random();
    	int r[] = new int[5]; 
    	for(int i = 0;i < r.length;i++){
    		r[i] = R.nextInt(100);
    	}
    	Arrays.sort(r);
       System.out.println("�������������Ϊ��" + Arrays.toString(r));    	
    }
}
