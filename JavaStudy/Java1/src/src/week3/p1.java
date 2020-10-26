package src.week3;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {

            printMenu();
            System.out.println("번호 선택 : ");
            int n = input.nextInt();

            switch (n) {

                    case 1:
                        printIceCreamMenu();
                        inputValue();
                        break;
                    case 2:
                        printCoffeeCreamMenu();
                        inputValue();
                        break;
                    case 3:
                        printDrinkMenu();
                        inputValue();
                        break;
                    case 4:
                        System.out.println("감사합니다. 거래를 종료합니다.");
                        System.exit(-1);
                        break;

                    default:
                        System.out.println("올바르지 않은 입력입니다.");
                        break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("어떤 종류를 원하 십니까?");
        System.out.println("아이스크림 : \t1");
        System.out.println("커피 : \t\t2");
        System.out.println("음료 : \t\t3");
        System.out.println("종료 : \t\t4");
    }

    public static void printIceCreamMenu() {
        System.out.println("무엇을 드시겠습니까?");
        System.out.println("바닐라 아이스크림(1000원) :\t1");
        System.out.println("아몬드 아이스크림(1400원) :\t2");
        System.out.println("딸기 아이스크림(1400원) :\t3");
        System.out.println("호두 아이스크림(1400원) :\t4");
    }

    public static void printCoffeeCreamMenu() {
        System.out.println("무엇을 드시겠습니까?");
        System.out.println("아메리칸(1000원) : \t1");
        System.out.println("카페라떼(1400원) : \t2");
        System.out.println("에스프레소(1400원) : \t3");
    }

    public static void printDrinkMenu() {
        System.out.println("무엇을 드시겠습니까?");
        System.out.println("생수(1000원) : \t\t1");
        System.out.println("오렌지쥬스(1400원) : \t2");
        System.out.println("망고쥬스(1400원) : \t3");
        System.out.println("우유(1400원) : \t\t4");
    }

    public static void inputValue() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println( n+" 선택, 감사합니다.");
        }
        }
