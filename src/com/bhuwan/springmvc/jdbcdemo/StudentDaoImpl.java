/**
 * 
 */
package com.bhuwan.springmvc.jdbcdemo;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * @author bhuwan
 *
 */
public class StudentDaoImpl implements StudentDao {

    private HibernateTemplate template;

    @Override
    public int save(Student stu) throws Exception {
        int i = (Integer) template.save(stu);
        return i;
    }

    @Override
    public boolean update(Student stu) throws Exception {
        template.update(stu);
        return true;
    }

    @Override
    public boolean delete(Student stu) throws Exception {
        template.delete(stu);
        return true;
    }

    @Override
    public Student findByPk(long pk) throws Exception {
        Student stu = (Student) template.get(Student.class, pk);
        return stu;
    }

    @Override
    public List<Student> findAll() throws Exception {
        List<Student> list = template.find("from Student");
        return list;
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

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

}
