public class PhysicalActivities{
	private String namephyAct;
	private String datephyAct;
	private String startTime;
	private String endTime;

	public PhysicalActivities(String phyName,String phyDate,String phyStartTime,String phyendTime){
		this.namephyAct = phyName;
		this.datephyAct = phyDate;
		this.startTime = phyStartTime;
		this.endTime = phyendTime;
	}
	// addActivity(String namephyAct,String datephyAct,String startTime,String endTime){
	// 	addActivity(new PhysicalActivities(namephyAct))
	// }
	public String getnamephyAct(){
		return this.namephyAct;
	}
	public String getdatephyAct(){
		return datephyAct;
	}
	public String getstartTime() {
		return startTime;
	}
	public String getendTime() {
		return endTime;
	}
}


