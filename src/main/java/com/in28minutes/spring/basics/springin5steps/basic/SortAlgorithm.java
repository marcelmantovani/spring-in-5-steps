package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.stereotype.Service;

@Service
public interface SortAlgorithm {
	public int[] sort(int[] numbers);
}
