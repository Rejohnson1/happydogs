package com.lmig.gfc.happydogs.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//typical order in a file: privates, constructors, protected

@Entity
public class Dog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // to create the unique ID
	private Long id; // upper case L with "Long" so the value can be nullable. Object vs. a
						// primitive("long", can only be an integer and cannot be null).
	private int weightInPounds;

	@Column(length = 15)
	private String breed;

	@Column(nullable = false)
	private String name;
	private double heightInInches;
	private String gender;
	private String color;
	private int numberOfLegs;
	private boolean isHappy;
	private Date birthDate;

	public Dog() {
	} // first contructor so you can create a new instance of dog that has nothing in
		// it

	public Dog(int weightInPounds, String breed, String name, double heightInInches, String gender, String color,
			int numberOfLegs, boolean isHappy, Date birthDate) {
		this.weightInPounds = weightInPounds;
		this.breed = breed;
		this.name = name;
		this.heightInInches = heightInInches;
		this.gender = gender;
		this.color = color;
		this.numberOfLegs = numberOfLegs;
		this.isHappy = isHappy;
		this.birthDate = birthDate;
	}

	public int getWeightInPounds() {
		return weightInPounds;
	}

	public void setWeightInPounds(int weightInPounds) {
		this.weightInPounds = weightInPounds;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeightInInches() {
		return heightInInches;
	}

	public void setHeightInInches(double heightInInches) {
		this.heightInInches = heightInInches;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public boolean isHappy() {
		return isHappy;
	}

	public void setHappy(boolean isHappy) {
		this.isHappy = isHappy;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
