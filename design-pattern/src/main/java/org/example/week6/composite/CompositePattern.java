package org.example.week6.composite;

import org.example.week6.composite.menu.Menu;
import org.example.week6.composite.menu.MenuComponent;
import org.example.week6.composite.menu.MenuItem;
import org.example.week6.composite.menu.Waitress;

public class CompositePattern {
    public void play() {
        MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
        MenuComponent dinerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
        MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨보세요!");

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴를 모았다");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B 팬케이크 세트", "스크램블 에그와 토스트가 곁들여진 팬케이크", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("레귤러 팬케이크 세트", "달걀 후라이와 소시지가 곁들여진 팬케이크", false, 2.99));

        dinerMenu.add(new MenuItem("BLT", "통밀빵에 베이컨과 양상추, 토마토를 곁들인 메뉴", false, 2.99));
        dinerMenu.add(new MenuItem("핫도그", "사워크라우트, 양파, 치즈가 곁들여진 핫도그", false, 3.05));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("애플 파이", "바삭한 크러스트의 애플 파이, 바닐라 아이스크림이 얹혀있다", true, 1.59));
        dessertMenu.add(new MenuItem("치즈케이크", "초콜릿 그레이엄 크러스트의 진한 치즈케이크", true, 1.99));

        cafeMenu.add(new MenuItem("베지 버거와 에어프라이", "통밀빵, 상추, 토마토, 감자 튀김이 곁들여진 베지 버거", true, 3.99));
        cafeMenu.add(new MenuItem("부리토", "강낭콩, 살사, 구아카몰레가 곁들여진 푸짐한 부리토", true, 4.29));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

        System.out.println("""

                [개선점]
                - 잎(MenuItem)과 가지(Menu)가 같은 타입(MenuComponent)으로 한 컬렉션에 들어간다.
                - 디너 메뉴 안에 디저트 서브메뉴를 그냥 add() 한 번으로 끼워넣을 수 있다.
                - Waitress 는 최상위 MenuComponent 의 print() 한 번만 호출하면 트리 전체가 출력된다.
                - 서브메뉴 깊이가 깊어져도 클라이언트 코드는 한 줄도 바뀌지 않는다.
                """);
    }
}
