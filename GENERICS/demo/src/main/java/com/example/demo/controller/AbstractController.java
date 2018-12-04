package com.example.demo.controller;

import com.example.demo.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.util.List;

public abstract class AbstractController<E, R extends JpaRepository> {

    @Autowired
    private ApplicationContext context;

    protected R repo;

    @PostConstruct
    public void init() {
//        Field[] fields = this.getClass().getDeclaredFields();
//        for (Field f : fields) {
//            try {
//                f.set(this, context.getBean(f.getType()));
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }


    }

    public List<E> getAll() {
        return repo.findAll();
    }
}
