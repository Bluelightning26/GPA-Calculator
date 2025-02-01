import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class GPA implements ActionListener
    {

    JFrame frame;
    JPanel panel;

    JLabel period1;
    JComboBox gradeSelector1;
    JComboBox creditSelector1;

    JLabel period2;
    JComboBox gradeSelector2;
    JComboBox creditSelector2;

    JLabel period3;
    JComboBox gradeSelector3;

    JLabel period4;
    JComboBox gradeSelector4;

    JLabel period5;
    JComboBox gradeSelector5;

    JLabel period6;
    JComboBox gradeSelector6;


    JButton submitButton;

    String[] gradeTypes = { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F" };





    public GPA() {

        frame = new JFrame("GPA Calculator");

        panel = new JPanel();

        period1 = new JLabel("Period 1");
        period2 = new JLabel("Period 2");
        period3 = new JLabel("Period 3");
        period4 = new JLabel("Period 4");
        period5 = new JLabel("Period 5");
        period6 = new JLabel("Period 6");




        gradeSelector1 = new JComboBox(gradeTypes);
        gradeSelector1.addActionListener(this);
//        creditSelector1 = new JComboBox(gradeTypes);
//        creditSelector1.addActionListener(this);
//        creditSelector1.removeAll();

        gradeSelector2 = new JComboBox(gradeTypes);
        gradeSelector2.addActionListener(this);
//        creditSelector2 = new JComboBox(gradeTypes);
//        creditSelector2.addActionListener(this);
//        creditSelector2.removeAll();

        gradeSelector3 = new JComboBox(gradeTypes);
        gradeSelector3.addActionListener(this);

        gradeSelector4 = new JComboBox(gradeTypes);
        gradeSelector4.addActionListener(this);

        gradeSelector5 = new JComboBox(gradeTypes);
        gradeSelector5.addActionListener(this);

        gradeSelector6 = new JComboBox(gradeTypes);
        gradeSelector6.addActionListener(this);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);


        panel.add(period1);
        panel.add(gradeSelector1);
        //panel.add(creditSelector1);
        panel.add(period2);
        panel.add(gradeSelector2);
        //panel.add(creditSelector2);
        panel.add(period3);
        panel.add(gradeSelector3);
        panel.add(period4);
        panel.add(gradeSelector4);
        panel.add(period5);
        panel.add(gradeSelector5);
        panel.add(period6);
        panel.add(gradeSelector6);
        panel.add(submitButton);


        panel.setBorder(BorderFactory.createEmptyBorder(50, 80, 50, 80));
        //panel.setLayout(new GridLayout(2, 5));
        frame.add(panel);
        frame.setSize(350,465);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


    public static void main(String[] args) {
        new GPA();
    }



    public void Old() {
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
        for (int i = 1; i <= classnum; i++)
            {
            System.out.println("Enter your course name:");
            String courseName = sc.next();
            System.out.println("How many credits is " + courseName + " worth?");
            double credit = sc.nextDouble();
            System.out.println("What is your letter grade in " + courseName + "?");
            String letterGrade = sc.next();


            //grade index
            switch (letterGrade)
                {
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
            //System.out.println("User: " + System.getProperty("user.name"));  //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
            System.out.print("Operating System: " + System.getProperty("os.name"));
            System.out.println(" " + System.getProperty("os.version"));
            System.out.println("By: Blu");
            System.out.println("Coded for Hack Club High Seas on February 1st 2025");

            }
    }

    double currentGPA;

    String X;
    int xInc = 1;

    public void increment() {
        switch (xInc){
        case 1: X = gradeSelector1.getSelectedItem().toString();
        System.out.println("Grade: " + X);
        break;

        case 2: X = gradeSelector2.getSelectedItem().toString();
        System.out.println("Grade: " + X);
        break;

        case 3: X = gradeSelector3.getSelectedItem().toString();
        System.out.println("Grade: " + X);
        break;

        case 4: X = gradeSelector4.getSelectedItem().toString();
        System.out.println("Grade: " + X);
        break;

        case 5: X = gradeSelector5.getSelectedItem().toString();
        System.out.println("Grade: " + X);
        break;

        case 6: X = gradeSelector6.getSelectedItem().toString();
        System.out.println("Grade: " + X);
        break;

        default:
            done = true;
            ans();
        }
        xInc++;
        calculate();
    }


    public void calculate() {

        switch (X)
            {
        case "A+": currentGPA = 4.3;
        break;
        case "A": currentGPA = 4.0;
        break;
        case "A-": currentGPA = 3.7;
        break;
        case "B+": currentGPA = 3.3;
        break;
        case "B": currentGPA = 3.0;
        break;
        case "B-": currentGPA = 2.7;
        break;
        case "C+": currentGPA = 2.3;
        break;
        case "C": currentGPA = 2.0;
        break;
        case "C-": currentGPA = 1.7;
        break;
        case "D+": currentGPA = 1.3;
        break;
        case "D": currentGPA = 1.0;
        break;
        case "D-": currentGPA = 0.7;
        break;
        case "F": currentGPA = 0.00;
        break;
        }
        System.out.println("Current GPA: " + currentGPA);
        GPA += currentGPA;
        increment();
    }


    boolean done = false;
    double GPA = 0;

    public void ans () {

        if (done){
        GPA /= 6;
        System.out.println("Your GPA is: " + GPA);
        JOptionPane.showMessageDialog(null, "Your GPA is: " + GPA);
        end();
        }


    }

    public void end() {
        System.exit(0);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

//        gradeSelector1 = (JComboBox)e.getSource();
//        String p1 = (String) gradeSelector1.getSelectedItem();
//        System.out.print(p1);
//
//        gradeSelector2 = (JComboBox)e.getSource();
//        String p2 = (String) gradeSelector2.getSelectedItem();
//        System.out.print(p2);
//
//        gradeSelector3 = (JComboBox)e.getSource();
//        String p3 = (String) gradeSelector3.getSelectedItem();
//        System.out.print(p3);
//
//        gradeSelector4 = (JComboBox)e.getSource();
//        String p4 = (String) gradeSelector4.getSelectedItem();
//        System.out.print(p4);
//
//        gradeSelector5 = (JComboBox)e.getSource();
//        String p5 = (String) gradeSelector5.getSelectedItem();
//        System.out.print(p5);
//
//        gradeSelector6 = (JComboBox)e.getSource();
//        String p6 = (String) gradeSelector6.getSelectedItem();
//        System.out.print(p6);

        System.out.print(frame.getSize());

        if (e.getSource() == submitButton)
            {
            increment();
            }

    }
    }