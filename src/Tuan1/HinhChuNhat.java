package Tuan1;



public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;
	
	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double cd) throws Exception {
		if(cd>0){
			this.chieuDai = cd;
		}else throw new Exception("chieu dai phai lon hon 0");
		
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double cr) throws Exception {
		if(cr>0) {
			this.chieuRong = cr;
		}else throw new Exception("chieu rong lon hon 0");
		
	}
	

	public HinhChuNhat() {

	}
	

	public HinhChuNhat(double cd, double cr) {
		super();
		this.chieuDai = cd;
		this.chieuRong = cr;
	}
	
	public double getChuVi() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public double getDienTich() {
		return getChieuDai()*getChieuRong();
	}

	public static void main(String[] args) throws Exception {
		HinhChuNhat hcn=new HinhChuNhat();
		hcn.setChieuDai(6);
		hcn.setChieuRong(4);
		System.out.println("chieu dai la:" + hcn.getChieuDai());
		System.out.println("chieu rong la:"+hcn.getChieuRong());
		System.out.println("dien tich la:"+hcn.getDienTich());
		System.out.println("chu vi la:"+hcn.getChuVi());
			
	}

}
