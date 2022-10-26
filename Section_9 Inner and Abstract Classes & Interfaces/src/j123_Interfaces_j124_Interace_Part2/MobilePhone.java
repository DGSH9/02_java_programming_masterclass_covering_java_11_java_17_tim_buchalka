package j123_Interfaces_j124_Interace_Part2;

public class MobilePhone implements ITelephone{
	
	private boolean isRinging;
	private int myNumber;
	private boolean isOn;
	
	
	public MobilePhone(int myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		isOn = true;			
		System.out.println("Mobile phone power up..");
		
		
	}

	@Override
	public void dial(int phoneNumber) {
		if (isOn) {
			System.out.println("Melody is ringing..");
		}
		else {
			System.out.println("Phone is in off mode");
		}

	}

	@Override
	public void answer() {
		if(isRinging) {			
			System.out.println("Answiring the Mobile phone");
			isRinging=false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber==myNumber && isOn) {
			isRinging=true;
			System.out.println("Melody Ring...");
		}
		else {
			isRinging = false;
			System.out.println("mobile phone not on...");
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		System.out.println("Answering the mobile phone..");
		return isRinging;
	}
	
	
	
}
