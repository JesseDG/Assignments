/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import com.mvc.model.user_info;
import com.mvc.dao.MasterDAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Elritmico
 */

@Transactional
public class UserInfoDAOImpl implements MasterDAO<user_info>{
    
    private SessionFactory sessionFactory;
    
    public UserInfoDAOImpl(SessionFactory sf){
        this.sessionFactory = sf;
    }
    
    @Override
    public void add(user_info ui){
        Session session = sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
            session.save(ui);
        }
        catch(HibernateException e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        
        session.getTransaction().commit();
    }
}
