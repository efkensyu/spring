package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity		
@Table(name="BUMON_TBL")
@Data
public class Bumon {		
	@Id	
	// リポジトリでfindBy・・・を作る際に
	//メソッド名に _ があるとコンパイルエラーになってしまう。
	// エンティティ名にアンダースコアをつけないこと
	// × findByBumon_cd
	// ○ findByBumonCd
	//@Column(name = "bumon_cd")
	private String bumonCd;
	//@Column(name = "bumon_nm")
	private String bumonNm;		
}		
