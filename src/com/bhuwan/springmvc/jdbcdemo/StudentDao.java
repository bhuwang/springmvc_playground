/**
 * 
 */
package com.bhuwan.springmvc.jdbcdemo;

import java.util.List;

/**
 * @author bhuwan
 *
 */
public interface StudentDao {

    public int save(Student stu) throws Exception;

    public boolean update(Student stu) throws Exception;

    public boolean delete(Student stu) throws Exception;

    public List<Student> findByName(Student stu) throws Exception;

    public Student findByEmail(Student stu) throws Exception;

    public Student findByPhone(Student stu) throws Exception;

    Student findByPk(long pk) throws Exception;

    public List<Student> findAll() throws Exception;
}
