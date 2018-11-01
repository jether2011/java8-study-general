package com.jetherrodrigues.oca.collections;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSumarize {

	public static void main(String[] args) {
		
		List<Item> items = Arrays.asList(
                
				// 30 - 39.98
				new Item("banana", 10, new BigDecimal("19.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                
                //40 - 29,97
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );

        List<Item> sumarize = 
        		items.stream().collect(Collectors.groupingBy(Item::getName))
        		.entrySet().stream()
        		.map(e -> 
        			e.getValue().stream()
        				.reduce((fa, fb) -> new Item(fa.getName(), (fa.getQty() + fb.getQty()), fa.getPrice().add(fb.getPrice())))
        				
        		).map(f -> f.get())
        		.collect(Collectors.toList());
        		
		System.out.println(sumarize);
	}

}
