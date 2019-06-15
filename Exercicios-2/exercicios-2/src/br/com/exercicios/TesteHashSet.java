package br.com.exercicios;

import java.util.Set;

public class TesteHashSet {

	public static void main(String[] args) {
		
		Set<Interger> hashSet = new HashSet<Integer>();
		
		hashSet.add(12);
		hashSet.add(11);
		hashSet.add(9);
		hashSet.add(1);
		hashSet.add(3);

		hashSet.remove(3);
		
		System.out.println(hashSet);
	}

}
