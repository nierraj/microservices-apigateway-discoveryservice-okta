package com.neeraj.hotel.services;

import com.neeraj.hotel.entites.Hotel;

import java.util.List;

public interface HotelService {

    //create

    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get single
    Hotel get(String id);

}
