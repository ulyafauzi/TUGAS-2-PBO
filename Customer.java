import java.util.Scanner;

public class Customer {
	private int noKtp;
	private String nama;
	private int noHp;
	private String alamat ;

	public int getNoKtp() {
		return noKtp;
	}

	public String getNama() {
		return nama;
	}

	public int getNoHp() {
		return noHp;
	}

	public String getAlamat() {
		return alamat;
	}
//---------------------------------------------------------------
	public void setNoKtp(int noKtp) {
		this.noKtp = noKtp;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setNoHp(int noHp) {
		this.noHp = noHp;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	protected final void isiFormulir(){
		Customer cstmr=new Customer();
		Scanner input=new Scanner(System.in);

		System.out.println("Masukan nomer KTP :");
		noKtp= input.nextInt();
		getNoKtp();

		System.out.println("Masukan nomer KTP :");
		nama=input.nextLine();
		getNama();

		System.out.println("Masukan nomer hp ");
		noHp=input.nextInt();
		getNoHp();
	}

}
