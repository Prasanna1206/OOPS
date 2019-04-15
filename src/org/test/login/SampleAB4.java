package org.test.login;

public class SampleAB4 implements SampleAB3 {
	public void laginpage() {
		System.out.println("laginpage");
	}

	public void homepage() {
		System.out.println("homepage");
	}

	public void logoutpage() {
		System.out.println("logoutpage");
	}

	private void pagedetails() {
		System.out.println("pagedetails");// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		SampleAB4 info = new SampleAB4();
		info.pageDetails();
		info.laginpage();
		info.logoutpage();
		info.hashCode();
	}

	@Override
	public void pageDetails() {
		// TODO Auto-generated method stub
		
	}
}
