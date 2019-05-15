package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.*;

public class StudentValidator {
      public   AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Студенты проверяются");
        AnswerStudent ans = new AnswerStudent();
        return ans;
    }

    public static class StudentOrderValidator {
        public static void main(String[] args) {

            checkAll();
        }

        static void checkAll() {
            while (true) {
                StudentOrder so = readStudentOrder();
                if (so == null) {
                    break;
                }

                AnswerCityRegister cityAnswer = checkCityRegister(so);
                if (!cityAnswer.success) {
                    continue;
                }
                AnswerWedding wedAnswer = checkWedding(so);
                AnswerChildren childAnswer = checkChildren(so);
                AnswerStudent sudentAnswer = checkStudent(so);
                sendMail(so);
            }
        }


                static StudentOrder readStudentOrder () {
                    StudentOrder so = new StudentOrder();
                    return null;
                }


                static AnswerCityRegister checkCityRegister (StudentOrder so){
                    CityRegisterValidator crv1 = new CityRegisterValidator();
                    crv1.hostName = "Host1";
                    crv1.login = "login1l";
                    crv1.password = "password1";
    //                edu.javacourse.studentorder.validator.CityRegisterValidator crv2 = new edu.javacourse.studentorder.validator.CityRegisterValidator();
    //                crv2.hostName = "Host2";
    //                crv1.login = "login12";
    //                crv1.password = "password2";

                    AnswerCityRegister ans1 = crv1.checkCityRegister(so);
    //                edu.javacourse.studentorder.domain.AnswerCityRegister ans2 = crv2.checkCityRegister(so);
                      return ans1;
                }

                static AnswerWedding checkWedding (StudentOrder so){
                 WeddingValidator wd = new WeddingValidator();
                 return wd.checkWedding(so);
                }
                public static AnswerChildren checkChildren (StudentOrder so){
                    ChildrenValidator ch = new ChildrenValidator();
                    return ch.checkChildren(so);

                }
                static AnswerStudent checkStudent (StudentOrder so){
                    StudentValidator st = new StudentValidator();
                    return st.checkStudent(so);
                   }
                static void sendMail (StudentOrder so){
                    System.out.println("Почта отправлена");

                }


            }
}
