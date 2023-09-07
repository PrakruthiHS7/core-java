class Patient
{
  private int patientId;
  private String patientName;
  private String hospitalName;
  private int wardNo;
  private String disease;
  private int age;
  private String gender;
  private String address;
  private long phoneNo;
  
  
  public void setPatientId(int patientId)
  {
  this.patientId=patientId;
  }
  public int  getPatientId()
  {
  return patientId;
  }
  
  public void setPatientName(String patientName)
  {
  this.patientName=patientName;
  }
  public String getPatientName()
  {
  return patientName;
  }


public void setHospitalName(String hospitalName)
  {
  this.hospitalName=hospitalName;
  }
  public String getHospitalName()
  {
  return hospitalName;
  }

public void setWardNo(int wardNo)
  {
  this.wardNo=wardNo;
  }
  public int getWardNo()
  {
  return wardNo;
  }

public void setDisease(String disease)
  {
  this.disease=disease;
  }
  public String getDisease()
  {
  return disease;
  }
  
  
  public void setAge(int age)
  {
  this.age=age;
  }
  public int getAge()
  {
  return age;
  }

public void setGender(String gender)
  {
  this.gender=gender;
  }
  public String  getGender()
  {
  return gender;
  }
  
public void  setAddress(String address)
{
    this.address=address;
}
public String getAddress()
{
    return address;
}


public void setPhoneNo(long phoneNo)
{
	this.phoneNo=phoneNo;
}
public long getPhoneNo()
{
	return phoneNo;
}

}