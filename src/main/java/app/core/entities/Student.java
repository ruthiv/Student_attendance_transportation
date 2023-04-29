package app.core.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
@Builder
@EqualsAndHashCode(of = "id")
@ToString(exclude = "teacher")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private int id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false , unique = true)
    private String phone;
    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Transportion numClass;
    @Column(nullable = false)
    private boolean isTravel;
    private Cause cause;
    @Column(nullable = false)
    private String pickupAddress;
    @Column(nullable = false)
    private int numBus;
    @Column(nullable = false)
    private Hour hour;
    private String remark;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;


    public enum Hour{
        THIRTEEN, SIXTEEN;
    }

    public enum Cause{
        RELEASE, ABSENCE,OTHER;
    }
}
