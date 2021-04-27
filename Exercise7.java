/**
 * Modify the code so that the code prints the following text: 

 *Hello I am a motorcycle, I am a cycle with an engine. 

 *My ancestor is a cycle who is a vehicle with pedals. 
*/
package com.hcl;

/**
 * @author Pragati Sharma
 *
 */
class Cycle {

	String define_me() {

		return "a vehicle with pedals.";

	}

}

class Bike extends Cycle {

	String define_me() {
		return "a cycle with an engine.";

	}

	Bike() {

		System.out.println("Hello I am a Motorcycle, I am " + define_me());
		String temp = super.define_me();
		System.out.println("My ancestor is a cycle who is " + temp);

	}

}

class Exercise7 {

	public static void main(String[] args) {

		Bike bike = new Bike();

	}

}
