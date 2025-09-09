public class Main{
	public static int[] findTwoBestscores(int[] array){
	    int firstBestscore = Integer.MIN_VALUE;
	    int secondBestscore = Integer.MIN_VALUE;
	    int thirdBestscore = Integer.MIN_VALUE;
	    
	    for(int score : array){
	        if(score > firstBestscore){
	            thirdBestscore = secondBestscore;
	            secondBestscore = firstBestscore;
	            firstBestscore = score;
	        }
	        else if(score > secondBestscore && score < firstBestscore){
	            thirdBestscore = secondBestscore;
	            secondBestscore = score;
	        }
	        else if(score > thirdBestscore && score < secondBestscore){
	            thirdBestscore=score;
	        }
	    }
	     return new int[]{firstBestscore,secondBestscore,thirdBestscore};
	}
	public static void main(String[]args){
	    int[] array ={20,40,30,78,98,24};
	    int[] Bestscore =  findTwoBestscores(array);
	    System.out.println("BestScore = " + Bestscore[0] + " , " + Bestscore[1] + " and " + Bestscore[2]);
	}
}