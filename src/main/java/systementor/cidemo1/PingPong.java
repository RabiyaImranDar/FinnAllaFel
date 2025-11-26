package systementor.cidemo1;

public class PingPong {

    private int pingCounter = 0;
    public String ping(String input){
        if(input.equals("ping")){
            pingCounter++;
            return "pong";
        }
        else{
            return "You have not written ping";
        }
    }

    public int getPingCounter(){
        if (pingCounter > 0){
            return pingCounter;
        }
        else{
            return -1;
        }
    }
}
