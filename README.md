# 📚 Java Library Management System

A simple **console-based library management system** written in Java.  
It was designed as a **junior Java developer practice project** to demonstrate:
- File-based persistence (no databases required)
- Separation of concerns (services, stores, UI, models)
- User authentication with roles (`user` / `admin`)
- Loan and return functionality with history tracking

---

## 🚀 Features

### Users
- Register new accounts with username, password, and role
- Login as `user` or `admin`

### User Role
- Search for books by code
- Loan available books
- Return books you borrowed
- View your personal loan/return history

### Admin Role
- Add new books
- Delete existing books
- View all currently loaned books

### Persistence
- **Users** stored in `users.properties` (`username=password:role`)
- **Books** stored in `books.csv` (`code,title,author,availability,loanedBy`)
- **Loan history** stored in `loans.csv` (`user,code,action,timestamp`)

---

## 🗂️ Project Structure

src/
└── com/riki
├── Main.java # Entry point
├── io/
│ └── ConsoleIO.java # Console I/O wrapper
├── model/
│ ├── Book.java # Book entity
│ └── User.java # User record
├── service/
│ ├── AuthService.java # Login & registration
│ └── LibraryService.java # Library operations
├── store/
│ ├── UsersStore.java # Manages users.properties
│ ├── BooksStore.java # Manages books.csv
│ └── HistoryStore.java # Manages loans.csv
└── ui/
├── MainMenu.java # Login / Register
├── UserMenu.java # User options
└── AdminMenu.java # Admin options

## 📂 File Formats

### `users.properties`
alice=secret123:user
bob=qwerty:user
admin=admin123:admin

### `books.csv`
code,title,author,availability,loanedBy
B001,1984,George Orwell,true,
B002,Dune,Frank Herbert,true,
B003,To Kill a Mockingbird,Harper Lee,false,alice

### `loans.csv`
user,code,action,timestamp
alice,B001,LOAN,2025-09-18T10:15:30Z
alice,B001,RETURN,2025-09-20T15:20:10Z
