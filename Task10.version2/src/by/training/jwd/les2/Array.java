package by.training.jwd.les2;

public class Array {
    public void fill(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i % 2 == 0){
                    arr[i][j] = j + 1;
                }
                else{
                    arr[i][j] = arr.length - j;
                }
            }
        }
    }
}
