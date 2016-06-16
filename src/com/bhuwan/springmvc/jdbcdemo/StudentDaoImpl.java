/**
 * 
 */
package com.bhuwan.springmvc.jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

/**
 * @author bhuwan
 *
 */
public class StudentDaoImpl implements StudentDao {

    private DataSource datasrouce;

    @Override
    public int save(Student stu) throws Exception {
        Connection con = datasrouce.getConnection();
        String sql = "Insert into student(name,email,phone)values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, stu.getName());
        ps.setString(2, stu.getEmail());
        ps.setString(3, stu.getPhone());
        return ps.executeUpdate();
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
     * @return the datasource
     */
    public DataSource getDatasource() {
        return datasrouce;
    }

    /**
     * @param datasource
     *            the datasource to set
     */
    public void setDatasource(DataSource ds) {
        this.datasrouce = ds;
    }

}
