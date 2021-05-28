package APCSA;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    //Add new members to memberList & names is a non-empty array
    //Initially good standing, allow in any order
    //Parameter is a list of names to be added, and graduation year
    public void addMembers (String[] names, int gradYear) {
        for (int i = 0; i < names.length; i++) {
            memberList.add(new MemberInfo(names[i] ,  gradYear, true));
        }

        //However, in case of iterate through string array, better choice is for each loop
//        for (String i: names) {
//            memberList.add(new MemberInfo(i,gradYear,true));
//        }
    }
    //return student with goodStanding, gradyear <= year, if none return empty list
    //remove list who graduated, regardless goodStanding
    public ArrayList<MemberInfo> removeMembers (int year) {
        //Standard arraylist
        ArrayList<MemberInfo> hasGoodStanding = new ArrayList<MemberInfo>();

        for (int i = 0; i < memberList.size(); i++) {
            MemberInfo name = memberList.get(i);
            if (name.getGradYear() <= year) {
                //Create a memberInfo object which get record who will get graduate and removed from arraylist
                MemberInfo removed = memberList.remove(i);
                if (removed.inGoodStanding()) {
                    //Add whoever is about to graduate and in goodStanding to the arraylist that has been created in this method
                    hasGoodStanding.add(removed);
                }
            }
        }
        return hasGoodStanding;
    }

}
