package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public long create(StudentEntity e) {
        return 0;
    }

    @Override
    public boolean update(StudentEntity e) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<StudentEntity> readAll() {
        return null;
    }
}