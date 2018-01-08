package pl.stqa.pft.addressbook.model;

public class ContactData {

  private final String firstName;
  private final String lastName;
  private final String adress;
  private final String email;
  private final String email2;
  private final String email3;
  private final String homePhone;
  private final String mobilePhone;
  private final String workPhone;
  private final String faxPhone;


  public ContactData(String firstName, String lastName, String adress, String email, String email2, String email3, String homePhone, String mobilePhone, String workPhone, String faxPhone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.adress = adress;
    this.email = email;
    this.email2 = email2;
    this.email3 = email3;
    this.homePhone = homePhone;
    this.mobilePhone = mobilePhone;
    this.workPhone = workPhone;
    this.faxPhone = faxPhone;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getAdress() {
    return adress;
  }

  public String getEmail() {
    return email;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public String getFaxPhone() {
    return faxPhone;
  }
}
