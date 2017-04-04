package com.zafzal

class Book {
	String title
	String subject
	String author
	String isbn
	Date dateBorrowed
	Date returnDate
	String name
	Boolean overdue

    static constraints = {
	title blank:false, nullable:false
	subject blank:false, nullable:false
	author blank:false, nullable:false
	isbn blank:false, nullable:false, minSize:13, maxSize:13
	dateBorrowed blank:false, nullable:false
	returnDate blank:false, nullable:false
	name blank:false, nullable:false
    }
}
