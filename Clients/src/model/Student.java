/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author maiva
 */
public class Student implements Serializable{
        final  static  long  serialVersionUID = 1530518821806965426L;
     String id;

    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Student{" + "id=" + id + '}';
    }
}
