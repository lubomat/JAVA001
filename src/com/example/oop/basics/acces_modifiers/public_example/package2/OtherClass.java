package com.example.oop.basics.acces_modifiers.public_example.package2;

import com.example.oop.basics.acces_modifiers.public_example.package1.BasicClass;

public class OtherClass extends BasicClass {
    public OtherClass() {
        name = "OtherClass";
        this.setName("OtherClass");
    }
}
