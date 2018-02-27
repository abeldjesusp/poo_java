public class Arrays_bidimensionales {
	public static void main(String[] args) {
		int [][] matrix = {
			{10,22,34,44,89},
			{78,54,32,10,70},
			{34,65,89,03,89},
			{9,7,65,43,8}
		};

		for(int[]fila:matrix){
			System.out.println();
			for(int z: fila){
				System.out.print(z + " ");
			}
		}
	}
}