package edu.kiet.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyController {

	@Autowired
	StudentService students;
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		return students.getStudents();
	}
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student st)
	{
		return students.addStudent(st);
	}
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student st)
	{
		return students.updateStudent(st);
	}
	@DeleteMapping("/students/{sid}")
	public Student deleteStudent(@PathVariable long sid)
	{
		return students.deleteStudent(sid);
	}
	@GetMapping("/students/{sid}")
	public Student getStudent(@PathVariable long sid)
	{
		return students.getStudent(sid);
	}
}
