import java.util.Scanner;

class animes {
    String nama;
    String hari; 
    int episode;
    Float rating;
    String studio;
    String genre;
    String sipnosis;
    static animes tambah() {
        animes baru = new animes();
        Scanner inputan = new Scanner(System.in);
        System.out.println("--------Menambahkan anime terbaru ke dalam array-------");
        System.out.print("masukkan nama : "); baru.nama = inputan.nextLine();
        System.out.println("pada hari : "); baru.hari = (new hari()).minta_hari();
        System.out.print("berapa episode : "); baru.episode = (new error()).cek_int() ;
        System.out.print("masukkan rating : "); baru.rating = (new error().cek_float());
        System.out.print("masukkan studio : "); baru.studio = inputan.nextLine();
        System.out.print("masukkan genre : "); baru.genre = inputan.nextLine();
        System.out.print("masukkan sipnosis : "); baru.sipnosis = inputan.nextLine();
        return baru;
    }
    public void display(){
        System.out.println("========== berikut rincian anime yang di pilih ==========");
        System.out.println("nama anime adalah : "+this.nama);
        System.out.println("tayang pada hari : "+this.hari);
        System.out.println("banyak episode : "+this.episode);
        System.out.println("dengan rating : "+this.rating);
        System.out.println("studio pembuat : "+this.studio);
        System.out.println("dengan genre : "+this.genre);
        System.out.println("sipnosis : "+this.sipnosis);
    }
    public void ubah(){
        Scanner inputan = new Scanner(System.in);
        System.out.println("========== berikut rincian anime yang di pilih ==========");
        System.out.println("1. nama anime adalah : "+this.nama);
        System.out.println("2. tayang pada hari : "+this.hari);
        System.out.println("3. banyak episode : "+this.episode);
        System.out.println("4. dengan rating : "+this.rating);
        System.out.println("5. studio pembuat : "+this.studio);
        System.out.println("6. dengan genre : "+this.genre);
        System.out.println("7. sipnosis : "+this.sipnosis);
        System.out.println("ingin mengubah nomor : ");int nomor = (new error()).cek_int();
        if(nomor == 1){
            
            System.out.print("masukkan nama : "); this.nama = inputan.nextLine();
        }
        else if(nomor == 2){
            System.out.print("masukkan hari : "); this.hari = (new hari()).minta_hari() ;
            
        }
        else if(nomor == 3){
            System.out.print("masukkan episode : "); this.episode = (new error()).cek_int() ;
            
        }
        else if(nomor == 4){
            
            System.out.print("masukkan rating : "); this.rating = (new error().cek_float());
        }
        else if(nomor == 5){
            
            System.out.print("masukkan studio : "); this.studio = inputan.nextLine();
        }
        else if(nomor == 6){
            System.out.print("masukkan genre : "); this.genre = inputan.nextLine();
            
        }
        else if(nomor == 7){
            System.out.print("masukkan sipnosis : "); this.sipnosis = inputan.nextLine();
            
        }
        else{
            System.out.println("gagal mengubah");
            return;
        }
        System.out.println("berhasil mengubah");
        return;
    }
}
