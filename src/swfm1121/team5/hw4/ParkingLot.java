package swfm1121.team5.hw4;

public class ParkingLot {
    public int countFee(int parking_time, int consumption,boolean VIP){
        int parking_fee = 0;
        while(parking_time > 0){
            if (parking_time>=1000 ){
                parking_fee += 1000;
                parking_time -= 14400;
                continue;
            }
            if ((parking_time>30 || consumption<500) && VIP==false) {
                parking_fee += parking_time * 1;
                parking_time = 0;
            }else {
                parking_fee = 0;
                parking_time =0;
            }
        }
        return parking_fee;
    }


}
