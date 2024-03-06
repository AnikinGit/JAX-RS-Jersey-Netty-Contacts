package org.example.app.domain.contact;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Override
    public String toString() {
        return "{" +
                "\"id\" : " + id +
                ", \"name\" : \"" + name + "\"" +
                ", \"phone\" : \"" + phone + "\"" +
                "}";
    }

}
