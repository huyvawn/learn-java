package oop_bai3;

public interface iBicycle {
	default void Cycle() {
		System.out.println("Cycling ...");
	}
}
