package com.company;

public class Member extends Person{

    private boolean isBasic;

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

  public boolean isBasic(){
        return isBasic;
  }

    public void setBasic(boolean basic) {
        isBasic = basic;
    }

    public String getMemberClass(){
        if(isBasic){
            return "Basic";
        }else
            return "VIP";
    }
    public int monthlyFee(){
        if(isBasic){
            return 199;
        }else{
            return 299;
        }
    }


    @Override
    public String toString() {

        return String.format("%-15s%-18s%-21s%-12d", name, cpr, getMemberClass(), monthlyFee() );
        }
}
