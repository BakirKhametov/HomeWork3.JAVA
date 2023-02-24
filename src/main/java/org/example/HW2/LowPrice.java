package org.example.HW2;
import lombok.Data;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor

public class LowPrice {
    String name;
    String country;
    Integer weight;
    Integer price;
    Integer grade;
}
