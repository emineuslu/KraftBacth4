package day12_SwitchCase;

public class C05_Example {
    public static void main(String[] args) {

        // ögrencinin ortalamasını alın
        // ortalama 50 altındaysa  zayıf
        // 50 dahıl 70 arası  orta
        //70 dahil  85 arası iyi
        // 85 ve uzerı alan Pekiyi ekrana yazdırsın
        // 95 ve uzerı alanlara da
        double ort=96;
        if(ort<50){
            System.out.println("zayıf");
        }else if(ort>=50&&ort<85){                    //ort<50
            System.out.println("orta");
        }else if(ort>=70&&ort<85){                    //ort<70
            System.out.println("iyi");
        }else {                                       //ort<85 seklındede aynı sonucu verır
            System.out.println("pekiyi");
            if(ort>=95){
                System.out.println("Basarı belgesı almayı hak kazandınız");
            }
        }












    }









































    }

