package com.senla.elhoteladmin.service;

import com.senla.elhoteladmin.entity.AdditionalService;
import com.senla.elhoteladmin.entity.BookingOrder;

import java.util.List;

public interface IBookingOrderService {
    List<BookingOrder> getLastThreeGuestsRoom(Integer roomNumber);

    List<BookingOrder> getListBookingOrders();

    List<BookingOrder> getListGuestsAndTheirRoomsSortedByRoom();

    List<BookingOrder> getListGuestsAndTheirRoomsSortedByCheckOutDays();

    void saveNewBookingOrder(BookingOrder order);

    List<AdditionalService> getListAdditionalServiceOfGuestSortedByPrice(Integer guestID);
}
