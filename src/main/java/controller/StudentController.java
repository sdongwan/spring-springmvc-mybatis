package controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.StudentService;

/**
 * Created by Administrator on 2017/6/8.
 */
@Controller
public class StudentController {
    private static Logger logger = Logger.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/addStu")
    public String addStudent() {
        studentService.addStudent();
        logger.info("logger================================");
        return "index";
    }

}
