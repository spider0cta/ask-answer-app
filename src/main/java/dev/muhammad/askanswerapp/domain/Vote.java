package dev.muhammad.askanswerapp.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Vote {

    @Id
    @GeneratedValue
    private long id;
    private int vote;


}
