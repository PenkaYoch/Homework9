package fmi.informatics.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import fmi.informatics.extending.Student;

public class StudentStreamUtils{
	
	public static void main(String[] args) {
		System.out.println("Task1:");
		System.out.println("--------------------------");
		task1();
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		System.out.println("Task2:");
		System.out.println("--------------------------");
		task2();
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		System.out.println("Task3:");
		System.out.println("--------------------------");
		task3();
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		System.out.println("Task4:");
		System.out.println("--------------------------");
		task4();
	}
	
	static void task1() {
		Stream.of(
				Student.StudentGenerator.make(), 
				Student.StudentGenerator.make())
		.filter(s -> s.getName().length() > 4)
		.sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
		.forEach(System.out::println);
	}
	
	public static List<Student> task1ForTest() {
		return Stream.of(
				Student.StudentGenerator.make(), 
				Student.StudentGenerator.make())
		.filter(s -> s.getName().length() > 4)
		.sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
		.collect(Collectors.toList());
	}
	
	static void task2() {
		Stream.of("Coffee", "Hot chocolate", "Coca-cola", "Wine", "whisky", "water")
		.map(String::toUpperCase)
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
	
	public static List<String> task2ForTest() {
		return Stream.of("coffee", "hot chocolate", "coca-cola", "Wine", "whisky", "water")
		.map(String::toUpperCase)
		.collect(Collectors.toList());
	}
	
	static void task3() {
		List<Student> students = new ArrayList<Student>();
		for (int i = 0; i < 15; ++i) 
			students.add(Student.StudentGenerator.make());
		String studNames = students.stream()
		.sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
		.map(s -> s.getName())
		.reduce((s1, s2) -> {
		if (s2 != null) return s1 + ", " + s2;
		return s1;
		}).get();
		System.out.println(studNames);
	}
	
	public static String task3ForTest() {
		List<Student> students = new ArrayList<Student>();
		for (int i = 0; i < 15; ++i) 
			students.add(Student.StudentGenerator.make());
		String studNames = students.stream()
		.sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
		.map(s -> s.getName())
		.reduce((s1, s2) -> {
		if (s2 != null) return s1 + ", " + s2;
		return s1;
		}).get();
		return studNames;
	}
	
	static void task4() {
		IntStream.iterate(0, i -> i + 1)
		.skip(5)
		.limit(10)
		.forEach(i -> {
		if (i % 2 == 0) System.out.println(i);
		});
	}
}
