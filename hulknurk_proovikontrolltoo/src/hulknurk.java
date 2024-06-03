public static void main(String[] args) {
    ArrayList<Double> xKoordinaadid1 = new ArrayList<>();
    ArrayList<Double> yKoordinaadid1 = new ArrayList<>();
    xKoordinaadid1.add(0.0);
    xKoordinaadid1.add(3.0);
    xKoordinaadid1.add(5.0);
    yKoordinaadid1.add(0.0);
    yKoordinaadid1.add(4.0);
    yKoordinaadid1.add(0.0);

    Hulknurk hulknurk1 = new Hulknurk(xKoordinaadid1, yKoordinaadid1);
    System.out.println("Hulknurk 1:");
    System.out.println("Alguses:");
    System.out.println("Hulknurga ümbermõõt: " + hulknurk1.ymbermoot());

    hulknurk1.lisakoordinaat(6.0, 3.0);
    System.out.println("\nPärast uue punkti lisamist:");
    System.out.println("Hulknurga ümbermõõt: " + hulknurk1.ymbermoot());

    hulknurk1.nihe(2.0, 2.0);
    System.out.println("\nPärast nihet (2, 2):");
    System.out.println("Hulknurga ümbermõõt: " + hulknurk1.ymbermoot());

    hulknurk1.suureneda(2.0);
    System.out.println("\nPärast suurenemist koefitsiendiga 2:");
    System.out.println("Hulknurga ümbermõõt: " + hulknurk1.ymbermoot());

    ArrayList<Double> xKoordinaadid2 = new ArrayList<>();
    ArrayList<Double> yKoordinaadid2 = new ArrayList<>();
    xKoordinaadid2.add(0.0);
    xKoordinaadid2.add(2.0);
    xKoordinaadid2.add(2.0);
    yKoordinaadid2.add(0.0);
    yKoordinaadid2.add(0.0);
    yKoordinaadid2.add(2.0);

    Hulknurk hulknurk2 = new Hulknurk(xKoordinaadid2, yKoordinaadid2);
    System.out.println("\nHulknurk 2:");
    System.out.println("Alguses:");
    System.out.println("Hulknurga ümbermõõt: " + hulknurk2.ymbermoot());

    hulknurk2.lisakoordinaat(3.0, 3.0);
    System.out.println("\nPärast uue punkti lisamist:");
    System.out.println("Hulknurga ümbermõõt: " + hulknurk2.ymbermoot());

    hulknurk2.nihe(1.0, 1.0);
    System.out.println("\nPärast nihet (1, 1):");
    System.out.println("Hulknurga ümbermõõt: " + hulknurk2.ymbermoot());

    hulknurk2.vaiksemaks(2.0);
    System.out.println("\nPärast vähendamist koefitsiendiga 2:");
    System.out.println("Hulknurga ümbermõõt: " + hulknurk2.ymbermoot());
}
