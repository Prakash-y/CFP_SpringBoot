package com.bridgelabcfp.SpringBootP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabcfp.SpringBootP.entity.ModelDemo;

@Repository
public interface RepositoryDemo extends JpaRepository<ModelDemo, Integer> {

}
