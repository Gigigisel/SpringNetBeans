/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ipn.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Giselle
 */
public class TestAdmin {
    
    public static void main(String[] args) {
        ApplicationContext applicationcontext= new ClassPathXmlApplicationContext ("springcontext.xml");
        Administrador administrador = (Administrador) applicationcontext.getBean("admin");
        System.out.println(":::"+administrador);
    }
    
}
