public class Hero {
    private String nama;
    private String role;
    private String ultimate;

    //constructor overloading
    public Hero(){
        this.nama = "Hero Baru";
        this.role = "All Role";
        this.ultimate = "none";
    }

    public Hero(String nama, String role,String ultimate){
        this.nama = nama;
        this.role = role;
        this.ultimate = ultimate;
    }

    //method overloading
    public void attack(){
        System.out.println(this.nama + " Menyerang dengan basic attack" );
    }

    public void attack(String skil){
        System.out.printf(this.nama + " Menyerang menggunakan %s", skil );
    }

    //fungsi untuk menampilkan data
    public void dataHero(){
        System.out.println("Nama hero: " +this.nama);
        System.out.println("Role     : " +this.role);
        System.out.println("Ultimate : " +this.ultimate);
        System.out.println("");
    }
}
