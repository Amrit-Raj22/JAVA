class Location {
    String street;
    String city;

    public Location(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}

class Address {
    Location location;
    String state;
    String country;

    public Address(Location location, String state, String country) {
        this.location = location;
        this.state = state;
        this.country = country;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    // // TODO Auto-generated method stub
    // return super.clone();
    // }

}

class UPIPaymentApps implements Cloneable {
    String appName;
    String country;
    int dailyLimit;
    double maxDailyAmount;
    Address headOfficeLocation;

    public UPIPaymentApps(String appName, String country, int dailyLimit, double maxDailyAmount,
            Address headOfficeLocation) {
        this.appName = appName;
        this.country = country;
        this.dailyLimit = dailyLimit;
        this.maxDailyAmount = maxDailyAmount;
        this.headOfficeLocation = headOfficeLocation;
    }

    protected Object clone() throws CloneNotSupportedException {
        Location location = new Location(headOfficeLocation.location.street, headOfficeLocation.location.city);
        Address address = new Address(location, headOfficeLocation.state, headOfficeLocation.country);
        return new UPIPaymentApps(appName, country, dailyLimit,
                maxDailyAmount, address);
    }

    @Override
    public String toString() {
        return "UPIPaymentApps [appName=" + appName + ", country=" + country + ", dailyLimit=" + dailyLimit
                + ", maxDailyAmount=" + maxDailyAmount + "]";
    }
}

class UPIDriver {
    public static void main(String[] args) throws Exception {
        Location bhimLocation = new Location("BHIMstreet", "new delhi");
        Address bhimAddress = new Address(bhimLocation, "delhi", "India");
        UPIPaymentApps bhim = new UPIPaymentApps("BHIM", "India", 100, 10000.0, bhimAddress);
        UPIPaymentApps paytm = (UPIPaymentApps) bhim.clone();
        paytm.appName = "PayTm";
        Location paytmLocation = new Location("paytmstreet", "newloc");
        Address paytmAddress = new Address(paytmLocation, "himanchal", "India");
        paytm.headOfficeLocation = paytmAddress;
        paytm.country = "Japan";
        UPIPaymentApps gpay = (UPIPaymentApps) bhim.clone();
        gpay.appName = "gpay";
        Location gpayLocation = new Location("gpaystreet", "newloc");
        Address gpayAddress = new Address(gpayLocation, "himanchal", "India");
        gpay.headOfficeLocation = gpayAddress;
        gpay.country = "UAE";
        System.out.println(bhim);
        System.out.println(gpay);
        System.out.println(paytm);

    }
}