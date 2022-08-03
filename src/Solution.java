public class Solution {

    private static int playerNumber = 1;
    private static int playerNumber1StepsCount = 0;


    public static void main(String[] args) {
        doStep(1,"step1");
        doStep(1,"step2");
        doStep(2,"step3");
        doStep(2,"step4");
        doStep(1,"step5");
    }

    private static void doStep(int playerNumberLocal, String step) {
        if (playerNumberLocal == playerNumber){
            if (playerNumber1StepsCount == 0) {
                playerNumber1StepsCount++;
                print(step);
                playerNumber = 2;
            }
            else {print(step);
            playerNumber = 1;
        }
    }
}
    private static void print(Object b) {
        System.out.println(b);
    }
}


