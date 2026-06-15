
import java.util.*;

public class TwoDimensionalArray{

  public static void main (String[] args){
    int rows = 2;
    int columns = 3;

    int[][] twoDimensionalArray = new int[rows][columns];

    twoDimensionalArray[0][1] = 4;
    twoDimensionalArray[1][1] = 1;
    twoDimensionalArray[1][0] = 8;

    for(int row = 0; row < twoDimensionalArray.length; row++){
      for(int column = 0; column < twoDimensionalArray[row].length; column++){
        int value = twoDimensionalArray[row][column];
        System.out.println(""+ row + ", " + column + ", " + value);
      }
    }
    int[][] matrix = {
      {3,2,7,6},
      {2,4,1,0},
      {3,2,1,0}
    };
    System.out.println(arrayAsString(matrix));
  }

  public static String arrayAsString(int[][] array){
    StringBuilder string = new StringBuilder();
    for(int i = 0; i < array.length;i++){
      for(int j = 0; j < array[i].length; j++){
        string.append(array[i][j]);
      }
      string.append("\n");
    }
    return string.toString();
  }
}