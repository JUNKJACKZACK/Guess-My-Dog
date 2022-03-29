import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class guessMyDog {
    
    public void startGame(){
        Scanner userInput = new Scanner(System.in);

        dog d = new dog();

        System.out.println("What breed do you think is my Dog?");
        String userBreedGuess = userInput.nextLine();

        if (userBreedGuess.equals(d.getBreed())) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again later!");
        }

        System.out.println("What size do you think is my dog? Large, medium, or small?");
        String userSizeGuess = userInput.nextLine();

        if (userSizeGuess.equals(d.getSize())){
            System.out.println("Yes that is right!");
        } else {
            System.out.println("Nope thats not right.");
        }

        System.out.println("What is the age of my dog?");
        int userAgeGuess = userInput.nextInt();

        if (userAgeGuess == (d.getAge())) {
            System.out.println("Woohoo! You are right!");
        } else {
            printWithDelays("Sorry maybe next time!", TimeUnit.MILLISECONDS, 1000);
        }

        System.out.println("Here was the correct answers " + d.getBreed() + ", " + d.getSize() + ", and " + d.getAge());


    }

    private void printWithDelays(String string, TimeUnit milliseconds, int i) {
    }
}