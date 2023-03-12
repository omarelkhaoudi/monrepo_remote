package ma.pfe.services;

import ma.pfe.dtos.StudentDto;

import java.util.List;

public interface StudentService {
    boolean selectAll();

    boolean delete(long id);

    StudentDto update(StudentDto dto);

    StudentDto save(StudentDto dto);

    List<StudentDto> readAll();

    long create(StudentDto dto);
}
