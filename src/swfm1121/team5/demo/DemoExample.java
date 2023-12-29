package swfm1121.team5.demo;

import java.util.Locale;

public class DemoExample {

    public int intDivider(int a, int b){
        return a/b;
    }

    public float floatDivider(float a, float b){
        return a/b;
    }

    public String displayName(String firstName, String lastName){
        if(firstName==null || lastName==null){
            return null;
        }
        return firstName + " " + lastName;
    }

    public boolean isAllCap(String target){
        String test = target.toUpperCase(Locale.ROOT);
        if(test == target){
            return true;
        }
        return false;
    }
}
