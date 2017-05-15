package study.project.bomb;

import java.util.HashMap;
import java.util.Map;

public class BombMap {
	private int size;
	private int level;
	private int bombNum;
	private int[] bombLocation;
	private int[][] field;
	private Map<String, String> confield;

	public BombMap(int size, int level) {
		super();
		this.size = size;
		this.level = level;
		this.bombNum = setBombNum(level);
		this.bombLocation = new int[bombNum];
		this.field = new int[size][size];
		confield = new HashMap<String, String>();
		setDefaultfield();
	}
	
	public int getSize(){
		return size;
	}
	
	public int setBombNum(int level) {
		return level * 10;
	}

	public void setBombLocation() {
		for (int i = 0; i < bombNum; i++) {
			bombLocation[i] = (int) (Math.random() * size * size);
			for (int j = 0; j < i; j++) {
				if (bombLocation[i] == bombLocation[j])
					i--;
			}
			field[bombLocation[i] % size][bombLocation[i] / size] = 9;
		}
	}

	public void setField() {
		int bombCount = 0;
		for (int point = 0; point < size * size; point++) {
			for (int row = (point % size - 1); row <= (point % size + 1); row++) {
				for (int col = (point / size - 1); col <= (point / size + 1); col++) {
					if ((row == point % size && col == point / size) || row < 0 || col < 0 || row == size || col == size)
						continue;
					else {
						if (field[row][col] == 9)
							bombCount++;
					}
				}
			}
			if (field[point % size][point / size] != 9)
				field[point % size][point / size] = bombCount;
			bombCount = 0;
		}
	}

	public int[][] getField() {
		return field;
	}

	public void setDefaultfield() {
		String data;
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				data = String.valueOf((char) (row + 65)) + String.valueOf(col+1);
				confield.put(data, data);
			}
		}
	}

	public void setConfield(String location, String value) {
		//System.out.println(confield.get(location));
		confield.put(location, value);
	}

	public Map<String, String> getConfield() {
		return confield;
	}

	public void printConfirm() {
		String data;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				data = String.valueOf((char) (i + 65)) + String.valueOf(j+1);
				System.out.print(confield.get(data) + "\t");
			}
			System.out.println();
		}
		
		/*for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(confield + "\t");
			}
			System.out.println();
		}*/
	}

	public void printAll() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(field[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
