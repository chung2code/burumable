package 부루마블;


import javax.naming.ldap.Control;
import java.util.ArrayList;
import java.util.Scanner;



public class Controller {
    ArrayList<Player>playerArr = new ArrayList<>();
    ArrayList<City>map = new ArrayList<>();

   public Controller(){
       init();
   }
    public void init() {
        playerArr.clear();
        playerArr.add(new Player(0,"0번플레이어"));
        playerArr.add(new Player(1,"1번플레이어"));

        map.clear();
        map.add(new City("서울",10,1000,150,70,100));
        map.add(new City("뉴욕",20,500,250,800,200));
        map.add(new City("마드리드",10,20,150,70,300));
        map.add(new City("리스본",10,20,150,10,400));
        map.add(new City("시카고",10,50,150,60,500));
        map.add(new City("발리",10,68,150,330,700));
        map.add(new City("베이징",10,143,150,20,300));
        map.add(new City("도쿄",10,130,150,330,10));
        map.add(new City("키이우",10,190,150,550,200));
        map.add(new City("모스크바",10,11,150,20,100));
    }




    public void start(){
        int idx = 0;
        String input = "";
        Scanner scan = new Scanner(System.in);
        while(true){
            if (playerArr.size()==idx){
                idx=0;
            }
            Player curPlayer = playerArr.get(idx);
            System.out.println(curPlayer.getName() + "님의 차례입니다");
            System.out.println("주사위를 던져주세요(엔터)");
            scan.nextLine();

            int diceValue = curPlayer.dice();
            int curLocation = curPlayer.getLocation();
            curLocation = curLocation + diceValue;

            City curCity = map.get(curLocation);
            if (curCity.getOwner()==-1){
                //빈땅
                System.out.println("현재위치"+curCity.getName());
                System.out.println("빈 땅입니다 사시겠습니까? 1)산다 2)넘어가기");
                input = scan.nextLine();
                if (input.equals("1")){
                    //산다
                    curPlayer.buy(curCity);

                }else if(curCity.getOwner()==curPlayer.getId()) {
                    //내땅
                }else {
                    //남의땅
                }
                idx++;
            }

        }


    }


}
