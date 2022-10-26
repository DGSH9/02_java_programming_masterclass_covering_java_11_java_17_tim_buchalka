package j123_Interfaces_j124_Interace_Part2;

public class Main {
	public static void main(String[] args) {
		
		//Desktop Class
		System.out.println("Desktop Class==================>");
		ITelephone iTelephone;
		iTelephone = new DeskPhone(7053296);
		iTelephone.powerOn();
		iTelephone.callPhone(7053296);
		iTelephone.answer();
		
		System.out.println("Mobile Class==================>");
		//Mobile Class
		iTelephone= new MobilePhone(24542);
		iTelephone.powerOn();
		iTelephone.callPhone(24542);
		iTelephone.answer();
		

	}

}
