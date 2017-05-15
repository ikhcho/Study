package study.java.innerClassTest;


class Button{
	
	interface OnClickListener {
		void onclick();// OnClickListener는 반드시 onclick()메서드를 수행하야하며 onclick()메서드는 기능에따라 변화돼야한다.
	}
	
	OnClickListener listener;
	public void setListener(OnClickListener listener){
		this.listener = listener;
	}
	
	void touch(){
		listener.onclick();
	}
}

public class Anonymous2 {
	public static void main(String[] args) {
		Button btn = new Button();
		Button.OnClickListener listener = new Button.OnClickListener() {
			
			@Override
			public void onclick() {
				// TODO Auto-generated method stub
				System.out.println("버튼이 눌렸습니다.");
			}
		};
		
		btn.setListener(new Button.OnClickListener() {
			
			@Override
			public void onclick() {
				// TODO Auto-generated method stub
				System.out.println("버튼이 눌렸습니다.");
			}
		});
		btn.touch();
	}
}
