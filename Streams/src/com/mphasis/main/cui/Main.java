package com.mphasis.main.cui;
import com.mphasis.entities.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//	int result=0;
//	for(int num:numbers){
//	    if(num%2 == 0)
//	        result+=num*2;
//    }

//		int result=numbers.stream()
//				.filter(value -> value%2 == 0)
//				.mapToInt(value -> value*2)
//				.sum();
		//System.out.println(result);

//		numbers.parallelStream()
//				.sequential()
//				.forEach((value -> System.out.println(Thread.currentThread()+String.valueOf(value))));
//
//		numbers.stream()
//				.map(String::valueOf)
//				.forEach(System.out::println);

//		  result=numbers.stream()
//				  //.reduce(0,(total,element) -> Integer.sum(total,element)); //using lambda
//				.reduce(2,Integer::sum);    //method reference

//		String result = numbers.stream()
//				.map(String::valueOf)
//				.reduce("",(ConcatStr,element) -> ConcatStr.concat(element));

//		List<Integer> doubleOfEven = new ArrayList<Integer>();
//
//		doubleOfEven=numbers.stream()
//				.filter(element -> element%2 == 0)
//				.map(element -> element*2)
//				.collect(Collectors.toList());
//				//.forEach(element -> doubleOfEven.add(element));
//		System.out.println(doubleOfEven);

		List<Person> people = createPeople();

		Map<Integer,Person> result = people.stream()
				.collect(Collectors.toMap(person -> person.getId(),person -> person));
		System.out.println(result);

		Map<Integer,List<Person>> AgeGroup = people.stream()
				.collect(Collectors.groupingBy(Person::getAge));
		System.out.println(AgeGroup+"\n");

		Map<Integer,List<String>> AgeGroup1 = people.stream()
				.collect(Collectors.groupingBy(Person::getAge,Collectors.mapping(Person::getName,Collectors.toList())));
		System.out.println(AgeGroup1);

	}
		public static List<Person> createPeople(){
			return Arrays.asList(
					new Person(1,"Allen",30),
					new Person(2,"Susan",30),
					new Person(3,"Peter",36),
					new Person(4,"Ravi",32),
					new Person(5,"Seetha",38),
					new Person(6,"Smith",36)
			);
		}

    }

