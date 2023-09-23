class SimExecutor {
    public static void main(String[] args) {
        Sim sim = new Sim();
        sim.setSimName("jio");
        sim.setNumber(76763972888L);
        sim.setDatapack("1.5GB ");
        sim.setPrice(239);

        CellPhone cellPhone = new CellPhone();
        cellPhone.sim = sim;
        cellPhone.cellphoneName = "Vivo y12";

        System.out.println("Cellphone Name: " + cellPhone.cellphoneName);
        System.out.println("SIM Name: " + cellPhone.sim.getSimName());
        System.out.println("SIM Number: " + cellPhone.sim.getNumber());
        System.out.println("Data Pack: " + cellPhone.sim.getDatapack());
        System.out.println("Price: " + cellPhone.sim.getPrice());
    }
}