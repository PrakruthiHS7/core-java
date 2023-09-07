class PatientExecutor
{
 public static void main(String patients[])
 {
 Patient patient=new Patient();
 
 patient.setPatientId(1);
 System.out.println("The Patient Id is "+patient.getPatientId());
 
 patient.setPatientName("Prathiksha");
 System.out.println("The Patient Name  is "+patient.getPatientName());
 
 patient.setHospitalName("Manipal");
 System.out.println("The hospital name  is "+patient.getHospitalName());
 
 patient.setWardNo(101);
 System.out.println("The Ward Number   is "+patient.getWardNo());
 
 patient.setDisease("Cholera");
 System.out.println("The Patient disease  is "+patient.getDisease());
 
 patient.setAge(22);
 System.out.println("The Patient Name  is "+patient.getAge());
 
 patient.setAddress("Mysore");
 System.out.println("The address of Patient  is "+patient.getAddress());
 
 patient.setGender("Female");
 System.out.println("The gender of Patient  is "+patient.getGender());
 
 patient.setPhoneNo(7676897864L);
 System.out.println("The Phone number of the patient   is "+patient.getPhoneNo());
 
}
}