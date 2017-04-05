package librarysystem

import com.zafzal.Librarian
import com.zafzal.Book
class BootStrap {

def init = { servletContext ->
	new Librarian(name:'Harrison Slater', email:'hslater@email.com', office:'44', username:'hslater', password:'password', telephone:'01111111111', library:'Shu').save()
	new Librarian(name:'Max Atkins', email:'matkins@email.com', office:'69', username:'matkins', password:'cats', telephone:'012345678901', library: 'Shu').save()
	new Book(title:'Harry Potter', subject:'fantasy', author:'J.K Rowling', isbn:'1111111111111', dateBorrowed:new Date('20/10/2016'), returnDate:new Date('01/01/2017'), name:'John J', overdue:true).save()
	new Book(title:'Lord of the Rings', subject:'fantasy', author:'J.R Tolkien', isbn:'1111111111122', dateBorrowed:new Date('22/01/2017'), returnDate:new Date('05/06/2017'), name:'Jordan Ash', overdue:true).save()
    }
    def destroy = {
    }
}
