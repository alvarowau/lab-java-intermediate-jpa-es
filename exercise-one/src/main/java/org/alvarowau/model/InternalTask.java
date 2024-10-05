package org.alvarowau.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("INTERNAL")
public class InternalTask extends Task {
    public InternalTask() {}

    public InternalTask(String title, LocalDate dueDate, boolean status) {
        super(title, dueDate, status);
    }
}
