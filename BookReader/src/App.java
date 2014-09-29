import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eyup.book.reader.dao.PersonDaoImpl;
import com.eyup.book.reader.model.Person;


public class App {

		public static void main(String[] args){
			ClassPathXmlApplicationContext context = new
					ClassPathXmlApplicationContext("applicationContext.xml");
			PersonDaoImpl pDao = (PersonDaoImpl) context.getBean("personDao");
			
			Person eyup = new Person("Eyup", "Cingel");
			Person dilek = new Person ("Dilek","Cingel");
			
			pDao.save(eyup);
			pDao.save(dilek);
			
			List<Person> persons = pDao.getAll();
			
			for(Person person : persons){
				System.out.println(person);
			}
			
			context.close();
		}
}
