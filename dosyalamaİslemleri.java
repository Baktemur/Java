public static void main(String[] args) {
		// girilecek olan numara vize final bilgilerine göre 
		//daha önceden o numarayla oluşturulmuş bir dosya varsa öyle bir dosya
		//vardır deyip içindekileri  ekrana yazan eğer yoksa
		//girilen bilgileri dosyanın içerisine kayıt eden programı kodlayınız
		int numara;
		int vize,fin,ort;
		Scanner sca=new Scanner(System.in);
		System.out.println("numaranız..:");
		numara = sca.nextInt();
		System.out.println("vize..:");
		vize=sca.nextInt();
		System.out.println("final..:");
		fin=sca.nextInt();
		ort=(int)(vize*0.4)+(int)(fin*0.6);
		try {
		File f=new File("c:\\blk\\"+numara+".txt");
		FileWriter ne=new FileWriter("c:\\blk\\"+numara+".txt");
		if(f.exists()) {
			ne.write((int)fin);
			ne.write((int)vize);
			ne.write((int)ort);
			ne.close();
			System.out.println("basıldı");
		}
		else {
			System.out.println("dosya yoktur...");
			f.createNewFile();
			ne.write(vize+" "+fin+" "+ort);
			ne.close();		
		}
		}
		catch (Exception e) {
			// hata
		}
}
}
