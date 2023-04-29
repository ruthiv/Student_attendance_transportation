package app.core.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transportions")
@Builder
@EqualsAndHashCode(of = "id")
@ToString(exclude = "students")
public class Transportion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private int id;
    @Column(nullable = false)
    private int numBus;
    @OneToMany(mappedBy = "student")
    private List<Student> students;
}
