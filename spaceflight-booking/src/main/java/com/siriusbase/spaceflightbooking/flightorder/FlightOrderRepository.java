package com.siriusbase.spaceflightbooking.flightorder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightOrderRepository extends JpaRepository<FlightOrder, Long> {
}
