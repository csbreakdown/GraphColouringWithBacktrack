import java.util.Arrays;
/*
 * Written by Karim Hamasni
 * Graph Colouring using Backtracking
 * April 20, 2015
 * for CSBreakdown.com
 */
public class mainProgram {
	public static void main(String[] args){
		graphColour(0);
	}
	
	static int[] x = {0,0,0,0};
	static int m = 3;
	static int n = 4;
	static int[][] G = {{1,1,0,1},{1,1,1,1},{0,1,1,1},{1,1,1,1}};
		
	public static void graphColour(int k){
		for(int c = 1; c<=m; c++){
			if(isSafe(k,c)){
				x[k] = c;
				if((k+1)<n){
					graphColour(k+1);
				}
				else {
					System.out.println(Arrays.toString(x));
					return;
				}
				
			}
		}
	}
	
	public static boolean isSafe(int k, int c){
		for(int i = 0; i< n; i++){
			if(G[k][i] == 1 && c == x[i]){
				return false;
			}
		}
		return true;
	}
}
