package com.siriusbase.spaceflightbooking.carrier;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Carrier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
