package ATM_Practice;
import java.util.Scanner;

public class ATM_Practice {
    public static void main(String [] args){
    	System.out.print("���������룺");
    	Scanner con = new Scanner(System.in);
    	String line = con.nextLine();
    	if(line.equals("1234")){
    		System.out.print("1��ȡ��");
    		System.out.print("2���˳�");
    		int num = con.nextInt();
    		switch(num){
    		case 1:
    			System.out.print("1��ȡ��100");
    			System.out.print("2��ȡ��200");
    			System.out.print("3��ȡ��500");
    			System.out.print("4������");
    			int money =con.nextInt();
    			switch(money){
    			case 1:
    				System.out.print("ȡ��100");
    				break;
    			case 2:
    				System.out.print("ȡ��200");
    				break;
    			case 3:
    				System.out.print("ȡ��500");
    				break;
    			case 4:
    				System.out.print("������ȡ���");
    				int other = con.nextInt();
    				System.out.print("ȡ��"+other);
    				break;
    			}
    			break;	
    		case 2:
    			System.out.print("��ӭ�´ι��٣��˳�");
    			break;
    		}
    	
    	}
    		
    }
}
