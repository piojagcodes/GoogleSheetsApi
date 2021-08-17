package pl.jagiello.GoogleSheetsApi.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;


@Data
@AllArgsConstructor
@Entity

public class Employers {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employers employers = (Employers) o;
        return Objects.equals(id, employers.id) && Objects.equals(FirstName, employers.FirstName) && Objects.equals(LastName, employers.LastName) && Objects.equals(Gender, employers.Gender) && Objects.equals(Age, employers.Age) && Objects.equals(Email, employers.Email) && Objects.equals(Phone, employers.Phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, FirstName, LastName, Gender, Age, Email, Phone);
    }

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)

    //Getter and Setter's
    private Long id;
    private String FirstName;
    private String LastName;
    private String Gender;
    private Integer Age;
    private String Email;
    private String Phone;

    @Override
    public String toString() {
        return "Employers{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Age=" + Age +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }




    // Constructor with parameteres
    public Employers(Long id, String FirstName, String LastName, String Gender) {}



    }