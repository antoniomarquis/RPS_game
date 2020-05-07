package com.dub.digital;

public class Main {

    public static void main(String[] args) {
      int userCount = 0;
      int cpuCount = 0;
      int showDownCount = 0;

	  Game game = new Game();

	  for(i = 0; i < 10; i++){
         int faceOff = game.startGame();
         if(faceOff == 1){
             userCount = userCount + 1;  //could not get userCount++ to work
         } else {
             cpuCount = cpuCount + 1;
         }
         showDownCount++;
         if (showDownCount == 10){
             if(cpuCount > userCount) {
                 System.out.println("CPU is the winner!!! CPU CUT UP!!");
             }else{
                 System.out.println("USER is the winner!!! U ROCK!");
             }
         }
      }
    }
}
