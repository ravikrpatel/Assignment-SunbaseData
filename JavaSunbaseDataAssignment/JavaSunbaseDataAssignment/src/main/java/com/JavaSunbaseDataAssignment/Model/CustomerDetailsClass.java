package com.JavaSunbaseDataAssignment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Entity
public class CustomerDetailsClass {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public  int id;
    public String first_name;
    public String last_name;
    public String street;
    public String city;
    public String state;
    public String email;
    public String phone;



}
    
    
