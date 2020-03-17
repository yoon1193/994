package com.human.ex;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class BlackjackStart2 {

	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 =>스페이드
		// 13 14 15 16 17 18 19 20 21 22 23 24 25 =>클로바
		// 26 27 28 29 30 31 32 33 34 35 36 37 38 =>다이아
		// 39 40 41 42 43 44 45 46 47 48 49 50 51 =>하트

		int deck[] = new int[52];// deck 저장공간생성
		// 카드모양
		String cardShape[] = { "스페이드", "클로바", "다이아", "하트" };
		// 카드숫자
		String cardNumber[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k" };
		// deck[0]=0;
		// deck[1]=1;;
		// 카드 생성
		for (int i = 0; i < 52; i++) {
			deck[i] = i;
		}
		// 카드를 썩어보자.
		Random rd = new Random();
		for (int i = 0; i < 10000; i++) {
			int rNumber = rd.nextInt(52);
			int temp;
			temp = deck[0];
			deck[0] = deck[rNumber];
			deck[rNumber] = temp;
		}

		// 카드를 한장씩 뽑아서 플레이어에게 주는 작업
		int deckIndex = 0;
		int userADeck[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		int userBDeck[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		int userAIndex = 0;
		int userBIndex = 0;
		boolean userAFlag = true;
		boolean userBFlag = true;
		Scanner sc = new Scanner(System.in);
		int scoureBSum = 0;
		int scoureASum = 0;

		for (int j = 0; j < 10; j++) {
			if (userAFlag) {
				System.out.println("AUser님 카드를 수령 하시겠습니까 0-no 1-yes");
				if (sc.nextLine().equals("0")) {
					userAFlag = false;
				}
				;
			}
			if (userBFlag) {
				System.out.println("BUser님 카드를 수령 하시겠습니까 0-no 1-yes");
				if (sc.nextLine().equals("0")) {
					userBFlag = false;
				}
				;
			}
			if (!(userAFlag || userBFlag)) {
				break;
			}

			if (userAFlag) {
				userADeck[userAIndex] = deck[deckIndex];
				deckIndex++;
				userAIndex++;
			}
			if (userBFlag) {
				userBDeck[userBIndex] = deck[deckIndex];
				userBIndex++;
				deckIndex++;
			}

			// userA와 userB가 어떤 카드를 받았는지 출력해보자.
			System.out.println("AUserCard");
			for (int i : userADeck) {

				if (i != -1) {

					System.out.print(" 카드모양" + cardShape[i / cardNumber.length]);
					System.out.print(" 카드숫자" + cardNumber[i % cardNumber.length]);
				}
			}
			System.out.println("");
			System.out.println("BUserCard");
			for (int i = 0; i < userBIndex; i++) {
				// System.out.println(userBDeck[i]+" ");
				System.out.print(" 카드모양" + cardShape[userBDeck[i] / cardNumber.length]);
				System.out.print(" 카드 숫자" + cardNumber[userBDeck[i] % cardNumber.length]);
			}
			System.out.println("");

			// 점수 계산
			// userADeck 점수계산
			// int scoureA=0;
			// scoureA=userADeck[i]%13+1;
			// if(scoureA>10) scoureA=10;
			scoureASum=0;
			for (int i = 0; i < userAIndex; i++) {
				int scoureA = 0;
				scoureA = userADeck[i] % 13 + 1;
				if (scoureA > 10) {
					scoureA = 10;
				}
				scoureASum = scoureASum + scoureA;
			}
			// A 1 or 11
			for (int i = 0; i < userAIndex; i++) {

				if (userADeck[i] % 13 == 0) {
					// A있으면 10을더해서 22가 넘지않으면 scoureASum에 10을
					// 더해주고 넘으면 안더해주면된다.
					if ((scoureASum + 10) <= 21) {
						scoureASum = scoureASum + 10;
					}
				}
			}
			System.out.println("totalAUser:" + scoureASum);
			if(scoureASum>21) {
				System.out.println("21을 초과");
				break;
			}

			// userBDeck 점수계산
			scoureBSum=0;
			for (int i = 0; i < userBIndex; i++) {
				int scoureB = 0;
				scoureB = userBDeck[i] % 13 + 1;
				if (scoureB > 10) {
					scoureB = 10;
				}
				scoureBSum = scoureBSum + scoureB;
			}
			// A 1 or 11
			for (int i = 0; i < userBIndex; i++) {

				if (userBDeck[i] % 13 == 0) {
					// A있으면 10을더해서 22가 넘지않으면 scoureASum에 10을
					// 더해주고 넘으면 안더해주면된다.
					if ((scoureBSum + 10) <= 21) {
						scoureBSum = scoureBSum + 10;
					}
				}
			}
			System.out.println("totalBUser:" + scoureBSum);
			if(scoureBSum>21) {
				System.out.println("21을 초과");
				break;
			}

		}

		// userA와 userB가 어떤 카드를 받았는지 출력해보자.
		System.out.println("AUserCard");
		for (int i : userADeck) {
			if (i != -1) {
				System.out.print(" 카드모양" + cardShape[i / cardNumber.length]);
				System.out.print(" 카드 숫자" + cardNumber[i % cardNumber.length]);
			}
		}
		System.out.println("");
		System.out.println("BUserCard");
		for (int i = 0; i < userBIndex; i++) {
			// System.out.println(userBDeck[i]+" ");
			System.out.print(" 카드모양" + cardShape[userBDeck[i] / cardNumber.length]);
			System.out.print(" 카드 숫자" + cardNumber[userBDeck[i] % cardNumber.length]);
		}
		System.out.println("");

		// 승패 결정
		// “A승리”, “B승리”, “무승부”
		String playState = "계속";
		if (scoureASum > 21) {
			playState = "B승리";
		} else {
			if (scoureBSum > 21) {
				playState = "A승리";
			} else {
				if (scoureASum > scoureBSum) {
					playState = "A승리";
				} else if (scoureASum == scoureBSum) {
					playState = "무승부";
				} else {
					playState = "B승리";
				}
			}
		}
		System.out.println(playState);
	}

}
