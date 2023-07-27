public class Doubles {
    public static void main(String[] args) {

   //      See Learn the Part for instructions.
       
        int dice1;
        int dice2;
        int attempt=0;
        boolean isNotDouble = true;

        while(isNotDouble){
            attempt++;
            dice1 = rollDice();
            dice2 = rollDice();
            System.out.println("Dice 1: "+dice1);
            System.out.println("Dice 2: "+dice2 +"\n");
            if(dice1 == dice2){
                System.out.println("You rolled doubles!\n(Total "+attempt+" attempts)");
                isNotDouble = false;
            }
        }
    }


    public static int rollDice(){
        double randNum = (Math.random() * 6) + 1;
        return (int) randNum;
    }
}






