import java.awt.SystemColor.menu
import java.util.Scanner;
var input = Scanner(System.`in`)

fun main() {
    val input = Scanner(System.`in`)

    println("Masukkan Identitas Anda")
    print("Nama: ")
    val nama: String? = input.nextLine()
    if(nama.isNullOrEmpty()){
        println("Harap diisi")
        main()
    }
    print("Kelas: ")
    val kelas: String? = input.nextLine()
    if(kelas.isNullOrEmpty()){
        print("Jangan Lupa Diisi")
        main()
    }
    print("Absen: ")
    val absen: String? = input.nextLine()
    println(" ")

    println("|==MENGHITUNG BANGUN RUANG==|")
    println("|1. Volume Kerucut\t\t\t|")
    println("|2. Volume Tabung \t\t\t|")
    print("Masukan Menu Pilihan : ")
    val menu = readLine()

    when (menu) {
        "1" -> {
            println(" ")
            println("===Volume Kerucut===")
            print("Masukan Jari-Jari Kerucut  : ")
            val r: Double = input.nextDouble()
            print("Masukan Tinggi Kerucut  : ")
            val t: Double = input.nextDouble()

            val vk: Double = 1/3 * Math.PI * r * r * t;

            println(" ")
            println("Volume Kerucut adalah = $vk ")

            print("Kembali ke menu [Y/N] : ")
            val next2 = readLine()
            if(next2=="Y" || next2=="y"){
                main()
            }
            else{
                print("Press Enter Key To Exit")
            }

        }
        "2" -> {
            println(" ")
            println("===Volume Tabung===")
            print("Masukan Jari-Jari Tabung : ")
            val r: Double = input.nextDouble()
            print("Masukan Tinggi Tabung  : ")
            val t: Double = input.nextDouble()

            val vt: Double = Math.PI * r * r * t;

            println(" ")
            println("Volume Tabung adalah = $vt ")

            print("Kembali Ke Menu [Y/N] : ")
            val next1 = readLine()
            if(next1=="Y" || next1=="y"){
                main()
            }
            else{
                print("Press Enter Key To Exit")
            }

        }
        else-> {
            println("Menu Tidak Tersedia")
        }
    }
}