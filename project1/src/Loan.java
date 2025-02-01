import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "loan")
public class Loan {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "issued_date", nullable = false, columnDefinition = "DATETIME")
    private Date issuedDate;
    @Column(name = "due_date", nullable = false, columnDefinition = "DATETIME")
    private Date dueDate;
    @Column(name = "return_date", nullable = true, columnDefinition = "DATETIME")
    private Date returnDate;
    @Column(name = "fine_amount", nullable = false)
    private double fineAmount;

    //==========//
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToOne
    @JoinColumn(name = "book_id", nullable = false,unique = true)
    private Book book;
    //==========//
}
