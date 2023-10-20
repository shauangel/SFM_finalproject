package swfm1121.team5.hw2;
public class TestProgram {

    public int countExponent(int target, int divider){
        int n = 0;
        if(target <= 0){ return -1; }
        while(target > 1){
            if(target%divider == 0){
                target/=divider;
                n+=1;
            }
            else {
                return -1;
            }
        }
        return n;
    }

}
