package com.biz.ajax.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.biz.ajax.model.ProductVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductService {
	
	String fileName="product.txt";
	
	
	public List<ProductVO> getProduct() {
		ClassPathResource cpr = new ClassPathResource(fileName);
		
		InputStreamReader is;
		BufferedReader buffer;
		
		try {
			is= new InputStreamReader(cpr.getInputStream());
			buffer = new BufferedReader(is);
			List<ProductVO> plist = new ArrayList<ProductVO>();
			String line="";
			
			while(true) {
				line = buffer.readLine();
				if(line==null) break;
				String[] lines = line.split(":");
				
				ProductVO vo = new ProductVO();
				vo.setP_ccode(lines[0]);
				vo.setP_cname(lines[1]);
				vo.setP_vat(lines[2]);
				vo.setP_iprice(lines[3]);
				vo.setP_oprice(lines[4]);
				
				plist.add(vo);
			}
			return plist;
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
}
