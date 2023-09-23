class CellExecutor{
	public static void main(String time[])
	{
		Cell cell=new Cell();
		cell.setCellId(321);
		cell.setCellName("Panasonic");
		cell.setVoltage(1.8);
		
		Watch watch=new Watch();           //object of base class
		
		//has-A relationship
		watch.cell=cell;
		watch.watchName="Fastrack";
		System.out.println("Watch Name : "+watch.watchName);
		System.out.println("Cell id : "+watch.cell.getCellId());
		System.out.println("Cell Name : "+watch.cell.getCellName());
		System.out.println("Cell voltage : "+watch.cell.getVoltage());
		
		
	}
}