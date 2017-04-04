package com.zafzal

class Course {
	String title
	String code
	String leader
	String department
	String description
	Boolean studyMode

    static constraints = {
	title blank:false, nullable:false
	code blank:false, nullable:false
	leader blank:false, nullable:false
	department blank:false, nullable:false
	description blank:false, nullable:false
    }
}
