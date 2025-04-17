package com.javaguides.SpringAssignment1;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "courses")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Course name must not be blank")
    @Size(min = 2, max = 50, message = "Course name must be between 2 and 50 characters")
    @Column(length = 50, name = "name", nullable = false)
    @ValidCourseName
    private String name;

    @NotBlank(message = "Category must not be blank")
    @Size(min = 2, max = 50, message = "Category must be between 2 and 50 characters")
    @Column(length = 50, nullable = false, name = "category")

    @ValidCategory
    private String category;
}





