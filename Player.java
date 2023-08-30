package 부루마블;

import java.util.Random;

public class Player {

    private int id; //플레이어 ID
    private int location = 0;   //플레이어 위치
    private int budget = 1000000;  //플레이어 예산
    private String name;    //플레이어 이름

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //주사위
    //주사위의 랜덤값을 받음
   public int  dice(){
        Random rd = new Random();
        int dice1 = rd.nextInt(6) +1;
        int dice2 = rd.nextInt(6) +1;
      return dice1+dice2;

   }
    public  void move(int amount){
        location += amount;
    }

    public void buy(City city){
        int LandPrice = city.getLandPrice();
        if(LandPrice>budget){
            System.out.println("못사지롱");
        }else {
            budget -= LandPrice;
            city.setOwner(id);
        }
    }

    //플레이어에게 지불
    public void PayToPlayer(Player player){

    }
    //은행에 지불
    public void payToBank(int amount){

    }
}
