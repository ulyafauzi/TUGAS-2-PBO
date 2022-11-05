public class Wardrobe {
	private String tglPinjam;
	private String tglKembali;
	private double totalBiaya;

	public void setTglPinjam(String tglPinjam) {
		this.tglPinjam = tglPinjam;
	}

	public void setTglKembali(String tglKembali) {
		this.tglKembali = tglKembali;
	}

	public void setTotalBiaya(double totalBiaya) {
		this.totalBiaya = totalBiaya;
	}
	//-----------------------------------------------------------------


	public String getTglPinjam() {
		return tglPinjam;
	}

	public String getTglKembali() {
		return tglKembali;
	}

	public double getTotalBiaya() {
		return totalBiaya;
	}
}
