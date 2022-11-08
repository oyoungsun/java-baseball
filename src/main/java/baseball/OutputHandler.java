package baseball;

public class OutputHandler {
    public void printStart(){
        System.out.println("숫자 야구 게임을 시작합니다.");
    }
    public void printGetUserNumber(){
        System.out.print("숫자를 입력해주세요 : ");
    }
    public void printRestart_orExit(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
    public void Strike_andBall_result_print(int strike, int ball) {
        if((ball+strike)==0){
            System.out.println("낫싱");
        }
        //아래에는 모두 0보다 큰 경우다.
        if(ball==0&&strike<=3){
            System.out.println(strike+"스트라이크");
            if(strike==3){
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            }
        }
        if(strike==0&&ball<3){
            System.out.println(ball+"볼");
        }
        if(ball>0&&strike>0&&(strike+ball)<=3){
            System.out.println(ball+"볼 "+strike+"스트라이크");
        }
    }
}
