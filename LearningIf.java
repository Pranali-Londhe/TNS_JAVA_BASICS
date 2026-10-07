public class LearningIf{
    public static void main(String[]args){
        boolean isMale = true;
        String name = "Bob";
        System.out.println("Before If statement");
        if(isMale){
            System.out.println("Mr. "+name);
        }
        else{
            System.out.println("Ms."+ name);
        }
        System.out.println("After If and Else statement");

    
      

        //IF ELSE LADDEER

        boolean isSeniorCitizen = true;
        boolean isAnAdult = false;
        if (isSeniorCitizen) {
            System.out.println("Hello Senior Citizen");
        }else if(isAnAdult){
            System.out.println("Hello Adult");
        }else{
            System.out.println("Hello Child");
        }
    }
}
