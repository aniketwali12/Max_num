
import java.util.*;

public class maxNUM{
public static void main(String[] args){   
        Scanner in =new Scanner(System.in);
        int a=1;
        System.out.println("Rules 1):Enter any number between 1 and 9");
        System.out.println("2)Choose A or B such that you have maximum result within 10 seconds else you have to start again");
        System.out.println("3)After 10 question larger the result ,better is your basic maths");
        System.out.println("Enter a number between 1-9");
        int x=in.nextInt();
        if(x>9 || x<1){
            System.out.println("Enter number between 1 to 9 only");
            System.exit(0);
        }
        System.out.println("Consider your number as NUM");
        int n=x;
        System.out.println("A)X2        B)+5");         
        char c=comp(a);a++;
        if(c=='A'){
            x*=2;
        }
        else {
            x+=5;
        }     
        System.out.println("Your current score is "+x);              
                
        System.out.println("A)+15        B)X2");
         c=comp(a);a++;
        if(c=='A'){
            x+=15;
        }
        else {
            x*=2;
        }
        System.out.println("Your current score is "+x);
    
        System.out.println("A)-20        B)/3");
         c=comp(a);a++;
        if(c=='A'){
            x-=20;
        }
        else {
            x/=3;
        }
        System.out.println("Your current score is "+x);
                
        System.out.println("A)+1        B)X1");
         c=comp(a);a++;
        if(c=='A'){
            x+=1;
        }
        else {
            x*=1;
        }
        System.out.println("Your current score is "+x);
              
        System.out.println("A)X(1/infinity)        B)X(10-NUM)");
         c=comp(a);a++;
        if(c=='A'){
            x=0;
        }
        else {
            x*=(10-n);
        }
        System.out.println("Your current score is "+x);
                
        System.out.println("A)-(NUM X 10)        B)-(NUM X 0.1)");
         c=comp(a);a++;
        if(c=='A'){
            x-=(n*10);
        }
        else {
            x-=1;
        }
        System.out.println("Your current score is "+x);
          
        System.out.println("A)+(NUM X 10)        B)+((NUM/10)+10)");
         c=comp(a);a++;
        if(c=='A'){
            x+=(n*10);
        }
        else {
            x+=10;
        }
        System.out.println("Your current score is "+x);       
        
        System.out.println("A)-(NUM X 2)        B)/NUM");
         c=comp(a);a++;
        if(c=='A'){
            x-=(n*2);
        }
        else {
            x/=n;
        }
        System.out.println("Your current score is "+x);
               
        System.out.println("A)+(10-NUM)       B)+((1/infinity)+1)");
         c=comp(a);a++;
        if(c=='A'){
            x+=(10-n);
        }
        else {
            x+=1;
        }
        System.out.println("Your current score is "+x);
               
        System.out.println("A)-(NUM + 10)        B)+(NUM + 1)");
         c=comp(a);a++;
        if(c=='A'){           
            x-=(n+5);
        }
        else {
            x+=(n+1);
        }
        System.out.println("Your current score is "+x);
        System.out.println("U got "+x+" out of 100");
        
        if(x==100){
            System.out.println("Congrats!!  Full marks");
        }else if(x<100 && x>90){
            System.out.println("Excellent");
        }else if(x<=90 && x>80){
            System.out.println("Very good");
        }else if(x<=80 && x>70){
            System.out.println("Good");
        }else if(x<=70 && x>50){
            System.out.println("Average");
        }else if(x<=50 && x>0){
            System.out.println("Improve");
        }else {
            System.out.println("Bad");
        }
             in.close();
}
    static public char comp(int a){
        char c='a';       
        
        Scanner in =new Scanner(System.in);    
        System.out.println("Q"+a+")Enter A or B");       
        long start = System.currentTimeMillis();
        long end = start + 10 * 1000;        
        
         c=in.next().charAt(0);
         char c2=Character.toUpperCase(c);
        if(System.currentTimeMillis() > end){
            System.out.println("Time out ,U took more than 10 seconds!!\n Play again");
           System.exit(0);
        }
             if(c2!='A' && c2!='B'){
                System.out.println("Wrong option!!\n Play again");
                  System.exit(0);       
            }                    
       return c2;      
    }
}
