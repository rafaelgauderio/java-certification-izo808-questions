package exceptions;

import java.io.IOException;

public class Device implements AutoCloseable {

	public boolean open = false;

	public Device() {
		open = true;
	}

	@Override
	public void close() throws Exception {
		open = false;
		System.out.println("The device is closed! " + this.open);

	}

	public String read() throws IOException {
		throw new IOException("Can not head the device");
	}

	public static void main(String[] args) {
		Device d1 = new Device();

		// try withe resources
		try (d1; Device d2 = new Device(); Device d3 = new Device();) {
			d2.read();
			
			
		} catch (Exception error) {
			System.out.println(error.getMessage());
		}
		
		System.out.println("d1, d2 and d3 are closes");
		System.out.println("The point of a try-with-resources is that whatever resource is specified in the try block.\n"
				+ "\tshould be closed as soon as the try blocks ends, irrespective of what happens in the try blocl");
		
		
		
	}

}
