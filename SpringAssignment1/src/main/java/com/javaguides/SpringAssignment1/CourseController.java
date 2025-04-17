package com.javaguides.SpringAssignment1;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import jakarta.validation.Valid;
import java.util.concurrent.ConcurrentHashMap;





@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
class CourseController {
    private final CourseRepository courseRepository;

    @PostMapping("/add")
    public ResponseEntity<Course> createCourse(@Valid@RequestBody Course course) {

        return ResponseEntity.status(200).body(
                this.courseRepository.save(course)
        );
    }

    // Read all
    @GetMapping("/all")
    public ResponseEntity<Collection<Course>> getAllCourses() {
        return ResponseEntity.status(200).body(
                this.courseRepository.findAll().stream().toList()
        );
    }

    // Read one
    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourse(@PathVariable Long id) {
        return ResponseEntity.status(200).body(
                this.courseRepository.findById(id).orElseThrow()
        );

    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable Long id,
                                               @Valid @RequestBody Course updatedCourse) {
        Course course = this.courseRepository.findById(id).orElseThrow();
        course.setName(updatedCourse.getName());
        course.setCategory(updatedCourse.getCategory());
        return ResponseEntity.status(200).body(
                this.courseRepository.save(course)
        );
    }


    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable Long id) {
        try {
            this.courseRepository.deleteById(id);
            return "Course deleted successfully";
        }catch (Exception e) {
            return "Course not found.";
        }
    }

}

