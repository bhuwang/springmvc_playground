/**
 * 
 */
package com.bhuwan.springmvc.jdbcdemo;

import java.util.List;

/**
 * @author bhuwan
 *
 */
public interface StudentService {

    public int save(Student stu) throws Exception;

    public boolean update(Student stu) throws Exception;

    public boolean delete(Student stu) throws Exception;

    public Student findByPk(Student stu) throws Exception;

    public List<Student> findByName(Student stu) throws Exception;

    public Student findByEmail(Student stu) throws Exception;

    public Student findByPhone(Student stu) throws Exception;

}
