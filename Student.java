package ex.com.sjunijen.study10;

/**
 * Created by 시은 on 2016-09-11.
 */
public class Student {
    private int sAge;
    private String sName;

    //생성할 때 바로 넣을 수 있도록
    public Student(String sName, int sAge){
        this.sName = sName;
        this.sAge = sAge;
    }

    public void setsAge(int sAge)       { this.sAge = sAge;   }
    public void setsName(String sName)  { this.sName = sName; }
    public String getsName()    { return sName; }
    public int getsAge()        { return sAge;  }
}
