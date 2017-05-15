package study.project.bomb;

import java.util.Scanner;

public class Event{
	public void gamePlay(BombMap bm){
		Scanner sc = new Scanner(System.in);
		System.out.println("폭탄의 좌표를 입력하세요");
		String location = sc.next();
		checkBomb(bm, location);
	}
	
	
	public void checkBomb(BombMap bm, String loc){
		int[][] bombfield = bm.getField();
		
		try{
			int row = loc.charAt(0)-65;
			int col = Integer.parseInt(loc.substring(1))-1;
			
			try{
				switch(bombfield[row][col]){
					case 0:
						nonBomb(bm,row,col,loc);
						bm.printConfirm();
						break;
					case 9:
						System.out.println("꽝");
						bm.printAll();
						end();
						break;
					default :
						bm.setConfield(loc,String.valueOf(bombfield[row][col]));
						bm.printConfirm();
				}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("좌표를 다시 입력해주세요");
			}
		}catch(NumberFormatException e){
			System.out.println("좌표를 다시 입력해주세요");
		}
		
	}
	
	public void nonBomb(BombMap bm, int row, int col, String location){
		bm.setConfield(location," ");

		for (int i = (row - 1); i <= (row + 1); i++) {
			for (int j = (col - 1); j <= (col + 1); j++) {
				if ((i == row && j == col) || i < 0 || j < 0 || i == bm.getSize() || j == bm.getSize())
					continue;
				else {
					location = String.valueOf((char) (i + 65)) + String.valueOf(j+1);
					
					if(bm.getField()[i][j] == 0){
						System.out.println(location);
						if(bm.getConfield().get(location).equals(" ")){
							continue;
						}else{
							nonBomb(bm,i,j,location);
						}
					}else if (bm.getField()[i][j] != 9){
						bm.setConfield(location,String.valueOf(bm.getField()[i][j]));
					
					}
					
				}
			}
		}
	}
	
	public void doubleClick(){
		
	}
	
	public void end(){
		
	}
}