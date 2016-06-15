/**
 * 
 */
package com.bhuwan.springmvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author bhuwan
 *
 */
public class HelloController implements Controller {

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Inside Hello Controller using controller class name handler mapping........");
        String name = req.getParameter("name");
        Map<String, String> map = new HashMap<String, String>();
        map.put("greetings", "Hello " + name + "!");
        return new ModelAndView("hello", map);
    }

}
