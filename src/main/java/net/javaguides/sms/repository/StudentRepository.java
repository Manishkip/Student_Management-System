package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.Student;

//@Repository
//@Transactional
public interface StudentRepository extends JpaRepository<Student, Long> {

}
