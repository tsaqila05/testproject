import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nama_barang")
    private String nama_brg;
    @Column(name= "jumlah")
    private int jumlah_brg;
    public Barang(String nama_brg, int jumlah_brg) {
        this.nama_brg = nama_brg;
        this.jumlah_brg = jumlah_brg;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama_brg() {
        return nama_brg;
    }
    public void setNama_brg(String nama_brg) {
        this.nama_brg = nama_brg;
    }
    public int getJumlah_brg() {
        return jumlah_brg;
    }
    public void setJumlah_brg(int jumlah_brg) {
        this.jumlah_brg = jumlah_brg;
    }

    
}
