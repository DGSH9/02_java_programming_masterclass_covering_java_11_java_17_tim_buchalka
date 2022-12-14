package j123_Interfaces_j124_Interace_Part2;

public class DeskPhone implements ITelephone {
	private boolean isRinging;
	private int myNumber;
	
	public DeskPhone(int myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("No action Desktop phone not have power button");
		
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing "+ phoneNumber + "On Desktop");

	}

	@Override
	public void answer() {
		if(isRinging) {			
			System.out.println("Answiring the Dektop phone");
			isRinging=false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber==myNumber) {
			isRinging=true;
			System.out.println("Ring ring");
		}
		else {
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}

}
