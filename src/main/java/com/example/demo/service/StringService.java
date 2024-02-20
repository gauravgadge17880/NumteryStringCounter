package com.example.demo.service;

import org.springframework.stereotype.Service;


import com.example.demo.model.StringModel;

@Service
public class StringService {


	public StringModel getString(String str) {
		
		int alphabet = 0;
		int digit = 0;
		int sysmbol = 0;
		int space=0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				alphabet++;
			} else if (Character.isDigit(ch)) {
				digit++;
			} else if(Character.isSpace(ch)){
				space++;
			}else {
				sysmbol++;
			}
		}

		StringModel count = new StringModel(alphabet, digit, sysmbol);
		System.out.println(count);
		return count;

	}

}
