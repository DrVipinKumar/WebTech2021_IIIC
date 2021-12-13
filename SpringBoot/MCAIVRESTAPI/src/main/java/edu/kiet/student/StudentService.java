package edu.kiet.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
            @Autowired
			StudentDAO sd;
            public List<Student> getStudents()
            {
            	return sd.findAll();
            }
            
            public Student addStudent(Student st)
            {
            	sd.save(st);
            	return st;
            }
            public Student updateStudent(Student st)
            {
            	sd.save(st);
            	return st;
            }
            public Student deleteStudent(long sid)
            {
            	Student ss=sd.getById(sid);
            	sd.delete(ss);
            	return ss;
            }
            public Student getStudent(long sid)
            {
            	Student ss=sd.getById(sid);
            	return ss;
            }
}
