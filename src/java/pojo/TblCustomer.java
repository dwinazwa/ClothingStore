package pojo;
// Generated Oct 15, 2022 2:17:36 PM by Hibernate Tools 4.3.1



/**
 * TblCustomer generated by hbm2java
 */
public class TblCustomer  implements java.io.Serializable {


     private Integer idCustomer;
     private String namaCustomer;
     private String noTlp;
     private String email;
     private String produk;
     private String total;

    public TblCustomer() {
    }

    public TblCustomer(String namaCustomer, String noTlp, String email, String produk, String total) {
       this.namaCustomer = namaCustomer;
       this.noTlp = noTlp;
       this.email = email;
       this.produk = produk;
       this.total = total;
    }
   
    public Integer getIdCustomer() {
        return this.idCustomer;
    }
    
    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }
    public String getNamaCustomer() {
        return this.namaCustomer;
    }
    
    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }
    public String getNoTlp() {
        return this.noTlp;
    }
    
    public void setNoTlp(String noTlp) {
        this.noTlp = noTlp;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getProduk() {
        return this.produk;
    }
    
    public void setProduk(String produk) {
        this.produk = produk;
    }
    public String getTotal() {
        return this.total;
    }
    
    public void setTotal (String total) {
        this.total = total;
    }




}

