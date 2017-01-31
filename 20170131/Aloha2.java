public class Aloha2 {
	public static void main(String[] args) {
		String[] data = new String[100];
		Dataman dataman = new Dataman();
		Fileman fileman = new Fileman();

		dataman.inputData();
		dataman.saveData(data);

		fileman.writeFile(data);
	}
}


class Dataman {

}


class Fileman {

}