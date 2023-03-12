package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")

public class StudentController {
    private final static Logger LOG = LoggerFactory.getLogger(StudentController.class);
    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public long create(@RequestBody StudentDto dto) {
        LOG.debug("create dto:{}");
        return service.create(dto);
    }

    @PutMapping
    public StudentDto update(@RequestBody StudentDto dto) {
        LOG.debug("update dto:{}");
        return service.update(dto);
    }

    @DeleteMapping
    public boolean delete(@PathVariable("id") long id) {
        LOG.debug("start delete dto{}", id);
        return service.delete(id);
    }


    @GetMapping
    public List<StudentDto> readAll() {
        return service.readAll();
    }
}