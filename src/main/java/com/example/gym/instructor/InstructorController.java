package com.example.gym.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class InstructorController {
    @Autowired
    private InstructorService instructorService;

    @GetMapping("/instructors")
    public String showInstructorList(Model model) {
        List<Instructor> listInstructors = instructorService.listAll();
        model.addAttribute("listInstructors", listInstructors);
        return "instructors";
    }

    @GetMapping("/instructors/new")
    public String showNewForm(Model model) {
        model.addAttribute("instructor", new Instructor());
        model.addAttribute("pageTitle2", "Add New Instructors");
        return "instructor_form";
    }

    @PostMapping("/instructors/save")
    public String saveInstructor(Instructor instructor, RedirectAttributes ra) {
        instructorService.save(instructor);
        ra.addFlashAttribute("message2", "The instructor has been saved successfully. ");
        return "redirect:/instructors";
    }

    @GetMapping("/instructors/edit/{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ra) {
        try {
            Instructor instructor = instructorService.get(id);
            model.addAttribute("instructor", instructor);
            model.addAttribute("pageTitle2", "Edit Instructor "+ id );
            return "instructor_form";
        } catch (InstructorNotFoundException e) {
            ra.addFlashAttribute("message2", e.getMessage());
            return "redirect:/instructors";
        }
    }

    @GetMapping("/instructors/delete/{id}")
    public String deleteInstructor(@PathVariable("id") Integer id, RedirectAttributes ra){
        try {
            instructorService.delete(id);
            ra.addFlashAttribute("message2", "The instructor ID " + id + " has been deleted. ");
        } catch (InstructorNotFoundException e) {
            ra.addFlashAttribute("message2", e.getMessage());
        }
        return "redirect:/instructors";
    }
}
