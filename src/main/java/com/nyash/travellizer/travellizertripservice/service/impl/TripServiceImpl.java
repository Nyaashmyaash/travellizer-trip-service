package com.nyash.travellizer.travellizertripservice.service.impl;



import com.nyash.travellizer.travellizertripservice.model.Route;
import com.nyash.travellizer.travellizertripservice.model.Trip;
import com.nyash.travellizer.travellizertripservice.service.TripService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class TripServiceImpl implements TripService {
    @Override
    public List<Route> findRoutes(String start, String destination) {
        return null;
    }

    @Override
    public Optional<Route> findRouteById(int id) {
        return Optional.empty();
    }

    @Override
    public void saveRoute(Route route) {

    }

    @Override
    public void deleteRoute(int routeId) {

    }

    @Override
    public List<Trip> findTrips(int routeId) {
        return null;
    }

    @Override
    public Optional<Trip> findTripById(int id) {
        return Optional.empty();
    }

    @Override
    public void saveTrip(Trip trip) {

    }

    @Override
    public void deleteTrip(int tripId) {

    }

    @Override
    public Trip findTrip(int routeId, LocalDate date) {
        return null;
    }

    @Override
    public Trip saveTrip(int routeId, LocalDate date) {
        return null;
    }
}
