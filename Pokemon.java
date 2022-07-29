public class Pokemon {
    //名前
    String name;

    //種族値
    int bsHp;
    int bsAtk;
    int bsDef;
    int bsSpatk;
    int bsSpdef;
    int bsSpeed;

    //レベル   
    final int level =50;
    
    //タイプ
    String type1;
    String type2;
    
    //性格補正
    final double upNature = 1.1;
    final double downNature = 0.9;
    final double normalNature = 1.0;

    //努力値
    int hpEv;
    int atkEv;
    int defEv;
    int spAtkEv;
    int spDefEv;
    int speedEv;

    //個体値
    //とりあえず今は31で固定
    int hpIv = 31;
    int atkIv = 31;
    int defIv = 31;
    int spAtkIv = 31;
    int spDefIv = 31;
    int speedIv = 31;

    //ステータス
    int hp;
    int atk;
    int def;
    int spAtk;
    int spDef;
    int speed;

    //技
    Move move;
    
    public void attack(){
        System.out.println(this.name + "は" + move.name + "を繰り出した！");
        System.out.println(move.damage + "のダメージを与えた！");
    }
    
    public void statusCalc(int ihpEv,int iatkEv,int idefEv,int ispAtkEv,int ispDefEv,int ispeedEv){
        //努力値を指定してステータスを決定する
        
        this.hpEv = ihpEv;
        this.atkEv = iatkEv;
        this.defEv = idefEv;
        this.spAtkEv = ispAtkEv;
        this.spDefEv = ispDefEv;
        this.speedEv = ispeedEv;
        
        //ステータスの決定
        double dhp = (this.bsHp*2+this.hpIv+this.hpEv/4)*0.5+60;
        double datk = (this.bsAtk*2+this.atkIv+this.atkEv/4)*0.5+5;
        double ddef = (this.bsDef*2+this.defIv+this.defEv/4)*0.5+5;
        double dspAtk = (this.bsSpatk*2+this.spAtkIv+this.spAtkEv/4)*0.5+5;
        double dspDef = (this.bsSpdef*2+this.spDefIv+this.spDefEv/4)*0.5+5;
        double dspeed = (this.bsSpeed*2+this.speedIv+this.speedEv/4)*0.5+5;

        this.hp = (int)dhp;
        this.atk = (int)datk;
        this.def = (int)ddef;
        this.spAtk = (int)dspAtk;
        this.spDef = (int)dspDef;
        this.speed = (int)dspeed;


        System.out.println("HP "+ hp +" ");
        System.out.println("こうげき " + atk +" ");
        System.out.println("ぼうぎょ "+def +" ");
        System.out.println("とくこう "+spAtk +" ");
        System.out.println("とくぼう "+spDef +" ");
        System.out.println("すばやさ "+speed +" ");
        System.out.println("");
        
    }

    public Pokemon(int ibsHp,int ibsAtk,int ibsDef,int ibsSpAtk,int ibsSpDef, int ibsSpeed){
        this.bsHp = ibsHp;
        this.bsAtk = ibsAtk;
        this.bsDef = ibsDef;
        this.bsSpatk = ibsSpAtk;
        this.bsSpdef = ibsSpDef;
        this.bsSpeed = ibsSpeed;
    }

}
