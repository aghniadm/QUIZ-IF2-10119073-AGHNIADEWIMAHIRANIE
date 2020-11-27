package quiz.if2.pkg10119073.aghniadewimahiranie;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Customer extends ServicePrice{
    private String name, email;
    private boolean member;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public boolean isMember(){
        return true;
    }
    
    public void setMember(boolean member){
        this.member = member;
    }
    
    public String currentTime(){
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);// hari dalam format angka
        
        SimpleDateFormat formatIndo = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        
        String[] strDays = new String[]{"Sabtu","Minggu","Senin","Selasa","Rabu"
             ,"Kamus","Jumat"};
        
        System.out.println("Data Transaction : "+(strDays[daysOfWeek])+", "
             +formatIndo.format(date));
        return null;
    }
}
