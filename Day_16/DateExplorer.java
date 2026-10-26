import java.time.*;
import java.util.Scanner;
public class DateExplorer {
        public static void displayMonth(LocalDate date){
            System.out.println("Month "+date.getMonth());

        }
        public static void displayYear(LocalDate date){
            System.out.println("Year "+date.getYear());

        }
        public static void displayDay(LocalDate date){
            System.out.println("Day of Week "+date.getDayOfWeek());


        }
        public static void checkLeapYear(LocalDate date){
            if(date.isLeapYear()){
                System.out.println(date.getYear()+ " is a leap year");

            }
            else{
                System.out.println(date.getYear()+" is not a leap year");

            }
        }

    public static void lookBackMonth(Scanner sc, LocalDate date){
            System.out.print("Enter number of months to look back: ");
            int months = sc.nextInt();

            LocalDate pastDate = date.minusMonths((months));
            System.out.println("Date "+ months+ " month age: "+pastDate);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date (yyyy-mm-dd): ");
        String input = sc.next();
        LocalDate date = LocalDate.parse(input);
        int choice;
        do{
            System.out.println("\n--------Date Explorer Menu--------");
            System.out.println("1. Display Month");
            System.out.println("2. Displya Year");
            System.out.println("3. Display Day of Week");
            System.out.println("4. Check Leap Year");
            System.out.println("5. Look Back by Months");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");

            choice = sc.nextInt();
            switch(choice){
                case 1:
                    displayMonth(date);
                    break;


                case 2:
                    displayYear(date);
                    break;

                case 3:
                    displayDay(date);
                    break;

                case 4:
                    checkLeapYear(date);
                    break;

                case 5:
                    lookBackMonth(sc, date);
                    break;

                case 6:
                    System.out.println("Exiting Date Explorer. GoodBye!");
                    break;

                default:
                    System.out.println("Invalid choice.Please try again");

            }
        }while(choice != 6);
        sc.close();
    }


    }

