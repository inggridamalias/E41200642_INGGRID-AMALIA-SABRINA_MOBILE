package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //deklarasikan recyclerView;
    RecyclerView recyclerView;
    MoviesRecyclerViewAdapter adapter;
    ArrayList<Movies> objMovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        //mengisi data
        objMovies.add(new Movies("Squid Game", "Action, Drama, Mystery, Thriller", "Hwang Dong-hyuk", 7.2, "“Squid Game” menggambarkan kisah orang-orang yang memutuskan untuk menjadi pemain dari permainan bertahan hidup misterius yang mempertaruhkan hadiah sebesar 40 juta dolar.", "17 September 2021"));
        objMovies.add(new Movies("Hospital Playlist", "Comedy, Drama, Friendship, Life, Medical, Romance", "Lee Woo-jung", 9.3, "Drama Korea ini menggambarkan kisah para dokter, perawat, dan pasien di rumah sakit. 5 dokter semuanya masuk universitas kedokteran yang sama pada tahun 1999. Mereka sekarang berteman dan bekerja bersama di rumah sakit yang sama.", "12 Maret 2021"));
        objMovies.add(new Movies("Swing Kids", "Drama, Friendship, Music, War", "Kang Hyung-chul", 7.5, "Kisah Ro Gi Soo, seorang prajurit Korea Utara yang menari tap yang ditawan di kamp penjara Geoje selama Perang Korea.", "14 Desember 2018"));
        objMovies.add(new Movies("Start-Up", "Comedy, Drama, Romance", "Oh Choong Hwan", 6.3, "Start-Up berkisah tentang kehidupan karier hingga percintaan para remaja yang bermimpi untuk sukses di dunia perusahaan startup.", "17 Oktober 2020"));
        objMovies.add(new Movies("Space Jam", "Adventure, Animation, Comedy, Family, Sci-Fi, Sport", "Malcolm D. Lee", 3.9, "Sebuah kecerdasan buatan nakal menculik putra pemain bola basket terkenal LeBron James, yang kemudian harus bekerja dengan Bugs Bunny untuk memenangkan pertandingan bola basket.", "08 Agustus 2021"));
        objMovies.add(new Movies("The Addams Family 2", "Animation, Comedy, Family", "Conrad Vernon, Greg Tiernan", 5.7, "The Addams terjerat dalam petualangan yang lebih aneh dan mendapati diri mereka terlibat dalam pertikaian lucu dengan segala macam karakter yang tidak curiga.", "01 Oktober 2021"));
        objMovies.add(new Movies("Don’t Breathe 2", "Horror, Thriller", "Rodo Sayagues", 6.3, "Orang Buta telah bersembunyi selama beberapa tahun di sebuah pondok terpencil dan telah mengambil dan membesarkan seorang gadis muda yatim piatu dari kebakaran rumah yang menghancurkan. Kehidupan mereka yang tenang bersama-sama hancur ketika sekelompok penjahat menculik gadis itu, memaksa Orang Buta meninggalkan tempat persembunyiannya untuk menyelamatkannya.", "12 Agustus 2021"));
        objMovies.add(new Movies("The Cabin", "Drama", "Jean-Louis Schuller", 6.2, "Hytte atay The Cabin. Di tengah mempersiapkan apartemennya agar Mira tinggal bersamanya, Luc melarikan diri ke Svalbard. Tersandung mabuk dari Artic “Oktoberfest”, Luc bertemu Mike, orang asing yang tinggal di kabin terpencil di gurun Arktik. Mike secara misterius meninggalkan Luc di tengah percakapan. Penasaran, Luc memutuskan untuk mencari Mike. Sepanjang jalan, ia bertemu Ingrid, seorang guru Norwegia. Luc bergegas mengikuti jejak Mike yang tetap sulit dipahami dan tidak stabil, Luc memburu bayangan, mungkin bayangannya sendiri.", "12 Januari 2021"));
        objMovies.add(new Movies("Mouse Predator", "Mouse Predator", "Joon Bae Choi", 7.0, "Kisah menegangkan yang menanyakan pertanyaan kunci, “Bagaimana jika kita dapat mengidentifikasi psikopat sebelumnya?” Pembunuhan kejam seorang pembunuh berantai yang gila-gilaan telah membuat seluruh bangsa diliputi ketakutan, dan kekacauan pun melanda. Petugas polisi pemula yang mencari keadilan, Jung Ba Reum, berhadapan langsung dengan si pembunuh. Sementara dia selamat dari pertemuannya yang berbahaya dengan psikopat, Jung Ba Reum mendapati hidupnya benar-benar berubah di depan matanya.", "29 April 2021"));
        objMovies.add(new Movies("Wonder", "Drama, Family", "Stephen Chbosky", 8.0, "Film Wonder mengisahkan Auggie (Jacob Tremblay) yang terlahir dengan kelainan genetik. Wajah Auggie berbeda dengan anak-anak pada umumnya.\n" +
                "\n" +
                "Kelainan pada wajahnya membuat Auggie tidak percaya diri. Auggie pun memilih bersekolah di rumah. Ketika pergi ke luar, Auggie hanya mau mengenakan helm astronot untuk menutupi wajahnya.\n" +
                "\n" +
                "Keadaan berubah saat Auggie menginjak bangku SMP. Orang tua Auggie, yaitu Isabel (Julia Roberts) dan Nate (Owen Wilson) menyuruhnya untuk masuk sekolah umum. Langkah ini dilakukan agar Auggie merasakan kehidupan yang sesungguhnya.\n" +
                "\n" +
                "Kehadiran Auggie di sekolah umum langsung mengundang perhatian. Siswa SMP memperlakukan Auggie dengan berbeda dan tidak selalu positif. Mampukah Auggie beradaptasi di tengah lingkungan baru?", "17 November 2017"));
        objMovies.add(new Movies("Hope", "Drama", "Lee Joon-ik", 8.6, "Cerita dimulai dengan menampilan sebuah keluarga kecil yang bahagia.Memiliki satu anak perempuan berumur 8 tahun yang cantik dan pintar bernama So Won menambah rasa bahagia keluarga tersebut.\n" +
                "\n" +
                "Namun suatu hari sebuah tragedi menghampiri keluarga kecil ini.Saat perjalanan menuju sekolah, So Won diperkosa dan dipukuli oleh seorang pria tua yang sedang mabuk.\n" +
                "\n" +
                "Akibat kejadian itu, So Won menderita trauma yang sangat parah membuatnya menolak untuk bertemu pria dewasa yang mengingatkan dirinya dengan sang pemerkosa.Kejadian memilukan ini bahkan membuat Sowon juga menolak bertemu dengan sang ayah.\n" +
                "\n" +
                "Sulit menghilangkan trauma tersebut, Sowon juga berhenti berbicara.Agar dekat kembali dengan sang putri, ayah akhirnya berdandan menjadi Pompompurin, tokoh kartun kesukaan So Won.", "02 Oktober 2013"));
        objMovies.add(new Movies("Sea of Hope ", "Comedy, Food, Life, Music", "Ahn Sang-hoon", 8.6, "Program penyembuhan di mana selebriti akan menampilkan musik mereka sendiri dan hidangan buatan sendiri di bar langsung di sebelah laut yang misterius dan indah. Variety show ini berkisar pada tiga kata kunci: laut, bar, dan keinginan. Para tamu yang berkunjung akan dapat keluar dari kehidupan sehari-hari dan menghabiskan hari yang istimewa dengan laut yang sejuk, musik, dan makanan yang lezat. Aktris Lee Ji Ah akan memimpin pemeran sebagai koki utama bar tepi laut, sementara Lee Dong Wook akan berperan sebagai bartender utama. Aktris Kim Go Eun akan menunjukkan cintanya pada laut sebagai penjaga pantai dan server, sementara Yoon Jong Shin dan Suhyun akan menangani musiknya. Last but not least, pemimpin SHINee Onew akan menangani makanan penutup sebagai pembuat roti tim.", "29 Juni 2021"));

        //menerapkan adapter
        adapter = new MoviesRecyclerViewAdapter(objMovies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}