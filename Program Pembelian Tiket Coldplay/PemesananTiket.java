package Contest;

class PemesananTiket {
    public static TiketKonser pilihTiket(int choice) {
        switch (choice) {
            case 0:
                return new CAT8();
            case 1:
                return new CAT1();
            case 2:
                return new FESTIVAL();
            case 3:
                return new VIP();
            case 4:
                return new VVIP();
            default:
                return null;
        }
    }
}