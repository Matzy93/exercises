import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Matrix {

	ArrayList<ArrayList<Integer>> matrix;

	public Matrix(ArrayList<ArrayList<Integer>> m) {
		this.matrix = m;
	}

	Set<MatrixCoordinate> getSaddlePoints() {
		Set<MatrixCoordinate> saddlePoints = new HashSet<>();
		ArrayList<MatrixCoordinate> largest = new ArrayList<>();

		for(int i=0; i<this.matrix.size(); i++) {
			ArrayList<Integer> row = this.matrix.get(i);
			largest.addAll(findLargest(row,i));
		}

		for(int i=0; i<largest.size(); i++) {
			int column = largest.get(i).getColumn();
			int row = largest.get(i).getRow();
			if(isSmallest(this.matrix.get(row).get(column), column)) {
				saddlePoints.add(largest.get(i));
			}
		}

		return saddlePoints;
		
	}

	ArrayList<MatrixCoordinate> findLargest(ArrayList<Integer> row, int row_index) {
		ArrayList<MatrixCoordinate> largest = new ArrayList<MatrixCoordinate>();

		for(int i=0; i<row.size(); i++) {
			if(isLargest(row.get(i),row)) {
				largest.add(new MatrixCoordinate(row_index,i));			
			}
		}
		return largest;	
	}

	boolean isLargest(Integer num, ArrayList<Integer> row) {
		for(int i=0; i<row.size(); i++) {
			if(row.get(i)>num) return false;
		}
		return true;
	}

	boolean isSmallest(Integer num, int column) {
		for(int i=0; i<this.matrix.size(); i++) {
			if(this.matrix.get(i).get(column) < num) return false;
		}
		return true;
	}
}
