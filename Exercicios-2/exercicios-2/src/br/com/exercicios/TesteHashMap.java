package br.com.exercicios;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("Segunda-Feira", 100);
		hashMap.put("Terça-Feira", 50);
		hashMap.put("Quarta-Feira", 25);
		
		System.out.println(hashMap.containsKey("Segunda-Feira"));
		System.out.println("");

	}

}
