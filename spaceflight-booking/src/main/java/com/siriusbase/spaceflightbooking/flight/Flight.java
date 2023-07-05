package com.siriusbase.spaceflightbooking.flight;

import com.siriusbase.spaceflightbooking.flightorder.FlightOrder;
import com.siriusbase.spaceflightbooking.flightorder.FlightStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private FlightOrder flightOrderId;

    @Enumerated(EnumType.ORDINAL)
    private FlightStatus status;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy proxy
                ? proxy.getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy proxy
                ? proxy.getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Flight flight = (Flight) o;
        return getId() != null && Objects.equals(getId(), flight.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}
