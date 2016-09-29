package ex.com.sjunijen.study10;
import java.util.ArrayList;

public class School {
    ArrayList<Student> students = new ArrayList<Student>();

    //students 리스트의 값을 가져온다.
    public ArrayList<Student> getStudents() {
        return students;
    }
    //students 리스트의 값을 설정한다.
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    //student 인스턴스를 받아서 students 리스트에 추가 해 준다.
    public void addItem(Student exStudent){
        students.add(exStudent);
    }

    //students 리스트의 크기를 반환 해 준다.
    public int studentSize(){
        return students.size();
    }
}