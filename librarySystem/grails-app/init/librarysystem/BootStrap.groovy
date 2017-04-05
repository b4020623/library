package librarysystem

import com.zafzal.Librarian
import com.zafzal.Book
import com.zafzal.BookReview
import com.zafzal.Course
import com.zafzal.Library

class BootStrap {

def init = { servletContext ->
	new Librarian(name:'Harrison Slater', email:'hslater@email.com', office:'44', username:'hslater', password:'password', telephone:'01111111111', library:'Shu').save()
	new Librarian(name:'Max Atkins', email:'matkins@email.com', office:'69', username:'matkins', password:'cats', telephone:'012345678901', library: 'Shu').save()
	new Book(title:'Harry Potter', subject:'fantasy', author:'J.K Rowling', isbn:'1111111111111', dateBorrowed:new Date('20/10/2016'), returnDate:new Date('01/01/2017'), name:'John J', overdue:false).save()
	new Book(title:'Lord of the Rings', subject:'fantasy', author:'J.R Tolkien', isbn:'1111111111122', dateBorrowed:new Date('22/01/2017'), returnDate:new Date('05/06/2017'), name:'Jordan Ash', overdue:false).save()
	new BookReview(book:'The Hunger Games', dateCreated:new Date('22/01/2017'), student:'Michael D', review:'Quite an enjoyable book, would recommend').save()
	new BookReview(book:'Geography of Britain', dateCreated:new Date('23/01/2017'), student:'Reiss W', review:'Very Informative').save()
	new Course(title:'Computing', code:'Comp', leader:'David Cameron', department:'IT', description:'Earn a degree based in IT', studyMode:true).save()
	new Course(title:'Biology', code:'Bio', leader:'Kenny S', department:'Science', description:'Earn a degree based in Biology', studyMode:true).save()
	new Library(building:'SHU', name:'SHU', address:'10 Owen Way', openingHours:'9am-6pm', location:'Owen Building', studySpaces:'60').save()
	new Library(building:'Cantor', name:'Can', address:'10 Leaf Way', openingHours:'9am-6pm', location:'Cantor Building', studySpaces:'84').save()
	
	
    }
    def destroy = {
    }
}
