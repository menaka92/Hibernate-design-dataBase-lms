# Hibernate Library Management System

This is a simple **Library Management System** built using **Hibernate** and **MySQL**. It manages books, authors, categories, users, and loans in a library.

---

## Entities and Relationships

### 1. **Book**
- Represents a book in the library.
- Attributes:
  - `id` (Primary Key)
  - `name`
  - `price`
  - `qty` (Quantity)
- Relationships:
  - **Many-to-One** with `Author`: A book is written by one author.
  - **Many-to-One** with `Category`: A book belongs to one category.
  - **One-to-One** with `Loan`: A book can be associated with one loan.

### 2. **Author**
- Represents the author of a book.
- Attributes:
  - `id` (Primary Key)
  - `name`
- Relationships:
  - **One-to-Many** with `Book`: An author can write many books.

### 3. **Category**
- Represents the category of a book (e.g., Fiction, Non-Fiction).
- Attributes:
  - `id` (Primary Key)
  - `name`
- Relationships:
  - **One-to-Many** with `Book`: A category can have many books.

### 4. **User**
- Represents a library user.
- Attributes:
  - `id` (Primary Key)
  - `name`
  - `email`
  - `password`
  - `role` (e.g., Librarian, Member)
- Relationships:
  - **One-to-Many** with `Loan`: A user can have many loans.

### 5. **Loan**
- Represents a book loan (issuing and returning books).
- Attributes:
  - `id` (Primary Key)
  - `issuedDate`
  - `dueDate`
  - `returnDate`
  - `fineAmount`
- Relationships:
  - **Many-to-One** with `User`: A loan is associated with one user.
  - **One-to-One** with `Book`: A loan is associated with one book.

---

## Technologies Used
- **Hibernate** (ORM Framework)
- **MySQL** (Database)
- **Java** (Programming Language)

---

## How to Run the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/menaka92/Hibernate-design-dataBase-lms.git
