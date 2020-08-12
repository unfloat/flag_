package com.flag.flag.domain.model;

import java.util.Date;

public class VisitedCountriesModel {

    private long   mId;
    private String countryFlag;
    private String countryName;
    private Date countryVisitDate;

    public VisitedCountriesModel(long mId, String countryFlag, String countryName, Date countryVisitDate) {
        this.mId = mId;
        this.countryFlag = countryFlag;
        this.countryName = countryName;
        this.countryVisitDate = countryVisitDate;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VisitedCountriesModel that = (VisitedCountriesModel) o;
        return mId == that.mId;
    }

    @Override
        public int hashCode() {
            return (int) (mId ^ (mId >>> 32));
        }


    public void setmId(long mId) {
        this.mId = mId;
    }

    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryVisitDate(Date countryVisitDate) {
        this.countryVisitDate = countryVisitDate;
    }

    public long getmId() {
        return mId;
    }

    public String getCountryFlag() {
        return countryFlag;
    }

    public String getCountryName() {
        return countryName;
    }

    public Date getCountryVisitDate() {
        return countryVisitDate;
    }

    @Override
    public String toString() {
        return "VisitedCountries{" +
                "mId=" + mId +
                ", countryFlag='" + countryFlag + '\'' +
                ", countryName='" + countryName + '\'' +
                ", countryVisitDate=" + countryVisitDate +
                '}';
    }
}
