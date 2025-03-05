public class DmvSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the DMV!");
        int dmvNum = (int) (Math.random()*100);
        System.out.println("Your number is: " + dmvNum + "\r\nPlease wait to be called.");
        int currNum = dmvNum+1;
        
        while (true) {
            System.out.println("Next up... " + currNum + "!");
            if (dmvNum == currNum) {
                System.out.println("Hey it is finally your turn!");
                System.out.println("Bad News... this paperwork is useless... Mwaahahahahahaha!!!");
                break;
            }

            if (currNum == 100) {
                currNum = 1;
            } else {
                currNum++;
            }
        }
    }
}