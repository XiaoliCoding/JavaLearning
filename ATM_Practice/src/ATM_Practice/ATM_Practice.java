package ATM_Practice;
import java.util.Scanner;

public class ATM_Practice {
    public static void main(String [] args){
    	System.out.print("请输入密码：");
    	Scanner con = new Scanner(System.in);
    	String line = con.nextLine();
    	if(line.equals("1234")){
    		System.out.print("1、取款");
    		System.out.print("2、退出");
    		int num = con.nextInt();
    		switch(num){
    		case 1:
    			System.out.print("1、取款100");
    			System.out.print("2、取款200");
    			System.out.print("3、取款500");
    			System.out.print("4、其他");
    			int money =con.nextInt();
    			switch(money){
    			case 1:
    				System.out.print("取款100");
    				break;
    			case 2:
    				System.out.print("取款200");
    				break;
    			case 3:
    				System.out.print("取款500");
    				break;
    			case 4:
    				System.out.print("请输入取款金额：");
    				int other = con.nextInt();
    				System.out.print("取款"+other);
    				break;
    			}
    			break;	
    		case 2:
    			System.out.print("欢迎下次光临！退出");
    			break;
    		}
    	
    	}
    		
    }
}
