package com.role;

public class PK {
	
	public static void main(String[] args) {
		
		
		Hero ��ʥ = new Hero();
		
		��ʥ.name = "��ʥ";
		��ʥ.normalAttack = 50; // ��ͨ�����˺�ֵ 50 ��
		��ʥ.attackSpeed = 100; //100 ���빥��һ��
		��ʥ.magicAttack = 200 ;  // ħ������ 200 ��
		��ʥ.cd  = 4000 ; // 4�� cd
		��ʥ.manaCost = 150;
		��ʥ.hp = 650;
		��ʥ.mp = 300;
		��ʥ.defense = 20;
		��ʥ.dodge = 10;
		
		Hero ������ʿ = new Hero();
		
		������ʿ.name = "������ʿ";
		������ʿ.normalAttack = 30; // ��ͨ�����˺�ֵ30 ��
		������ʿ.attackSpeed = 200; //200 ���빥��һ��
		������ʿ.magicAttack = 200 ;  // ħ������ 200 ��
		������ʿ.cd  = 3000 ; // 4�� cd
		������ʿ.manaCost = 130;
		������ʿ.hp = 750;
		������ʿ.mp = 260;
		������ʿ.defense = 30;
		������ʿ.dodge = 4;
		
		

		
		while( ������ʿ.hp>0 && ��ʥ.hp > 0  ) {
			
			������ʿ.attack(��ʥ);
			
			��ʥ.attack(������ʿ);
			
		}
		
	
		
	}

}
