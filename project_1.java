import java.util.*;
 class GuessNumber {

    public void logic(){
        System.out.println("\nLet's Guess the number between 1 to 100\n");
        int n= 99;
        int attempts =1;
        System.out.println("******Your Chance no.:"+attempts+"******\n");
        System.out.println("Enter the Guess:");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        

        while(true)
       
       
        if(a==n){
            System.out.println("Congratulations!!! Your Guess is correct:D");
            System.out.println(":D You Won :D");
            break;
        } 
        else{
            System.out.println("Oopss!!Incorrect Guess");
            if(a<n){
                System.out.println("Feedback-Too Low guess\n");
            
            }
        
            else if(a>n){
                System.out.println("Feedback-Too high guess\n");
            }
       
            attempts++;
            System.out.println("******Your Chance no.:"+attempts+"******\n");
            System.out.println("Enter the Guess:");
            a=sc.nextInt();

         }
        
    }
    
    public static void main(String args[]){
       
        GuessNumber obj = new GuessNumber();

        obj.logic();

        
    }
}


