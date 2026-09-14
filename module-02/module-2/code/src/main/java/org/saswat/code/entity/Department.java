package org.saswat.code.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;
import org.saswat.code.annotations.PasswordValidation;

import java.time.LocalDateTime;

@Entity
@Table(name = "department")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Null(message = "Id must be null while creating")
    private Long id;

    @NotBlank(message = "Title cannot be blank")
    @Length(min = 3, max = 50)
    private String title;

    @JsonProperty("isActive")
    @AssertTrue(message = "Department must be active")
    private boolean isActive;

    @PastOrPresent(message = "Created date cannot be in future")
    private LocalDateTime createdAt;

    // Added fields

    @NotNull
    @Size(min = 3, max = 20)
    private String departmentCode;

    @PasswordValidation
    private String password;

    @Min(1)
    @Max(1000)
    private Integer employeeCount;

    @DecimalMin(value = "1000.50")
    @DecimalMax(value = "1000000.99")
    private Double budget;

    @Negative
    private Integer debtAmount;

    @NegativeOrZero
    private Integer previousYearLoss;

    @Positive
    private Integer currentYearProfit;

    @PositiveOrZero
    private Integer reserveFund;

    @Digits(integer = 10, fraction = 2)
    private Double annualRevenue;

    @Past
    private LocalDateTime establishedDate;

    @Future
    private LocalDateTime nextAuditDate;

    @FutureOrPresent
    private LocalDateTime nextMeetingDate;

    @Pattern(
            regexp = "^[A-Z]{3}-\\d{3}$",
            message = "Format must be ABC-123"
    )
    private String departmentReference;

    @Email
    private String departmentEmail;

    @NotEmpty
    private String description;

    @Range(min = 1, max = 5)
    private Integer departmentRating;

    @CreditCardNumber
    private String corporateCardNumber;

    @URL
    private String websiteUrl;

    @AssertFalse
    private boolean archived;
}