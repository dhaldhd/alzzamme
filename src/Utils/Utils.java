package Utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;

public class Utils {
	public void countToBin(int[][] vectorCountsTgMph2) {
		// TODO Auto-generated method stub
		for(int i = 0; i<vectorCountsTgMph2.length;i++)
			for(int j = 0; j<vectorCountsTgMph2[i].length;j++)
			{
				if(vectorCountsTgMph2[i][j] != 0) vectorCountsTgMph2[i][j] =1;
			}
	}

	public int insertVector(String[] vector, String temp) {

		int idx = -1;
		
		if(isSignificant(temp))
			idx = array_add(vector,temp);
		
		return idx;
	}
	
	public boolean isSignificant(String target)
	{
		String[] elimination = {"/J", "/E"};
		for (int i = 0; i <= elimination.length; i++) {
				if (i == elimination.length){
					return true;
				} else if (target.contains(elimination[i])) {
					break;
				}
			}
		return false;
	}


	public int array_add (String[] vector, String value) {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == null) {
				vector[i] = value;
				return i;
			}
		}

		return -1;
	}

	public int array_search (String[] vector, String value) {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == null) return -1;
			if (vector[i].equals(value)) {
				return i;
			}
		}

		return -1;
		
	}

	public int array_search (int[] vector, int value) {
		for (int i = 0; i < vector.length; i++) {
			
			if (vector[i]==value) {
				return i;
			}
		}
		return -1;

	}
	
	public  boolean isSignificantV(double idf, String vec, FileOutputStream fos) throws Exception {
		
		double UpperBound = 1;
		// TODO Auto-generated method stub
		String[] elimination = { "/V" };
		 String wrtLine;
		 
		//////////idf print
		for (int i = 0; i <= elimination.length; i++) {
			if (i == elimination.length){
				break;
			} else if (vec.contains(elimination[i])) {
				wrtLine = "idf ffffff ::::: " + vec + "," + idf+"\n";
				fos.write(wrtLine.getBytes());break;
			}
		}

		/////////////// idf print
		if(idf < UpperBound)
		{
			
			for (int i = 0; i <= elimination.length; i++) {
					if (i == elimination.length){
						return true;
					} else if (vec.contains(elimination[i])) {
							break;
					}
				}

			return false;
		}
		return true;
	}

	

}