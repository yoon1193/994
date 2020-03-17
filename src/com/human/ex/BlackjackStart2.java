package com.human.ex;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class BlackjackStart2 {

	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 =>�����̵�
		// 13 14 15 16 17 18 19 20 21 22 23 24 25 =>Ŭ�ι�
		// 26 27 28 29 30 31 32 33 34 35 36 37 38 =>���̾�
		// 39 40 41 42 43 44 45 46 47 48 49 50 51 =>��Ʈ

		int deck[] = new int[52];// deck �����������
		// ī����
		String cardShape[] = { "�����̵�", "Ŭ�ι�", "���̾�", "��Ʈ" };
		// ī�����
		String cardNumber[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k" };
		// deck[0]=0;
		// deck[1]=1;;
		// ī�� ����
		for (int i = 0; i < 52; i++) {
			deck[i] = i;
		}
		// ī�带 ����.
		Random rd = new Random();
		for (int i = 0; i < 10000; i++) {
			int rNumber = rd.nextInt(52);
			int temp;
			temp = deck[0];
			deck[0] = deck[rNumber];
			deck[rNumber] = temp;
		}

		// ī�带 ���徿 �̾Ƽ� �÷��̾�� �ִ� �۾�
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
				System.out.println("AUser�� ī�带 ���� �Ͻðڽ��ϱ� 0-no 1-yes");
				if (sc.nextLine().equals("0")) {
					userAFlag = false;
				}
				;
			}
			if (userBFlag) {
				System.out.println("BUser�� ī�带 ���� �Ͻðڽ��ϱ� 0-no 1-yes");
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

			// userA�� userB�� � ī�带 �޾Ҵ��� ����غ���.
			System.out.println("AUserCard");
			for (int i : userADeck) {

				if (i != -1) {

					System.out.print(" ī����" + cardShape[i / cardNumber.length]);
					System.out.print(" ī�����" + cardNumber[i % cardNumber.length]);
				}
			}
			System.out.println("");
			System.out.println("BUserCard");
			for (int i = 0; i < userBIndex; i++) {
				// System.out.println(userBDeck[i]+" ");
				System.out.print(" ī����" + cardShape[userBDeck[i] / cardNumber.length]);
				System.out.print(" ī�� ����" + cardNumber[userBDeck[i] % cardNumber.length]);
			}
			System.out.println("");

			// ���� ���
			// userADeck �������
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
					// A������ 10�����ؼ� 22�� ���������� scoureASum�� 10��
					// �����ְ� ������ �ȴ����ָ�ȴ�.
					if ((scoureASum + 10) <= 21) {
						scoureASum = scoureASum + 10;
					}
				}
			}
			System.out.println("totalAUser:" + scoureASum);
			if(scoureASum>21) {
				System.out.println("21�� �ʰ�");
				break;
			}

			// userBDeck �������
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
					// A������ 10�����ؼ� 22�� ���������� scoureASum�� 10��
					// �����ְ� ������ �ȴ����ָ�ȴ�.
					if ((scoureBSum + 10) <= 21) {
						scoureBSum = scoureBSum + 10;
					}
				}
			}
			System.out.println("totalBUser:" + scoureBSum);
			if(scoureBSum>21) {
				System.out.println("21�� �ʰ�");
				break;
			}

		}

		// userA�� userB�� � ī�带 �޾Ҵ��� ����غ���.
		System.out.println("AUserCard");
		for (int i : userADeck) {
			if (i != -1) {
				System.out.print(" ī����" + cardShape[i / cardNumber.length]);
				System.out.print(" ī�� ����" + cardNumber[i % cardNumber.length]);
			}
		}
		System.out.println("");
		System.out.println("BUserCard");
		for (int i = 0; i < userBIndex; i++) {
			// System.out.println(userBDeck[i]+" ");
			System.out.print(" ī����" + cardShape[userBDeck[i] / cardNumber.length]);
			System.out.print(" ī�� ����" + cardNumber[userBDeck[i] % cardNumber.length]);
		}
		System.out.println("");

		// ���� ����
		// ��A�¸���, ��B�¸���, �����ºΡ�
		String playState = "���";
		if (scoureASum > 21) {
			playState = "B�¸�";
		} else {
			if (scoureBSum > 21) {
				playState = "A�¸�";
			} else {
				if (scoureASum > scoureBSum) {
					playState = "A�¸�";
				} else if (scoureASum == scoureBSum) {
					playState = "���º�";
				} else {
					playState = "B�¸�";
				}
			}
		}
		System.out.println(playState);
	}

}
