class wrapper1{
    public static void main(String [] args){
        String text = "pass@123";
        int upper =0;
        int lower = 0;
        int digit = 0;
        int special = 0;
         for (char ch : text.toCharArray()){
            if(Character.isUpperCase (ch)){
                upper++;
            }
            else if(Character.isLowerCase (ch)){
                lower++;
            }
            else if(Character.isDigit(ch)){
               digit++;
            }
            

            else{
                special++;
            }
         }
         System.out.println("upper : " + upper);
          System.out.println("lower : " +lower);
          System.out.println("digit: " + digit);
          System.out.println("upper: " + special);
         

    }
}