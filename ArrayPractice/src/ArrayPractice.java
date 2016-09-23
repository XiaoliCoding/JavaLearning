import java.util.Arrays;
import java.util.ArrayList;

public class ArrayPractice {
	public static void main(String [] args)
	{
		int [] Arr={2,1,3,4,5};
		int [] Arr1=new int[5];
		int [] Arr2={2,1,3,4,5};
		int i;
		//依次输出数组Arr的值
		for(i=0;i<Arr.length;i++)   
		{
			System.out.print(Arr[i]+" ");
			
		}
		System.out.println();  //换行
		//复制数组中的元素，从Arr中第二个元素起，复制3个元素到Arr1数组中，从Arr1中第一个元素开始
		System.arraycopy(Arr,2,Arr1,0,3);  
		for(int j=0;j<3;j++)
		{
			System.out.print(Arr1[j]+" ");
		}
		System.out.println();//换行
		 //比较两个数组的大小
		System.out.println(Arrays.equals(Arr,Arr1)); 
		System.out.println(Arrays.equals(Arr,Arr2));
		//查找3在数组中的位置
		int loca = Arrays.binarySearch(Arr, 3);  
		System.out.println("3的位置是：" + loca +",Arr[" + loca + "]=" +Arr[loca]);
		//对数组Arr进行排序
		Arrays.sort(Arr);  
		System.out.print("排序后的数组为： ");
		for(i=0;i<Arr.length;i++)
		{
		System.out.print(Arr[i] +" ");
		}
		System.out.println();//换行
		//foreach语句，inte是随便起的名字
		for(int inte:Arr)  
		{
			System.out.print(inte);
		}
		System.out.println();//换行
		 //动态数组初始化
		ArrayList<String> A1 = new ArrayList<String>(); //String为类型
		A1.add("A");  //向动态数组中添加元素
		A1.add("B");
		A1.add("C");
		for(i=0;i<A1.size();i++)  //输出动态数组中的元素
		{
			String A1Each = (String)A1.get(i);
			System.out.print(A1Each + " ");
		}
			A1.remove(1);  //删除第二个元素
			A1.add(1,"1");  //在第二个位置添加数字1
			for(i=0;i<A1.size();i++)  //输出动态数组中的元素
			{
				String A1Each = (String)A1.get(i);
				System.out.print(A1Each + " ");
		}
		
	}
}
