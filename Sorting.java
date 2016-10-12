package Sorting;
import java.util.Arrays;
import java.util.Random;

public class Sorting {
	//冒泡排序    两两比较，逆序交换
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
		System.out.println("冒泡排序后的数组为：" + Arrays.toString(a));
	}
	//选择排序  每个元素依次与第一个元素比较，选出最小的元素放在第一个位置，进行第二个位置的比较，经过n-1轮完成排序
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
		System.out.println("选择排序后的数组为：" + Arrays.toString(a));
	}
	//插入排序    将后部分的每个元素逐一与前部分每个元素比较，如果当前元素小就替换
	void InsertionSortDemo(int a[]){
		int i,j,k;
		for(i = 1;i < a.length;i++){
			k = a[i];//取出待插入元素
			//找到插入位置
			for(j = i-1;j > 0 && a[j] > k;j--){
				a[j+1] = a[j];
			}
			//插入元素
			a[j+1] = k;
		}
		System.out.println("插入排序后的数组为：" + Arrays.toString(a));
	}
	//快速排序  选定基准值，设置low所对应的元素位置为基准值 在low<high的条件下，判断高位值是否大于基准值，若符合继续寻找，直到找到不符合的情况，把值赋给低位所在位置；
	//对低位进行相似的处理，寻找大于基准值的数停止，递归处理基准值两侧
	void QuickSortDemo(int a[],int low,int high){
		if(low < high){
			int pivot,p_pos,i;
			p_pos = low;//索引位为0位置
			pivot = a[p_pos];//设置基准值为第一个元素的值
            for(i = low + 1;i <= high;i++){
            	if(a[i] > pivot){//1位置的数与0位置的数进行比较a[1]>a[0]
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
    	System.out.println("使用java.util.Arrays中的方法输出数组" + Arrays.toString(a));
    	Sorting S = new Sorting();
    	S.BubbleSortDemo(a);
    	S.SelectSortDemo(a);
    	S.InsertionSortDemo(a);
    	S.QuickSortDemo(b, 0, b.length-1);
    	System.out.println("快速排序后的数组为：" + Arrays.toString(b));
    	//输出的数组a为排完序的数组
    	System.out.println("使用java.util.Arrays中的方法输出数组" + Arrays.toString(a));
    	Arrays.sort(c);//对数组C进行排序
    	System.out.println("使用java.util.Arrays中的方法排序数组" + Arrays.toString(c));
    	int index = Arrays.binarySearch(c, 44);//使用这个函数时，数组应为排完序的数组
    	System.out.println("使用java.util.Arrays中的方法查找数组中11的位置为：" + index);
    	//随机生成五个数，并对这五个数进行排序
    	Random R = new Random();
    	int r[] = new int[5]; 
    	for(int i = 0;i < r.length;i++){
    		r[i] = R.nextInt(100);
    	}
    	Arrays.sort(r);
       System.out.println("排序后的随机数组为：" + Arrays.toString(r));    	
    }
}
