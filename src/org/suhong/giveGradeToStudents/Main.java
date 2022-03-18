package org.suhong.giveGradeToStudents;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Su Hong", generateRandomScore());
        Student student2 = new Student("Eun Jin", generateRandomScore());
        Student student3 = new Student("Ye Rin", generateRandomScore());
        Student student4 = new Student("Lee Tae Hwan", generateRandomScore());
        Student[] students = {student1, student2, student3, student4};

        /* **** 아래 메소드를 구현하시오 **** */
        Solution.giveGradeToStudents(students);
        /*
         * 현재 모든 학생들의 성적(grade)는 null 상태 입니다.
         * 학생의 이름과 시험 점수는 알고 있기 때문에
         * 학생의 점수에 따라 성적을 메기는 giveGradeToStudents를 완성해주세요.
         * A : 90점 이상
         * B : 80점 이상 90점 미만
         * C : 70점 이상 80점 미만
         * D : 60점 이상 70점 미만
         * F : 나머지
         * %%% 함수의 return 타입과 input parameter 조건은 변경하지 말것. %%%
         */

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static int generateRandomScore() {
        // 0부터 100 => 100가지 숫자가 아닌 101가지 숫자임에 주의!
        // 만약 100으로하면 0부터 99까지만 나옴.
        return (int) (Math.random() * 101);
    }
}
