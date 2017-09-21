/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Malick
 */
public class Resume {
    private String FirstName;
    private String LastName;
    private String NUID;
    private String Sex;
    private String StreetLine1;
    private String StreetLine2;
    private String City;
    private String Country;
    private String Affiliation;
    private String Objective;
    private String EDegree;
    private String EMajor;
    private String Edate;
    private String Certifications;
    private String Skills;
    private String WCompanyName;
    private String WTitle;
    private String WDuration;
    private String Picture;
    private String Skill1;
    private String Skill2;
    private String Skill3;
    private String Citizenship;

    public String getCitizenship() {
        if(Citizenship !=null){
            return Citizenship;
        }
        return "";
        
    }

    public void setCitizenship(String Citizenship) {
        this.Citizenship = Citizenship;
    }
    
    
    public String getSkill3() {
        if(Skill3 != null){
            return Skill3;
        }
        return "";
    }

    public void setSkill3(String Skill3) {
        this.Skill3 = Skill3;
    }

    public String getSkill1() {
        if(Skill1 != null){
            return Skill1;
        }
        return "";
    }

    public void setSkill1(String Skill1) {
        this.Skill1 = Skill1;
    }

    public String getSkill2() {
        if(Skill2 != null){
            return Skill2;
        }
        return "";
    }

    public void setSkill2(String Skill2) {
        this.Skill2 = Skill2;
    }
    
    
    

    public String getSkills() {
        if(Skills !=null){
            return Skills;
        }
        return "";
    }

    public void setSkills(String Skills) {
        this.Skills = Skills;
    }
   

    
    
    public String getSex() {
        if (Sex !=null){
            return Sex;
        }
        return "";
        
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }
    

    public String getNUID() {
        return NUID;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }
    

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getStreetLine1() {
        return StreetLine1;
    }

    public void setStreetLine1(String StreetLine1) {
        this.StreetLine1 = StreetLine1;
    }

    public String getStreetLine2() {
        return StreetLine2;
    }

    public void setStreetLine2(String StreetLine2) {
        this.StreetLine2 = StreetLine2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getAffiliation() {
        return Affiliation;
    }

    public void setAffiliation(String Affiliation) {
        this.Affiliation = Affiliation;
    }

    public String getObjective() {
        return Objective;
    }

    public void setObjective(String Objective) {
        this.Objective = Objective;
    }

    public String getEDegree() {
        if(EDegree !=null){
        return EDegree;
        }
            return "";
        }
  
    
    
    

    public void setEDegree(String EDegree) {
        this.EDegree = EDegree;
    }

    public String getEMajor() {
        return EMajor;
    }

    public void setEMajor(String EMajor) {
        this.EMajor = EMajor;
    }

    public String getEdate() {
        return Edate;
    }

    public void setEdate(String Edate) {
        this.Edate = Edate;
    }

    public String getCertifications() {
        return Certifications;
    }

    public void setCertifications(String Certifications) {
        this.Certifications = Certifications;
    }

    public String getWCompanyName() {
        return WCompanyName;
    }

    public void setWCompanyName(String WCompanyName) {
        this.WCompanyName = WCompanyName;
    }

    public String getWTitle() {
        return WTitle;
    }

    public void setWTitle(String WTitle) {
        this.WTitle = WTitle;
    }

    public String getWDuration() {
        return WDuration;
    }

    public void setWDuration(String WDuration) {
        this.WDuration = WDuration;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String Picture) {
        this.Picture = Picture;
    }

    @Override
    public String toString()
    {
        return this.NUID;
    }
//    public Resume addResume() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
       


    



}
