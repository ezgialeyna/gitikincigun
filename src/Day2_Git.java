public class Day2_Git {
    /*
    1- git init: Local repo olusturmak icin yani .git ile klasorumuzun icindeki dosyalari iliskilendirmek icin
    kullanilir.
    2- git add . = Working space'den yani yerelden dosyalarimi staging area'ya yani commitlemek icin beklenen yere
    gonderir.
    3- git commit -m"bir mesaj " = Staging area'dan commit store'a dosyalarimi gondermek icin kullanilir.
    (commit yani versiyon, surum olusturmus olurum)
    4- git push : uzak repo'ya (remote - github) gondermek icin kullandigimiz kod.
    Yalniz git push komutunu direkt kullanmak istersek bir kez :

           git remote add origin adres
           git push -u origin master
      Not: Bu iki komutu tek seferde kullandiktan sonra diger ikinci commitlerim icin sadece git push kullaniriz.
      Not: git log --oneline = commitlerimdeki yani versiyonlarimdaki durumu gosterir.

     */
    public static void main(String[] args) {
        System.out.println("Github'i da ogrendim");
    }
}
