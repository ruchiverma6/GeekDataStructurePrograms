
public class MatrixProgramsImpl {
public static void main(String[] args) {
	//findSnakesOfMatrix();
	//findTransposeOfMatrix();
	//searchElementInMatrix(39);
	//printBoundaryElements();
	//rotateMatrix();
	addMatrices();
}

public static void findSnakesOfMatrix() {
	int mat[][] = { {10, 20, 30, 40},
                    {15, 25, 35, 45},
                    {27, 29, 37, 48},
                    {32, 33, 39, 50}};
	
	for(int i=0 ; i<mat.length; i++) {
		if(i%2 == 0) {
			for(int j=0; j<mat[i].length ; j++) {
				System.out.println(mat[i][j]);
			}
		}else{
			for(int j=(mat[i].length-1); j>=0 ; j--) {
				System.out.println(mat[i][j]);
			}
		}
	}
	
	
}

public static void rotateMatrix() {
	int mat[][] = { {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}};
	
	for(int i = 0; i<mat.length; i++) {
		for(int j=i+1 ;  j< mat[i].length; j++) {
			int temp = mat[i][j];
			mat[i][j] = mat[j][i];
			mat[j][i] = temp;
		}
		}
	
	for(int j=0;j<mat.length;j++) {
		for(int k=0;k<mat[j].length/2;k++) {
			int temp = mat[k][j];
			mat[k][j] = mat[(mat.length-1)-k][j];
			mat[(mat.length-1)-k][j] = temp;
		}
	}
		
		for(int k = 0; k<mat.length; k++) {
			for(int p=0 ;  p< mat[k].length; p++) {
				System.out.println(mat[k][p]);
			}
			System.out.println("---");
	}
	
}

public static void findTransposeOfMatrix() {
	int mat[][] = { {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}};
	
	for(int i = 0; i<mat.length; i++) {
	for(int j=i+1 ;  j< mat[i].length; j++) {
		int temp = mat[i][j];
		mat[i][j] = mat[j][i];
		mat[j][i] = temp;
	}
	}
	for(int k = 0; k<mat.length; k++) {
		for(int p=0 ;  p< mat[k].length; p++) {
			System.out.println(mat[k][p]);
		}
		System.out.println("---");
	
	}
}

public static void searchElementInMatrix(int num) {
	int mat[][] = { {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}};
	int row = 0;
	int column = mat.length-1;
	
	while(row<mat.length && column>0) {
		if(mat[row][column]>num) {
			column--;
		}else if(mat[row][column]<num) {
			row++;
		}else if(mat[row][column]==num) {
			System.out.println("number present at"+ row + "," + column);
			break;
		}
	}
}

public static void printBoundaryElements() {
	int mat[][] = { {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}};
	
	for(int i=0;i<mat[0].length; i++) {
		System.out.println(mat[0][i]);
	}
	
	for(int i=0+1; i<mat.length; i++) {
		System.out.println(mat[i][3]);
	}
	int max = mat[3].length-1;
	for(int i=max-1; i>=0;i--) {
		System.out.println(mat[3][i]);
	}
	max = mat[0].length-1;
	for(int i=max-1;i>0; i--) {
		System.out.println(mat[i][0]);
	}
}

public static void addMatrices() {
	int mat1[][] = { {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}};
	
	int mat2[][] = { {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}};
	
	int mat3[][] = new int[4][4];
	
	for(int i=0;i<mat1.length;i++) {
		for(int j=0;j<mat1[i].length;j++) {
			mat3[i][j] = mat1[i][j] + mat2[i][j];
		}
	}
	
	for(int k = 0; k<mat1.length; k++) {
		for(int p=0 ;  p< mat1[k].length; p++) {
			System.out.println(mat3[k][p]);
		}
		System.out.println("---");
}
}

}
