package com.ulbra.poo.ap2.kleiton_ap2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Client {
    private int id;
    private String name;
    private int age;
    private String profession;

    public int getId() {
        return id;
    }
}
