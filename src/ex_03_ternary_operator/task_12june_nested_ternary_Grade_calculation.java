package ex_03_ternary_operator;

public class task_12june_nested_ternary_Grade_calculation {
    public static void main(String[] args) {
//        Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
/* Logic building :
Input is taken as integers and output should be in String
if marks is 90 then grade is A+
if marks is 75 then grade is A
if marks is 60 then grade is B
if marks is 40 then grade is C
if marks is below 40 then grade is fail

m>40 ? ((m ==40) ? "C":(((m==60)?:"B"):(m==75)? "A" :) (m==90)? : "A+") : "F";
m>40? ((m==40) ? C : ((m==60) ? B : ((m==75)? A : ((m==95) ? A+ )))) : F
 */
        int m = 39;
        String grade= m>39? ((m==40) ? "C" : ((m==60) ? "B" : ((m==75)? "A" : ((m==90) ? "A+": "Class Topper")))): "Fail";
        System.out.println(grade);
        m=40;
        grade= m>39? ((m==40) ? "C" : ((m==60) ? "B" : ((m==75)? "A" : ((m==90) ? "A+": "Class Topper")))): "Fail";
        System.out.println(grade);
        m=60;
        grade= m>39? ((m==40) ? "C" : ((m==60) ? "B" : ((m==75)? "A" : ((m==90) ? "A+": "Class Topper")))): "Fail";
        System.out.println(grade);
        m=75;
        grade= m>39? ((m==40) ? "C" : ((m==60) ? "B" : ((m==75)? "A" : ((m==90) ? "A+": "Class Topper")))): "Fail";
        System.out.println(grade);
        m=90;
        grade= m>39? ((m==40) ? "C" : ((m==60) ? "B" : ((m==75)? "A" : ((m==90) ? "A+": "Class Topper")))): "Fail";
        System.out.println(grade);
        m=99;
        grade= m>39? ((m==40) ? "C" : ((m==60) ? "B" : ((m==75)? "A" : ((m==90) ? "A+": "Class Topper")))): "Fail";
        System.out.println(grade);
    }
}
