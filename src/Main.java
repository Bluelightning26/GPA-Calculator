import java.util.Scanner;

class GPA
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        //One time setup
        System.out.println("\n\n\nThis Calculator will calculate your GPA");
        double gpa = 0;
        double gpaTOT = 0;
        double creditTOT = 0;
        System.out.println("How many classes do you have?");
        int classnum = sc.nextInt();
        boolean showSystemProperties = false;


        //repeated for number of classes
        for (int i =1; i <= classnum; i++) {
            System.out.println("Enter your course name:");
            String courseName = sc.next();
            System.out.println("How many credits is " + courseName + " worth?");
            double credit = sc.nextDouble();
            System.out.println("What is your letter grade in " + courseName + "?");
            String letterGrade = sc.next();


            //grade index
            switch (letterGrade) {
                case "A+":
                    gpa = 4.33 * credit;
                    break;

                case "A":
                    gpa = 4.00 * credit;
                    break;

                case "A-":
                    gpa = 3.67 * credit;
                    break;

                case "B+":
                    gpa = 3.33 * credit;
                    break;

                case "B":
                    gpa = 3.00 * credit;
                    break;

                case "B-":
                    gpa = 2.67 * credit;
                    break;

                case "C+":
                    gpa = 2.33 * credit;
                    break;

                case "C":
                    gpa = 2.00 * credit;
                    break;

                case "C-":
                    gpa = 1.67 * credit;
                    break;

                case "D+":
                    gpa = 1.33 * credit;
                    break;

                case "D":
                    gpa = 1.00 * credit;
                    break;

                case "D-":
                    gpa = 0.67 * credit;
                    break;

                case "F":
                case "F-":
                    gpa = 0.00 * credit;
                    break;

                default:
                    System.out.println("Hmm... something went wrong. Try typing in your letter grade like 'A+' or 'B' instead!");
                    showSystemProperties = true;

            }


            System.out.println("Class " + i + ". " + courseName + ": logged a " + gpa + " gpa for " + credit + " credits");
            gpaTOT = gpaTOT + gpa;
            creditTOT = creditTOT + credit;
            System.out.println();
        }

        //Final Output
        System.out.println("\n\n\n--------------------");
        System.out.println("Your GPA is: " + gpaTOT / creditTOT);
        System.out.println("You are taking: " + creditTOT + " credits in total");
        showSystemProperties = true;

        //Resolution
        if (showSystemProperties)
        {
            System.out.println("\n\n\n");
            System.out.println("Java Version: " + System.getProperty("java.version") + " by " + System.getProperty("java.vendor"));
            System.out.println("User: " + System.getProperty("user.name"));  //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
            System.out.print("Operating System: " + System.getProperty("os.name"));
            System.out.println(" " + System.getProperty("os.version"));
            System.out.println ("By: Blu");
            System.out.println ("Coded for Hack Club High Seas on November 24th 2024");

        }





    }
}