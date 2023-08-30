package 부루마블;

public class City {

    //생성할것 + 게터 세터
    /*
    도시이름,오너,땅가격,빌딩,빌딩가격,빌딩 갯수,호텔,호텔가격,호텔갯수
    */
    //값을 지정해야하는 것들 기본 생성자 만들기
    private String name;
    private int Owner=-1;
    private int LandPrice; //땅값
    private int Building;  //건물구매시 가격
    private int BuildingPay;    //건물 밟았을때 지불비용
    private int BuildingCount =0; //빌딩갯수
    private int Hotel;  //호텔 구매시 가격
    private int HotelPay;//호텔 밟았을때 지불 가격
    private int HotelCount =0; //호텔 갯수


    public City(String name, int landPrice, int building, int buildingPay, int hotel, int hotelPay) {
        this.name = name;
        LandPrice = landPrice;
        Building = building;
        BuildingPay = buildingPay;
        Hotel = hotel;
        HotelPay = hotelPay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOwner() {
        return Owner;
    }

    public void setOwner(int owner) {
        Owner = owner;
    }

    public int getLandPrice() {
        return LandPrice;
    }

    public void setLandPrice(int landPrice) {
        LandPrice = landPrice;
    }

    public int getBuilding() {
        return Building;
    }

    public void setBuilding(int building) {
        Building = building;
    }

    public int getBuildingPay() {
        return BuildingPay;
    }

    public void setBuildingPay(int buildingPay) {
        BuildingPay = buildingPay;
    }

    public int getBuildingCount() {
        return BuildingCount;
    }

    public void setBuildingCount(int buildingCount) {
        BuildingCount = buildingCount;
    }

    public int getHotel() {
        return Hotel;
    }

    public void setHotel(int hotel) {
        Hotel = hotel;
    }

    public int getHotelPay() {
        return HotelPay;
    }

    public void setHotelPay(int hotelPay) {
        HotelPay = hotelPay;
    }

    public int getHotelCount() {
        return HotelCount;
    }

    public void setHotelCount(int hotelCount) {
        HotelCount = hotelCount;
    }
    //빌딩 추가
    public void addBuilding(int count){
        Building +=count;
    }
    //빌딩 삭제
    public Boolean RemoveBuilding(int count){
        if (Building-count<0){
            System.out.println("빌딩갯수가 부족합니다");
            return false;
        }else {
            Building -=count;
            System.out.println("빌딩 판매");
            return true;

        }
    }
    //호텔 추가
    public void addHotel(int count){
        Hotel +=count;
    }
    //호텔 삭제
    public Boolean RemoveHotel(int count){
        if (Hotel-count<0){
            System.out.println("호텔갯수가 부족합니다");
            return false;
        }else {
            Hotel -=count;
            System.out.println("호텔 판매");
            return true;

        }
    }
}
