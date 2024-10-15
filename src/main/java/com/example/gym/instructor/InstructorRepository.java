package com.example.gym.instructor;

import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor, Integer> {
    public Long countById(Integer id);
}
