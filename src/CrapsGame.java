public class CrapsGame { 
  public static void main(String[] args) { 
    int point = -1; 
    int dice1, dice2, roll; 
    while (true) {  
      dice1 = (int)(Math.random()* 6) + 1; 
      dice2 = (int)(Math.random()* 6) + 1; 
      roll = dice1 + dice2; 
      System.out.println("You rolled "+dice1+" and "+dice2+" , for a total of "+ roll); 
      if( roll == 7 ) { 
        System.out.println("YOU LOSE"); 
        break; 
        } else { 
        if( roll == 4 || roll == 5 || roll == 6 || roll == 8 || roll == 9 || roll == 10 ) { 
          point = roll; 
          System.out.println( point + " is now the established POINT"); 
       } 
    } 
 } 
} 
} 