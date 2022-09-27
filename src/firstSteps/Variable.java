package firstSteps;

public class Variable {

    public static void main(String[] args) {

        int myFirstNumber = (10+5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int myLastOne = 1000 - myTotal;

        System.out.println("My first variable = " + myFirstNumber);
        System.out.println(mySecondNumber);
        System.out.println(myThirdNumber);
        System.out.println("Sum:" + myTotal);
        System.out.println("MyLastOne: " + myLastOne);
    }
}
