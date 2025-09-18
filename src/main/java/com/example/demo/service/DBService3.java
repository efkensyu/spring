package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bumon;
import com.example.demo.repositories.BumonRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DBService3 {
	private final BumonRepository repository;			
		
	public List<Bumon> findByBumonCd(String code){		
		//自動生成した場合
		return repository.findByBumonCd(code);
		
		//@Queryした場合
		//return repository.findBumonCd(code);
	}	
}
