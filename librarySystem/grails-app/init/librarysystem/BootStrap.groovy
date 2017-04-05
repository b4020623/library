package librarysystem

import com.zafzal.Librarian
class BootStrap {

def init = { servletContext ->
	new Librarian(name:'Harrison Slater', email:'hslater@email.com', office:'44', username:'hslater', password:'password', telephone:'01111111111', library:'Shu').save()
	new Librarian(name:'Max Atkins', email:'matkins@email.com', office:'69', username:'matkins', password:'cats', telephone:'012345678901', library: 'Shu').save()
    }
    def destroy = {
    }
}
