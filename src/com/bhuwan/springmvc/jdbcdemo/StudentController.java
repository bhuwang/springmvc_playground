/**
 * 
 */
package com.bhuwan.springmvc.jdbcdemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * @author bhuwan
 *
 */
public class StudentController extends MultiActionController {

    private StudentService service;

    public ModelAndView create(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setPhone(phone);
        service.save(student);
        return new ModelAndView("list");
    }

    /**
     * @return the service
     */
    public StudentService getService() {
        return service;
    }

    /**
     * @param service
     *            the service to set
     */
    public void setService(StudentService service) {
        this.service = service;
    }
}
