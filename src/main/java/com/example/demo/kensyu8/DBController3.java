package com.example.demo.kensyu8;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Bumon;
import com.example.demo.service.DBService3;

import lombok.RequiredArgsConstructor;				
		
//DBController2をコピーして作る
//GETだった処理がPOSTにくるので注意
//部門コードで絞り込むようにする
@Controller		
@RequiredArgsConstructor
public class DBController3 {		
	private final DBService3 dbService3;			
		
	@GetMapping("/dbsample")			
	public String index () {
		return "kensyu8/DB1_1";		
	}	
	@PostMapping("/dbsample")			
	public String send (@RequestParam("BumonCd") String code,Model model) {
		List<Bumon> userDataList = dbService3.findByBumonCd(code);
		//System.out.println(userDataList.get(0));
		model.addAttribute("userDataList",userDataList);
		return "kensyu8/DB1_2";		
	}							
}				
