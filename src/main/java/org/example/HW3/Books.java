package org.example.HW3;

import lombok.Data;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class Books {
    String name;
    String author;
    Integer price;
    Integer year;
    Integer pages;

}
