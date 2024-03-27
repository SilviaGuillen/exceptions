package org.example;

import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    StudentService studentService = new StudentService();

    @Test
    void findStudentById_whenStudentIDDoesNotExists_thenReturnException() {

        assertThrows(NoSuchElementException.class, () -> studentService.findStudentById("123456"));
    }
}

