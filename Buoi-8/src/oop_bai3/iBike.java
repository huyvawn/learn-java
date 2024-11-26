package oop_bai3;

public interface iBike {
	default void StartEngine() {
		System.out.println("Starting engine ...");
	}
}
