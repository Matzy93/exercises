
class Matrix {

	String matrix;

    Matrix(String matrixAsString) {
        this.matrix = matrixAsString;
    }

    int[] getRow(int rowNumber) {
        String[] rows = matrix.split("\n");
		int no_rows = rows.length;
		if(rowNumber > no_rows) throw new IllegalArgumentException("There are not so many rows");
		String row = rows[rowNumber].replaceAll("\\s+","");

		int[] row_nums = new int[row.length()];
		for(int i=0; i<row.length(); i++) {
			char c = row.charAt(i);
			int num = Character.getNumericValue(c);
			row_nums[i] = num;
		}

		return row_nums;
    }

    int[] getColumn(int columnNumber) {

		String[] rows = matrix.split("\n");
        int no_rows = rows.length;
		int no_columns = rows[0].length();

		if(columnNumber > no_columns - 1) throw new IllegalArgumentException("There are not so many columns");

		int[] column_nums = new int[no_rows];
		for(int i=0; i<no_rows; i++) {
			String row = rows[i];
			char c = row.charAt(columnNumber);
			int num = Character.getNumericValue(c);
			column_nums[i] = num;
		}

		return column_nums;
    }

    int getRowsCount() {
        int no_rows = matrix.split("\n").length;

		return no_rows;
    }

    int getColumnsCount() {
        String[] rows = matrix.split("\n");
		String row = rows[0].replaceAll("\\s+","");
		int no_columns = row.length();

		return no_columns;
    }
}
