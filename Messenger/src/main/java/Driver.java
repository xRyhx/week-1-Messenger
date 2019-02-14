import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String text1,text2;
		ArrayList<Message> r = new ArrayList<Message>(2);
		//MyStack<Message> r = new ArrayList<Message>();
		TextMessage m = new TextMessage();
		
		
			System.out.println("Enter text message");
			text1 = input.nextLine();
			//System.out.println(text1);
			m.setdata(text1);
			System.out.println( m.getdata());
			r.add(m);
			
			
			System.out.println("Enter Photo message");
			text2 = input.nextLine();
			//System.out.println(text2);
			m.setdata(text2);
			System.out.println( m.getdata());
			r.add(m);
			
			System.out.println(r.size());
			
			
		

}
}
