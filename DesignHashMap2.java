package Salesforce;

import java.util.Arrays;

public class DesignHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesignHashMap2 obj = new DesignHashMap2();
		obj.put(1,2);
		obj.put(1,12);
		obj.put(2,2);

		int param_2 = obj.get(1);
		obj.remove(1);
	}
	
	int[] map;

    public void DesignHashmap2()
	{
        map = new int[1000001];
        Arrays.fill(map,-1);
    }
	
    public int get(int key)
	{
        return map[key];
    }
    
	public void put(int key, int value)
	{
        map[key] = value;
    }
    
	public void remove(int key)
	{
        map[key] = -1;
    }

}
