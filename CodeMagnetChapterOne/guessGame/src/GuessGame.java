public class GuessGame {
  Player P1,P2,P3;

  public void startGame(){

      //Instance variables initialized with player objects
      P1 = new Player();
      P2 =  new Player();
      P3 = new Player();

      //Variables to hold the guess the players make.
      int guess1 = 0;
      int guess2 = 0;
      int guess3 = 0;

      boolean p1IsRight = false;
      boolean p2IsRight = false;
      boolean p3IsRight = false;

      int targetNumber =  (int) (Math.random() * 10);
      System.out.println("I am thinking of a number between 0 and 9...");

      while (true) {
          System.out.println("Number to guess is " + targetNumber);

          P1.guess();
          P2.guess();
          P3.guess();

          guess1 = P1.number;
          System.out.println("Player one guessed " + guess1);
          guess2 = P2.number;
          System.out.println("Player two guessed " + guess2);
          guess3 = P3.number;
          System.out.println("Player three guessed " + guess3);

          if (guess1 == targetNumber){
              p1IsRight = true;
          }
          if (guess2 == targetNumber){
              p2IsRight = true;
          }
          if (guess3 == targetNumber){
              p3IsRight = true;
          }

          if (p1IsRight || p2IsRight ||p3IsRight){
              System.out.println("We have a winnner!");
              System.out.println("Player one got it Right? " + p1IsRight);
              System.out.println("Player two got it Right? " + p2IsRight);
              System.out.println("Player three got it Right? " + p3IsRight);
              System.out.println("Game is Over");
              break; //get out of the loop when the game is over
          }else{
              System.out.println("Players Will have to try again..");
          }
      }
  }
}

