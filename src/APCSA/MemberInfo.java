package APCSA;

public class MemberInfo {
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    public MemberInfo (String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    public int getGradYear () {
        return this.gradYear;
    }

    public boolean inGoodStanding () {
        return this.hasGoodStanding;
    }
}
