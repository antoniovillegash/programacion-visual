package matriz;

public class Matriz {
	public static void main(String[] args) {
		int[][] matriz={{1,3,5,7},
						{4,7,9,7},
						{2,6,8,0},
						{2,4,5,2}};
	
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(i%2==0) {
					System.out.print(matriz[j][i]);
				}else {
					System.out.print(matriz[3-j][i]);
				}
				
			}
			
		}

	}
}
