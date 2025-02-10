package com.developer.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int bookId;
    @Column
    private String bookname;
    @Column
    private String author;
    @Column
    private double price;
}
