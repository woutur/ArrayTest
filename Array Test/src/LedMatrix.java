import java.util.Arrays;

public class LedMatrix {
int[][] ledMatrix;
int x = 0;
int y = 0;
	public void setArray(int x, int y){
		// first set size for the whole matrix
		this.x = x;
		this.y = y;
		this.ledMatrix = new int[x][y];
	}
		
	public void paint(int startX , int startY, int colour) {
		// calculate the start position and end position
			int endRow = x - startX;
			int endColumn = y - startY;
		for(int i = startX; i < endRow; i++) {
			for (int j = startY; j < endColumn; j++) {
				ledMatrix[i][j]= colour;
			}
		}
	}	
		////		for(int i=0; i<16; i++) {
//			j = i;
//			//for(int j=0; j<16; j++) {
//				array[j][i] = z;
//			//}
//		}
	
		public void printIt() {
//			System.out.println("Linksboven: " + array[0][0]);
//			System.out.println("Linksboven: " + array[0][15]);
//			System.out.println("Rechtsonder: " + array[15][0]);
//			System.out.println("Rechtsonder: " + array[15][15]);
			 System.out.println(Arrays.deepToString(ledMatrix).replace("], ", "]\n"));
	}
}
