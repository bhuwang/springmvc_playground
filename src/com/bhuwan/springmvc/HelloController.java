/**
 * 
 */
package com.bhuwan.springmvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

/**
 * @author bhuwan
 *
 */
public class HelloController extends ParameterizableViewController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Inside Hello Controller which extends ParameterizableViewController........");
        String name = req.getParameter("name");
        Map<String, String> map = new HashMap<String, String>();
        map.put("greetings", "Hello " + name + "!");
        return new ModelAndView(getViewName(), map);
    }

}
