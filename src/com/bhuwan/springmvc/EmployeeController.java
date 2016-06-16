/**
 * 
 */
package com.bhuwan.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * @author bhuwan
 *
 */
public class EmployeeController extends MultiActionController {

    public ModelAndView save(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("Inside EmployeeController save method.......");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        System.out.println("Name: " + name + " Phone: " + phone);
        return new ModelAndView("success");
    }

    public ModelAndView update(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("Inside EmployeeController update method.......");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        System.out.println("ID: " + id + " Name: " + name + " Phone: " + phone);
        return new ModelAndView("success");
    }
}
