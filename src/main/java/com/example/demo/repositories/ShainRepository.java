package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Shain;

//@Repository
public interface ShainRepository extends JpaRepository<Shain, String> {
	// Containingを使った場合
	public List<Shain> findByShainNmContaining(String ShainNm);
	
	public List<Shain> findByShainNmContainingOrderByNenreiAsc(String ShainNm);
	
	public List<Shain> findByShainNmStartingWith(String ShainNm);
	// likeを使った場合
	public List<Shain> findByShainNmLike(String ShainNm);
	
}
