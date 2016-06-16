/**
 * 
 */
package com.bhuwan.springmvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author bhuwan
 *
 */
public class HelloController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Inside Hello Controller which extends AbstractController........");
        String name = req.getParameter("name");
        Map<String, String> map = new HashMap<String, String>();
        map.put("greetings", "Hello " + name + "!");
        return new ModelAndView("hello", map);
    }

}
