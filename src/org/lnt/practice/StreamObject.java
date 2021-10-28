package org.lnt.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		
		//empty string
		Stream<Object> empty = Stream.empty();
		empty.forEach(e->System.out.println(e));
		
		//arrays ,objects,collections
		List<Integer> aslist = Arrays.asList(121,11,34,44,15,13,44,90,121);
		List<Integer> count = aslist.stream().distinct().collect(Collectors.toList());
		System.out.println(count);
	
	}

}
