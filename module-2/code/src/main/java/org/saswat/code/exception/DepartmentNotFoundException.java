package org.saswat.code.exception;

public class DepartmentNotFoundException extends ResourceNotFoundException {
    public DepartmentNotFoundException(String message) {
        super(message);
    }
}
