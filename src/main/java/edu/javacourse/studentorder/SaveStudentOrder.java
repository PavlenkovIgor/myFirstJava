package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.other.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {


        // StudentOrder so = new StudentOrder();

//        StudentOrder so1 = new StudentOrder();
//        so.hFirstName = "Igor1";
//        so.hLastName = "Pavlenkov1";
//        so.wFirstName = "Meghan1";
//        so.wLastName = "Markle1";


        //  long ans = saveStudentOrder(so);
        //  System.out.println(ans);

    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer;
        answer = 199;
        System.out.println("saveStudentOrder:");
        return answer;
    }

    static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setSudenOrderId(id);

        Adult husband = new Adult("Petrov","Ivan","Ivanov",null);

        return so;
    }
}
