package study.project.bomb;

public class FindBomb {
	
	public static void main(String[] args) {
		BombMap test = new BombMap(10,1);
		Event event = new Event();
		test.setBombLocation();
		test.setField();
		test.printAll();
		test.printConfirm();
		
		
		while(true){
			event.gamePlay(test);
		}
	}
}
