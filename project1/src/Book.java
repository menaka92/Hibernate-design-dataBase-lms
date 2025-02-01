import javax.persistence.*;

@Entity(name = "book")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "qty", nullable = false)
    private int qty;

    //==========//
    @ManyToOne()
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    @ManyToOne()
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @OneToOne(mappedBy = "book")
    private  Loan loan;
    //==========//

}
