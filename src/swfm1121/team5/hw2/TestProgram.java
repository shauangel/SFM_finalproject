package swfm1121.team5.hw2;
public class TestProgram {

    // Check if the target is the "Positive Integer Exponent" of the divider
    // If "yes", return the exponent
    // If not, return -1
    public int countExponent(int target, int divider){
        int n = 0;  // nth-power
        if(target <= 0){ return -1; }        // Check if target is positive and > 0
        while(target > 1){                   // Calculate n
            if(target%divider == 0){         // Check if target is the multiple of divider
                target/=divider;
                n++;
            }
            else { return -1; }              // If not, the target is not the power of the divider
        }
        return n;
    }

}
