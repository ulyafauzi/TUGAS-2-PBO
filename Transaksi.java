public class Transaksi {
	private String jenis;
	private	char nama;
	private double ukuran;
	private	int harga;
	private int stok;

	public String getJenis() {
		return jenis;
	}

	public char getNama() {
		return nama;
	}

	public double getUkuran() {
		return ukuran;
	}

	public int getHarga() {
		return harga;
	}

	public int getStok() {
		return stok;
	}
	//-------------------------------------------------------------


	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public void setNama(char nama) {
		this.nama = nama;
	}

	public void setUkuran(double ukuran) {
		this.ukuran = ukuran;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}
	final static void display() {

		System.out.println("masukan jenis : ");
		System.out.println("masukan nama  : ");
		System.out.println("masukan ukuran :");
		System.out.println("masukan stok : ");
	}
}
