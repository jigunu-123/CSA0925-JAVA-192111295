import java.util.Scanner;

 class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str=sc.nextLine();
       
        String replacedString = str.replaceAll("saveetha", "PAV");
        System.out.println("Replaced string: " + replacedString);
       
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
    
        String upperCaseString =str.toUpperCase();
        System.out.println("Uppercase conversion: " + upperCaseString);
        
  
    }
}
