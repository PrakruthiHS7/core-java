//21/9/2023
class ElectronicDevice {
    String type;

    public ElectronicDevice() {
        System.out.println("ElectronicDevice constructor is invoked");
    }

    public ElectronicDevice(String type) {
        this();
        this.type = type;
        System.out.println(type);
    }
}