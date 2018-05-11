package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("studentAction")
public class StudentAction {
    @Autowired//默认按照类型
    private StudentService studentService;
    public void ececute() {
        studentService.addStudent();
    }
}
