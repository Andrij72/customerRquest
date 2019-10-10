package com.akulynych.dto;

import com.akulynych.model.Status;
import lombok.Getter;
import lombok.Builder;
import lombok.Setter;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
public class CustomerRequestDto {
    private Long customerid;
    private Timestamp registrationDate;
    private String requestName;
    private String customerName;
    private String attachedDocuments;
    private Status status;
}
