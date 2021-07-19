package dev.muhammad.askanswerapp.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable{

    @Id
    @GeneratedValue
    private long id;
    private String body;

    //Link
    @ManyToOne
    private Link link;
}
