/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CounterView implements Serializable {

    private int number;

    public int getNumber() {
        System.out.println("sdasdasdasd");
        return number;
    }

    public void increment() {
        number++;
    }
}
