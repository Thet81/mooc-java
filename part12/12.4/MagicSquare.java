// MagicSquare.java
import java.util.*;

public class MagicSquare {
	public static void main(String[] args) {
		MagicSquare square = new MagicSquare();
		ArrayList<Integer> result = square.sumOfRows();
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
	private int[][] matrix = {
      {8,1,6},
      {3,5,7},
      {4,9,2}
    };

	public ArrayList<Integer> sumOfRows(){
		ArrayList<Integer> row = new ArrayList<>();
		for(int i = 0; i < matrix.length; i++){
			int total = 0;
			for(int j = 0; j < matrix[i].length;j++){
				total += matrix[i][j];
			}
			row.add(total);
		}
		return row;
	}
}