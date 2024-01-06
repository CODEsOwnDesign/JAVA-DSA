public class Stacks0x00 {
	public static void main(String[] args) {
		java.util.Stack<String> stack = new java.util.Stack<>();
		/**
		 * check if the stack is empty
		 */
		System.out.println("isEmpty: " + stack.isEmpty()); // true

		System.out.println("Adding objects ...");
		/**
		 * add object to stack
		 */
		stack.push("Minecraft"); // last item
		stack.push("Skyrim");
		stack.push("Minecraft");
		stack.push("Doom");
		stack.push("BorderLand");
		stack.push("FFVII"); // first item
		/**
		 * check if the stack is empty
		 */
		System.out.println("isEmpty: " + stack.isEmpty()); // false

		/**
		 * check the top most object
		 */
		System.out.println("Peek: " + stack.peek()); // FFVII

		/**
		 * search object in stack
		 * position starts in 1 NOT 0
		 */
		System.out.println("search Doom: " + stack.search("Doom")); // 3
		System.out.println("not found: " + stack.search("find")); // -1

		// print stack
		System.out.println("stack: " + stack); // [Minecraft, Skyrim, Minecraft, Doom, BorderLand, FFVII]

		/**
		 * remove and return the top object
		 *
		 * @throws java.util.EmptyStackException
		 */
		System.out.println("Pop: " + stack.pop()); // FFVII
		System.out.println("Pop: " + stack.pop()); // BorderLand
		System.out.println("Pop: " + stack.pop()); // Doom
		System.out.println("Pop: " + stack.pop()); // Minecraft
		System.out.println("Pop: " + stack.pop()); // Skyrim
		System.out.println("Pop: " + stack.pop()); // Minecraft
		// System.out.println("Pop: " + stack.pop()); // throws exception

		// print stack
		System.out.println("stack: " + stack); // []

		/**
		 * run out of memory due to java heap space
		 *
		 * @throws java.lang.OutOfMemoryError
		 */
		// for (int i = 0; i < 1000000000; i++) {
		// stack.push("Fallout76");
		// }
	}
}
