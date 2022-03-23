package com.example.demo.Generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<T, I extends java.io.Serializable> extends JpaRepository<T, I>, JpaSpecificationExecutor<T> {}
