public class jaggedArray {
    public static void main(String[] args){
        // Hot Interview topic

        int[][] jagged = new int[3][];
        jagged[0] = new int[5];
        jagged[1] = new int[2];
        jagged[2] = new int[3];
        int candy = 0;
        for (int rowIndex = 0; rowIndex < jagged.length; rowIndex++){

            for(int colIndex = 0; colIndex < jagged[rowIndex].length; colIndex++){
                jagged[rowIndex][colIndex] = candy;
                candy+=10;
            }
        }
        System.out.println(candy);
    }
}
