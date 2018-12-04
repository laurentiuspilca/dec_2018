package com.example.demo.controller;

import com.example.demo.entities.Product;
import com.example.demo.repo.ProductRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController extends AbstractController<Product, ProductRepository> {
}
