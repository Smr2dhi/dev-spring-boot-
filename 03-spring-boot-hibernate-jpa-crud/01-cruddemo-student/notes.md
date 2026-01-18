# Spring Boot JPA CRUD Notes

## Project Flow
Application Start
→ CommandLineRunner
→ DAO
→ EntityManager
→ Database
→ ID Generated
→ Object Updated

---

## Entity
@Entity → maps class to table  
@Id → primary key  
@GeneratedValue → DB handles ID

---

## DAO Pattern
Interface → loose coupling  
Implementation → DB logic

---

## EntityManager Methods
persist() → insert  
find() → select  
merge() → update  
remove() → delete

---
