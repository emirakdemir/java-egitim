package Siniflar.OgrenciBilgiSistemiOdev;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    double sozluAgirligi; // Sözlü notunun ortalamaya etki yüzdesi

    public Course(String name, String code, String prefix, double sozluAgirligi) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluAgirligi = sozluAgirligi;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    public double calculateCourseAverage(double sınavNotu, double sozluNotu) {
        double agirlikliSınavNotu = sınavNotu * (1 - sozluAgirligi);
        double agirlikliSozluNotu = sozluNotu * sozluAgirligi;
        double dersOrtalamasi = agirlikliSınavNotu + agirlikliSozluNotu;
        return dersOrtalamasi;
    }
}


