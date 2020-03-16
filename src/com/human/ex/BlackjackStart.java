package com.human.ex;

import java.util.Arrays;
import java.util.Random;

public class BlackjackStart {

	public static void main(String[] args) {
		//0 1 2 3 4 5 6 7 8 9 10 11 12 =>스페이드
		//13 14 15 16 17 18 19 20 21 22 23 24 25 =>클로바
		//26 27 28 29 30 31 32 33 34 35 36 37 38 =>다이아
		//39 40 41 42 43 44 45 46 47 48 49 50 51 =>하트
	
		//카드 생성
		int deck[]=new int[52];//52장의 카드들(덱)저장공간
		String cardShape[]= {"스페이드","클로바","다이아","하트"};//카드모양
		String cardNum[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};//카드숫자
		for(int i=0;i<deck.length;i++) {
			deck[i]=i;
		}
		
		//카드를 섞어보자
		Random rand=new Random();
		for(int i=0;i<10000;i++) {
			int randNum=rand.nextInt(52);
			int temp;
			temp=deck[0];
			deck[0]=deck[randNum];
			deck[randNum]=temp;
		}
		
//		섞인카드 모두 출력(섞였는지 확인용)
//		for(int i:deck) {
//			System.out.println(i+" ");
//			System.out.println("카드모양:"+cardShape[i/cardNum.length]);//i/13
//			System.out.println("카드 숫자:"+cardNum[i%cardNum.length]);//i%13 
//		}
		
		//카드를 1장씩 뽑아서 플레이어에게 주는 작업
		int deckIndex=0;
		int player1Deck[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};//카드가 없다는걸 음수로 표현
		int player2Deck[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};//0 이상이 들어가면 카드숫자와 겹침
		int player1Index=0;
		int player2Index=0;
		for(int i=0;i<3;i++) {
			player1Deck[player1Index]=deck[deckIndex];
			deckIndex++;
			player1Index++;
			player2Deck[player2Index]=deck[deckIndex];
			deckIndex++;
			player2Index++;
		}
		
		//player가 어떤 카드를 받았는지 출력
		System.out.println("player1Card ");
		for(int i:player1Deck) {
			if(i!=-1) {
				//System.out.print(i+" ");////0~51중 어떤카드인지
				System.out.println(cardShape[i/cardNum.length]);//카드모양
				System.out.println(cardNum[i%cardNum.length]);//카드숫자
			}
		}
		System.out.println(" ");
		System.out.println("player2Card ");
		for(int i=0;i<player2Index;i++) {
			//System.out.println(player2Deck[i]+" ");//0~51중 어떤카드인지
			System.out.println(cardShape[player2Deck[i]/cardNum.length]);//카드모양
			System.out.println(cardNum[player2Deck[i]%cardNum.length]);//카드숫자
		}
		System.out.println(" ");
		
		//점수 계산
		int score1=0;
		int score2=0;
		int score1Sum=0;
		int score2Sum=0;
		for(int i=0;i<player1Index;i++) {
			score1=player1Deck[i]%13+1;
			score2=player2Deck[i]%13+1;
			if(score1>10) {
				score1=10;
			}
			score1Sum+=score1;
			if(score2>10) {
				score2=10;
			}
			score2Sum+=score2;
		}
		//A가 1 or 11 ?
		for(int i=0;i<player1Index;i++) {
			if(player1Deck[i]%13==0){//카드중 A가 있을떄
				if(score1Sum+10<=21) {//A카드+2장카드+10 이 21보다 작거나 같으면 10을 더해줘 A를11로 판별한다
					score1Sum+=10;
				}		
			}
			if(player2Deck[i]%13==0){
				if(score2Sum+10<=21) {
					score2Sum+=10;
				}				
			}
		}
		System.out.println("player1의 점수는="+score1Sum);
		System.out.println("player2의 점수는="+score2Sum);
		//승패결정
		String playState="계속";
		if(score1Sum>21) {
			playState="player2의 승리";
		}
		//play2도 21이 넘어가는 경우도 있지만 ,	
		//play2가 마지막 카드받기전 play1이 마지막 카드를 먼저받아 오픈되므로
		//play1의카드가 21이 넘는순간 play2의승리 이 코드는 3장을 미리받는 프로그램이라 이해바람.
		else {
			if(score2Sum>21) {
				playState="player1의 승리";
			}
			else {
				if(score1Sum>score2Sum) {
					playState="player1의 승리";
				}
				else if(score1Sum==score2Sum) {
					playState="무승부";
				}
				else {
					playState="player2의 승리";
				}
			}
		}
		System.out.println(playState);
		//카드생성-카드섞이-게임진행(미완성)-받은카드 출력-카드합계-승패
	}
	

}
