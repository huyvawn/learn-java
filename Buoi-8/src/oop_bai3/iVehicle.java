package oop_bai3;

public interface iVehicle {
	default void Run() {
		System.out.println("It is running.");
	}
	default void Stop() {
		System.out.println("It stopped.");
	}
	default void Accelerate() {
		System.out.println("It is accelerating.");
	}
}
