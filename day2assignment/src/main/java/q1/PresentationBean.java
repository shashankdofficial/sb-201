package q1;

public class PresentationBean {

	private ServiceBean service;
	
	public void setService(ServiceBean service) {
		this.service = service;
	}
	
	//Business Logic
	public void present() {
		service.calculatefunc();
	}
}
