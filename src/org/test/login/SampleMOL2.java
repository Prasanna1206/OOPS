package org.test.login;

public class SampleMOL2 extends SampleMOR1 {

	public void SampleMOR1name() {
		System.out.println("NOT ME");
	}

	public static void main(String[] args) {
		SampleMOL2 m = new SampleMOL2();
		m.SampleMOR1name();
	}

}
