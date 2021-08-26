package Salesforce;

public class ReachingPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sx = 1, sy = 1, tx = 2, ty = 2;
		boolean b=reachingPoints(sx, sy, tx, ty);
		System.out.println(b);
	}

	public static boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (sx < tx && sy < ty)
           if (tx < ty) ty %= tx;
           else tx %= ty;
       return sx == tx && sy <= ty && (ty - sy) % sx == 0 ||
              sy == ty && sx <= tx && (tx - sx) % sy == 0;
   }
}
