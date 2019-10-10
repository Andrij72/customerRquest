package com.akulynych.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer_request")
public class CustomerRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerid;

    @Column(name = "date_registration")
    private Timestamp registrationDate;

    @Column(name = "request_name")
    private String RequestName;

    @Column(name = "customer_name")
    private String CustomerName;

    @Column(name = "attached_documents")
    private String attachedDocuments;

    @Column(name = "rq_status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Override
    public String toString() {
        return "CustomerRequest[" + "customerid=" + customerid +
                ", registrationDate=" + registrationDate +
                ", RequestName='" + RequestName + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", attachedDocuments=" + attachedDocuments +
                ", status=" + status +
                ']';
    }
}
