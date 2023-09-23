class Kitchen {   
    // Encapsulated class

    private String color;          // Private data members
    private String graniteType;
    private boolean hasOven;
    private int size;

    public Kitchen() {    
        
    }

    public void setColor(String color) {    
        this.color = color;   // This keyword is used to avoid the conflict between instance variable and parameter
    }

    public String getColor() {     
        return color;
    }

    public void setGraniteType(String graniteType) {
        this.graniteType = graniteType;
    }

    public String getGraniteType() {
        return graniteType;
    }

    public void setHasOven(boolean hasOven) {
        this.hasOven = hasOven;
    }

    public boolean getHasOven() {
        return hasOven;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
