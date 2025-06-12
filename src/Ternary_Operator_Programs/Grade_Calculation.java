package Ternary_Operator_Programs;

public class Grade_Calculation {

    public static void main(String[] args) {

        int marks = 60;

        String grade = (marks >= 90) ? "A+" : (marks >= 75) ? "A" : (marks >= 60) ? "B" : (marks >= 40) ? "C":"Fail";
        System.out.println(grade);

    }
}
