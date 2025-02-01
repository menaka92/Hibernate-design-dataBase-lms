import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "author")
public class Author {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",nullable = false)
    private String name;

    //==========//
      @OneToMany(mappedBy = "author")
      private  Set<Book> books = new HashSet<>();
    //==========//
}
