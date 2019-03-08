package matriz;

public class Matriz6x6 {
	public static void main(String[]args) {
		int[][] matriz= {
				{-9,-9,-9, 8, 7, 1},
				{ 0,-9, 0, 7, 8, 7},
				{-9,-9,-9, 3,-3, 1},
				{ 5,-3, 0, 2, 0,-1},
				{ 6, 8, 2, 1,-3, 0},
				{ 7, 3,-1, 4, 4, 3}};
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				int figura=matriz[i][j]+matriz[i][j+1]+matriz[i][j+2]+matriz[i+1][j+1]+matriz[i+2][j]+matriz[i+2][j+1]+matriz[i+2][j+2];
				System.out.println(figura);
			}
		}
	}

}
