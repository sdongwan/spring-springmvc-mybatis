import org.junit.Test;
import service.StudentService;

/**
 * Created by Administrator on 2017/6/8.
 */

public class StudentServiceTest {

    @Test
    public void addStudent(){
        StudentService studentService=new StudentService();
        studentService.addStudent();

    }
}
