
package TugasMinggu7.televisiModern;

/**
 *
 * @author fikry
 */
public class Televisi {
    public  String deskripsi;
    public  int jumlahChannel;
    public String[] channel;
    public int ChannelAktif;
    public int volume;
    public String TELETEXT;
    public String modusTampilan;
    public String TV;

    //setting deskripsi dan jumlah channel
//   public Televisi ( String deskripsi, int jumlahChannel) { 
//                this.deskripsi = deskripsi;
//                this.jumlahChannel = jumlahChannel;   
//   }
   
    public String getDeskripsi(){
         return deskripsi;
   }
   
    public int getJumlahChannels() {      
        return jumlahChannel;
    }
    
    public String[] getChannels(){
        if (channel == null){
            System.out.println("Channell belum di set!");
        }
        
        this.channel = channel; 
       
            return channel;
    }
    
    //setting channel yang ada
    public void setChannels(String[] channel){
        
        if (channel.length > jumlahChannel){
            System.out.println("Maaf TV ini hanya dapat menyimpan : " 
                    + jumlahChannel);
        }
        else {
            this.channel = channel;
            System.out.println("Informasi channel berhasil diupdate!");
        }
    }
    
    public int getChannelAktif(){
        return ChannelAktif;
    }
    
    public void setChannelAktif(int ChannelAktif){
    
        if ( ChannelAktif > channel.length){
            System.out.println("Channel yang anda inginkan belum diset!");
            return;
        }
        
        this.ChannelAktif = ChannelAktif;
        System.out.println("Pindah channel ke : " + channel[ChannelAktif]);

    }
    
    public int getVolume(){
        return volume;
    }
    
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Intensitas volume sekarang : " + volume);
    }
}
