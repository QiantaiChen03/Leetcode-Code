package APCSA;

import APCSA.SingleTable;

public class CombinedTable extends SingleTable {
    private SingleTable t1;
    private SingleTable t2;


    public CombinedTable (SingleTable t1, SingleTable t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    public boolean canSeat (int num) {
        int seat = t1.getNumSeats();
        int seat2 = t2.getNumSeats();
        int totalSeats = seat + seat2 - 2;
        if (num <= totalSeats) {
            return true;
        } else {
            return false;
        }
    }

    public double getDesirability () {
        double t1ViewQuanlity = t1.getViewQuanlity();
        double t2ViewQuanlity = t2.getViewQuanlity();
        //First Case
        double averageViewQualities = (t1ViewQuanlity + t2ViewQuanlity) / 2;

        //if same height then divide it by two;
        if (t1.getHeight() == t2.getHeight()) {
            return averageViewQualities;
        }
        // Second case if the height is not the same then average - 10
        else if (t1.getHeight() != t2.getHeight()) {
            return averageViewQualities - 10;
        }
        return -1;
    }

}
