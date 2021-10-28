package org.lnt.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
	public static void main(String[] args) {
		List<Integer> aslist = Arrays.asList(12,11,34,44,15,13,90);
		System.out.println(aslist);
		
		Stream<Integer> stream = aslist.stream();
		List<Integer> newList= aslist.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		List<Integer> newList1= aslist.stream().filter(i->i<40).collect(Collectors.toList());
		System.out.println(newList1);
		
	}

}
