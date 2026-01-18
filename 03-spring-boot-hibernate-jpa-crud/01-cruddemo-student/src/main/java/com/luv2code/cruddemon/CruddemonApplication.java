package com.luv2code.cruddemon;

import com.luv2code.cruddemon.dao.StudentDAO;
import com.luv2code.cruddemon.dao.StudentDAOImpl;
import com.luv2code.cruddemon.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemonApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
		//	createStudent(studentDAO);
			createMultipleStudent(studentDAO);
		};
	}

	private void createMultipleStudent(StudentDAO studentDAO) {

		//create the student object
		System.out.println("Creating new student object....");
		Student tempStudent1=new Student("Sam","Yadav","samr2dhiya@gamil.com");
		Student tempStudent2 = new Student("Royal","Singh","royal@gamil.com");
		Student tempStudent3 =new Student("Khushi","Singh","Khushi@gmail.com");

		//display id of the saved student
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);




	}

	private void createStudent(StudentDAO studentDAO) {

		//create the student object
		System.out.println("Creating new student object....");
		Student tempStudent =
				new Student("Paul", "Doe", "paul@luv2code.com");

		//save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		//display id of the saved student
		System.out.println("Saved student .generated id :"+ tempStudent.getId());
	}

}
