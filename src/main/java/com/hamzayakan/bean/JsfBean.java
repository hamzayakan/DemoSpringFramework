package com.hamzayakan.bean;

import lombok.Getter;
import lombok.Setter;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "cdiBean")
@RequestScoped
@Setter @Getter
public class JsfBean {

    private String patika;

    public JsfBean() {

        patika="Spring Boot Eğitimine Hoşgeldiniz";
    }

}
