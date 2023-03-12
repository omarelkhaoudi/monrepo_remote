package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public boolean selectAll() {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public StudentDto update(StudentDto dto) {
        return null;
    }

    @Override
    public StudentDto save(StudentDto dto) {
        return null;
    }

    @Override
    public List<StudentDto> readAll() {
        return null;
    }

    @Override
    public long create(StudentDto dto) {
        return 0;
    }
}
