public class DmvSimulator {
    public static void main(String[] args) {
        // Greets user, generates their number
        System.out.println("Welcome to the DMV!");
        int dmvNum = (int) (Math.random()*100);
        System.out.println("Your number is: " + dmvNum + "\r\nPlease wait to be called.");
        int currNum = dmvNum+1;
        
        // Loops until the generated number equals the loop number. 
        while (true) {
            System.out.println("Next up... " + currNum + "!");
            // When the the generated number is the one in the loop, breaks the loop
            if (dmvNum == currNum) {
                System.out.println("Hey it is finally your turn!");
                int luck = (int) (Math.random()*100); // Generates a random number between 0 and 100
                if (luck == 1) { // This makes chance of successful paperwork 1%
                    System.out.println("Luckily for you, your paperwork is correct! I have no idea how that is possible...");
                } else {
                    System.out.println("Bad News... this paperwork is useless...");
                }
                break;
            }

            // Amount of numbers that will be called, can be changed to any value
            if (currNum == 200) {
                currNum = 1; // Overflow loop, when number reaches max it reverts to 1
            } else {
                currNum++; // Increases when not at max
            }
        }
    }
}