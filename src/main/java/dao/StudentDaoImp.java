package dao;

import bean.StudentBean;
import mapper.StudentMapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/6/8.
 */

@Repository
public class StudentDaoImp implements StudentDao {


    @Autowired
    private StudentMapper studentMapper;


    private SqlSessionFactoryBean sqlSessionFactoryBean;


    public StudentDaoImp() {

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        studentMapper = (StudentMapper) applicationContext.getBean("studentMapper");


    }

    public int insertStudent(StudentBean studentBean) {

        int result = studentMapper.insertStudent(studentBean);

        return result;
    }

    public int deleteStudentById(int id) {

        int result = studentMapper.deleteStudentById(id);

        return result;
    }

    public StudentBean selectStudentById(int id) {

        StudentBean result = studentMapper.selectStudentById(id);

        return result;
    }

    public int updateStudenById(StudentBean studentBean) {

        int result = studentMapper.updateStudenById(studentBean);

        return result;
    }

    public List<StudentBean> selectAllStudents() {
        return null;
    }
}
