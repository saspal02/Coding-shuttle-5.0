package org.saswat.code.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DepartmentDTO {


    private Long id;

    @NotEmpty(message = "Department name must not be empty")
    @NotBlank(message = "Department name must not be blank")
    @NotNull(message = "Department name must not be null")
    @Length(min = 3, max = 50, message = "Department name must be between 3 and 50 characters")
    private String title;

    @NotNull(message = "Department active must not be null")
    @JsonProperty("isActive")
    private Boolean isActive;

    @PastOrPresent(message = "Timestamp must be in the past or present")
    private LocalDateTime createdAt;

    //Added fields
}
