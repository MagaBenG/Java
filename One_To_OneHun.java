package Java;

public class One_To_OneHun {

	public static void main(String args[]) throws InterruptedException{
		
		int Number = 0;
		
		while(Number != 100){
			
			Number = Number + 1;
			System.out.println(Number);
			Thread.sleep(500);
			
		}
		
	}
	
}
