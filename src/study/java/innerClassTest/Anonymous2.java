package study.java.innerClassTest;


class Button{
	
	interface OnClickListener {
		void onclick();// OnClickListener�� �ݵ�� onclick()�޼��带 �����Ͼ��ϸ� onclick()�޼���� ��ɿ����� ��ȭ�ž��Ѵ�.
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
				System.out.println("��ư�� ���Ƚ��ϴ�.");
			}
		};
		
		btn.setListener(new Button.OnClickListener() {
			
			@Override
			public void onclick() {
				// TODO Auto-generated method stub
				System.out.println("��ư�� ���Ƚ��ϴ�.");
			}
		});
		btn.touch();
	}
}
