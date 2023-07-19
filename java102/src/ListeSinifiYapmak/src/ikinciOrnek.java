public class ikinciOrnek { public static void main(String[] args) { MyList<Integer> liste = new MyList<>(); liste.add(10); liste.add(20); liste.add(30); System.out.println("2. indisteki değer : " + liste.get(2)); liste.remove(2); liste.add(40); liste.set(0, 100); System.out.println("2. indisteki değer : " + liste.get(2));         System.out.println(liste.toString());
}
}

/*
Çıktısı


2. indisteki değer : 30 2. indisteki değer : 40
[100,20,40]
int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.


int lastIndexOf(T data) : Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir.


boolean isEmpty() : Listenin boş olup olmadığını söyler.


T[] toArray() : Listedeki öğeleri, aynı sırayla bir array haline getirir.


clear() : Listedeki bütün öğeleri siler, boş liste haline getirir.


MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir liste döner.


boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.

 */