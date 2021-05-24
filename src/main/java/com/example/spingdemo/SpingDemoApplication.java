package com.example.spingdemo;

import com.example.spingdemo.data.entity.Guest;
import com.example.spingdemo.data.entity.Reservation;
import com.example.spingdemo.data.entity.Room;
import com.example.spingdemo.data.repository.GuestRepository;
import com.example.spingdemo.data.repository.ReservationRepository;
import com.example.spingdemo.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpingDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpingDemoApplication.class, args);
    }

    @RestController
    @RequestMapping("/rooms")
    public class RoomController {
        @Autowired
        private RoomRepository roomRepository;

        @GetMapping
        private Iterable<Room> getRooms() {
            return this.roomRepository.findAll();
        }
    }

    @RestController
    @RequestMapping("/guests")
    public class GuestController{
        @Autowired
        private GuestRepository guestRepository;

        @GetMapping
        public Iterable<Guest> getGuests(){return this.guestRepository.findAll();}
    }

    @RestController
    @RequestMapping("/reservations")
    public class ReservationController{
        @Autowired
        private ReservationRepository reservationRepository;

        @GetMapping
        public Iterable<Reservation> getReservations(){return this.reservationRepository.findAll();}
    }

}
