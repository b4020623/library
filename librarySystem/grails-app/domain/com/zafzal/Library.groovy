package com.zafzal

class Library {
	String building
	String name
	String address
	String openingHours
	String location
	int studySpaces
    static constraints = {
	building blank:false, nullable:false
	name blank:false, nullable:false
	address blank:false, nullable:false
	openingHours blank:false, nullable:false
	location blank:false, nullable:false
	studySpaces blank:false, nullable:false
    }
}
