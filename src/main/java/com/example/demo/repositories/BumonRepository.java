package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Bumon;

//@Repository
public interface BumonRepository extends JpaRepository<Bumon, String> {
	// 最初は何も定義しなくていい（findAllメソッドは継承して使えるため）
	// DBService3.javaで使用する
	public List<Bumon> findByBumonCd(String code);
	
	// DBService3.javaで使用する
	//@Query(value = "select * from bumon_tbl where bumon_cd = :code" , nativeQuery = true)
	//ublic List<Bumon> findBumonCd(@Param("code") String code);
}
