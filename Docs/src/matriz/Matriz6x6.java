package matriz;

public class Matriz6x6 {
	public static void main(String[]args) {
		int[][] matriz= {
				{-9,-9,-9, 1, 1, 1},
				{ 0,-9, 0, 4, 3, 2},
				{-9,-9,-9, 1, 2, 3},
				{ 0, 0, 8, 6, 6, 0},
				{ 0, 0, 0,-2, 0, 0},
				{ 0, 0, 1, 2, 4, 0}};
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				int figura=matriz[i][j]+matriz[i][j+1]+matriz[i][j+2]+matriz[i+1][j+1]+matriz[i+2][j]+matriz[i+2][j+1]+matriz[i+2][j+2];	
				System.out.println(figura);
			}
		}
	}

}
