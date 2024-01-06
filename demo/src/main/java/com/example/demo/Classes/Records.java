package com.example.demo.Classes;

public class Records {
    private float lowerCIB;
  
    public float getLowerCIB() {
        return lowerCIB;
    }
    public void setLowerCIB(float lowerCIB) {
        this.lowerCIB = lowerCIB;
    }
    private float upperCIB;
    public float getUpperCIB() {
        return upperCIB;
    }
    public void setUpperCIB(float upperCIB) {
        this.upperCIB = upperCIB;
    }
    private String flag;
    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }
    private String _id;
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    private String mscode;
    public String getMscode() {
        return mscode;
    }
    public void setMscode(String mscode) {
        this.mscode = mscode;
    }
    private String year;
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    private String estCode;
    public String getEstCode() {
        return estCode;
    }
    public void setEstCode(String estCode) {
        this.estCode = estCode;
    }
    private float estimate;
    public float getEstimate() {
        return estimate;
    }
    public void setEstimate(float estimate) {
        this.estimate = estimate;
    }
    private float se;
    public float getSe() {
        return se;
    }
    public void setSe(float se) {
        this.se = se;
    }
    


    public Records(String _id, String mscode, String year,
     String estCode, float estimate, float se, float lowerCIB,
      float upperCIB, String flag) {
        this._id = _id;
        this.mscode = mscode;
        this.year = year;
        this.estCode = estCode;
        this.estimate = estimate;
        this.se = se;
        this.lowerCIB = lowerCIB;
        this.upperCIB = upperCIB;
        this.flag = flag;
    }


    // Esta funcion se usa para imprimir por pantalla resultados
    // @Override
    // public String toString() {
    //     return "Record{" +
    //             "_id='" + _id + '\'' +
    //             ", mscode='" + mscode + '\'' +
    //             ", year='" + year + '\'' +
    //             ", estCode='" + estCode + '\'' +
    //             ", estimate=" + estimate +
    //             ", se=" + se +
    //             ", lowerCIB=" + lowerCIB +
    //             ", upperCIB=" + upperCIB +
    //             ", flag='" + flag + '\'' +
    //             '}';
    // }
}
