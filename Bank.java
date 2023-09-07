class Bank {
    private int id;
    private String name;
    private String ifscCode;
    private String bankEmailID;
    private String manager;
    private int numberOfWorkers;
    private String branchName;

    // Setter methods
    public void setId(int id)
	{
        this.id = id;
    }
	 public int getId()
	 {
        return id;
    }
	
	
	 public void setName(String name) {
        this.name = name;
    }
	public String getName() {
        return name;
    }
	
	
	public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
	public String getIfscCode() {
        return ifscCode;
    }
	
	public void setBankEmailID(String bankEmailID) {
        this.bankEmailID = bankEmailID;
    }
	public String getBankEmailID() {
        return bankEmailID;
    }
	
	public void setManager(String manager) {
        this.manager = manager;
    }
	public String getManager() {
        return manager;
    }
	
	public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }
	public int getNumberOfWorkers() {
        return numberOfWorkers;
    }
	
	public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
	public String getBranchName() {
        return branchName;
    }
}