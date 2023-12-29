package swfm1121.team5.hw1;

import java.util.ArrayList;

public class Triangle {

    Integer[] isEquilateral(int[][] testData){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<testData.length; i++){
            if(testData[i][0]<0||testData[i][1]<0||testData[i][2]<0){
                System.out.println("Not a Equilateral Triangle");
                result.add(0);
                continue;
            }
            if((testData[i][0]==testData[i][1])&&(testData[i][1]==testData[i][2])){
                System.out.println("Is a Equilateral Triangle");
                result.add(1);
            }
            else {
                result.add(0);
            }
        }
        Integer[] arr_result = new Integer[result.size()];
        arr_result = result.toArray(arr_result);
        return arr_result;
    }
}
