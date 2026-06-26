package org.saswat.code.service;

import org.modelmapper.ModelMapper;
import org.saswat.code.dto.DepartmentDTO;
import org.saswat.code.entity.Department;
import org.saswat.code.exception.DepartmentNotFoundException;
import org.saswat.code.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    DepartmentRepository departmentRepository;
    ModelMapper modelMapper;

    public DepartmentService(DepartmentRepository departmentRepository, ModelMapper modelMapper) {
        this.departmentRepository = departmentRepository;
        this.modelMapper = modelMapper;
    }

    public List<DepartmentDTO> getAllDepartments() {

        List<Department> allDepartments = departmentRepository.findAll();
        return allDepartments
                .stream()
                .map(department -> modelMapper.map(department, DepartmentDTO.class))
                .toList();
    }

    public DepartmentDTO getDepartmentById(Long id) {
        Department department = departmentRepository.findById(id).orElseThrow(() -> new DepartmentNotFoundException("Department with id " + id + " not found"));
        return modelMapper.map(department, DepartmentDTO.class);
    }

    public DepartmentDTO createDepartment(DepartmentDTO inputDto) {
        Department department = modelMapper.map(inputDto, Department.class);
        Department savedDepartment = departmentRepository.save(department);
        return modelMapper.map(savedDepartment, DepartmentDTO.class);
    }

    public DepartmentDTO updateDepartment(Long id, DepartmentDTO inputDto) {
        Department existing = departmentRepository.findById(id)
                .orElseThrow(() -> new DepartmentNotFoundException("Department with id " + id + " not found"));

        existing.setTitle(inputDto.getTitle());
        existing.setActive(inputDto.isActive());
        departmentRepository.save(existing);

        return modelMapper.map(existing, DepartmentDTO.class);

    }

    public void deleteDepartment(Long id) {
        boolean isExist = isDepartmentExist(id);
        if (!isExist) throw new DepartmentNotFoundException("Department with id " + id + " not found");
        departmentRepository.deleteById(id);
    }

    private boolean isDepartmentExist(Long id) {
        return departmentRepository.existsById(id);
    }
}
