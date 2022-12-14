package j127_Inner_classes_Part_1_and_2;

public class Button {
	
	private String title;
	private OnClickListener onClickListener;
	
	public Button(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	
	public void onClick() {
		this.onClickListener.onClick(this.title);
	}
	
	
	public interface OnClickListener{
		public void onClick(String title);
	}
}
