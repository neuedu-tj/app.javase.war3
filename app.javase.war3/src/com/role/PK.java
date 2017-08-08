package com.role;

public class PK {
	
	public static void main(String[] args) {
		
		
		Hero ½£Ê¥ = new Hero();
		
		½£Ê¥.name = "½£Ê¥";
		½£Ê¥.normalAttack = 50; // ÆÕÍ¨¹¥»÷ÉËº¦Öµ 50 µã
		½£Ê¥.attackSpeed = 100; //100 ºÁÃë¹¥»÷Ò»´Î
		½£Ê¥.magicAttack = 200 ;  // Ä§·¨¹¥»÷ 200 µã
		½£Ê¥.cd  = 4000 ; // 4Ãë cd
		½£Ê¥.manaCost = 150;
		½£Ê¥.hp = 650;
		½£Ê¥.mp = 300;
		½£Ê¥.defense = 20;
		½£Ê¥.dodge = 10;
		
		Hero ËÀÍöÆïÊ¿ = new Hero();
		
		ËÀÍöÆïÊ¿.name = "ËÀÍöÆïÊ¿";
		ËÀÍöÆïÊ¿.normalAttack = 30; // ÆÕÍ¨¹¥»÷ÉËº¦Öµ30 µã
		ËÀÍöÆïÊ¿.attackSpeed = 200; //200 ºÁÃë¹¥»÷Ò»´Î
		ËÀÍöÆïÊ¿.magicAttack = 200 ;  // Ä§·¨¹¥»÷ 200 µã
		ËÀÍöÆïÊ¿.cd  = 3000 ; // 4Ãë cd
		ËÀÍöÆïÊ¿.manaCost = 130;
		ËÀÍöÆïÊ¿.hp = 750;
		ËÀÍöÆïÊ¿.mp = 260;
		ËÀÍöÆïÊ¿.defense = 30;
		ËÀÍöÆïÊ¿.dodge = 4;
		
		

		
		while( ËÀÍöÆïÊ¿.hp>0 && ½£Ê¥.hp > 0  ) {
			
			ËÀÍöÆïÊ¿.attack(½£Ê¥);
			
			½£Ê¥.attack(ËÀÍöÆïÊ¿);
			
		}
		
	
		
	}

}
