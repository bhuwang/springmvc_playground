/**
 * 
 */
package com.bhuwan.springmvc.jdbcdemo;

import java.util.List;

/**
 * @author bhuwan
 *
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao dao;

    @Override
    public int save(Student stu) throws Exception {
        return dao.save(stu);
    }

    @Override
    public boolean update(Student stu) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete(Student stu) throws Exception {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Student findByPk(Student stu) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Student> findByName(Student stu) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Student findByEmail(Student stu) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Student findByPhone(Student stu) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @return the dao
     */
    public StudentDao getDao() {
        return dao;
    }

    /**
     * @param dao
     *            the dao to set
     */
    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

}
