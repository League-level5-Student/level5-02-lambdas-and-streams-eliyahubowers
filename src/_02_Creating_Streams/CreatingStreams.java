package _02_Creating_Streams;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStreams {
	public static void main(String[] args) {
		//1. Create a stream out of the following collections.
		String[] strArr = {"one", "two", "three", "four"};
		
		Stream<String> stream1 = Stream.of(strArr);
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		Stream<ArrayList<Integer>> stream2 = Stream.of(intList);
		
		Stack<Random> randStack = new Stack<Random>();
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		
		Stream<Stack<Random>> stream3 = Stream.of(randStack);
		
		ArrayDeque<Double> dQueue = new ArrayDeque<Double>();
		dQueue.push(0.0);
		dQueue.push(1.0);
		dQueue.push(2.0);
		dQueue.push(3.0);
		
		Stream<ArrayDeque<Double>> stream4 = Stream.of(dQueue);
		
	}
}
