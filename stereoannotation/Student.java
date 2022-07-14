package com.stereoannotation;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Vaibhav Gupta")
	private String name;
	@Value("Ayodhya")
	private String city;
	@Value("28")
	private int age;
	@Value("#{listID}")
	List<Integer> marks;
	@Value("#{setId}")
	Set<String> places;
	@Value("#{mapId}")
	Map<String, Integer> productPrice;
	@Value("#{propertiesId}")
	Properties clothes;
	
	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public String getName() {
		System.out.println("Getting name");
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}

	public String getCity() {
		System.out.println("Getting city");
		return city;
	}

	public void setCity(String city) {
		System.out.println("Setting city");
		this.city = city;
	}

	public int getAge() {
		System.out.println("Getting age");
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setting age");
		this.age = age;
	}

	public String toString() {
		System.out.println("To string method\n");
		return "Student name->" + name + "\nStudent city->" + city + "\nStudent age->" + age + "\nStudent marks->"
				+ marks+"\nPlaces->"+places+"\nProduct price->"+productPrice+"\nClothes detail->"+clothes;
	}
}
