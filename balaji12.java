import java.util.Scanner;

class Demo

{
    
public static void main(String[] args) 
   
 {
        
int number;
        
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number you want to check:");
       
number = scan.nextInt();
        
scan.close();
        
if(number > 0)
        
{
            
System.out.println("positive");
       
 }
        
else if(number < 0)
        
{
            
System.out.println("negative");
       
 }
       
    
}

}
