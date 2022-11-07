package baseball;

import java.util.List;

public class ErrorHandler {
    final static int BASEBALLLENGTH = 3;

    public boolean isLengthSizeis3(List<Integer> baseball){
        return baseball.size()==BASEBALLLENGTH;
    }

    public boolean isNotDuplicated(List<Integer> baseball) {
        boolean[] duplicate = new boolean[10];
        for(int i : baseball){
            if(!duplicate[i]) {
                duplicate[i] = true;
            }else{
                return false;
            }
        }
        return true;
    }
}
