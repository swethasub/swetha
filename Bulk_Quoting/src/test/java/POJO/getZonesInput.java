package POJO;

public class getZonesInput {

    private String country;
    private String division;

    private String modelyear;

    public getZonesInput(String country, String division, String modelyear)
    {
        this.country=country;
        this.division=division;
        this.modelyear= modelyear;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getModelyear() {
        return modelyear;
    }

    public void setModelyear(String modelyear) {
        this.modelyear = modelyear;
    }


}

