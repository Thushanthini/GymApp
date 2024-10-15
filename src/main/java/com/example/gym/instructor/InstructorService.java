package com.example.gym.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorService {
    @Autowired
    private InstructorRepository instructorRepo;

    public List<Instructor> listAll() {
        return (List<Instructor>) instructorRepo.findAll();
    }


    public void save(Instructor instructor) {
        instructorRepo.save(instructor);
    }

    public Instructor get(Integer id) throws InstructorNotFoundException {
        Optional<Instructor> result = instructorRepo.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        throw new InstructorNotFoundException("Could not find any instructor with ID " + id);
    }

    public void delete(Integer id) throws InstructorNotFoundException {
        Long count = instructorRepo.countById(id);
        if (count == null || count == 0) {
            throw new InstructorNotFoundException("Could not find any instructor with ID " + id);
        }
        instructorRepo.deleteById(id);
    }
}
