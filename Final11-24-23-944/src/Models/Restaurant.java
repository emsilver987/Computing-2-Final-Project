package Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import BaseClasses.CapacityCheckinBase;
import Interfaces.IReservation;

public class Restaurant extends CapacityCheckinBase implements IReservation {

    
    List<Reservation> reservations = new ArrayList<Reservation>();

    public Restaurant(int maxCapacity) {
        super(maxCapacity);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void MakeReservation(Date dateOfReservation, Member member) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'MakeReservation'");
    }
    
}
