import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "category")
public class Category {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    //==========//
    @OneToMany(mappedBy = "category")
    private Set<Book> books = new HashSet();
    //==========//
}
