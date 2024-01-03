package arrays;

public class Arrays {
	public static void main(String[] args) {
		double[] scoreStudentA = new double[4];
		scoreStudentA[0] = 4.4;
		scoreStudentA[1] = 6.6;
		scoreStudentA[2] = 6.6;
		scoreStudentA[3] = 8.8;

		System.out.println(scoreStudentA[0]);

		double scoreTotalStudentA = 0;
		for (int i = 0; i < scoreStudentA.length; i++) {
			scoreTotalStudentA += scoreStudentA[i];
		}
		System.out.println(scoreTotalStudentA / scoreStudentA.length);

		double[] scoreStudentB = { 9.2, 9.6, 9.5, 9.9 };
		double scoreTotalStudentB = 0;
		for (int i = 0; i < scoreStudentB.length; i++) {
			scoreTotalStudentB += scoreStudentB[i];
		}
		
		System.out.println(scoreTotalStudentB / scoreStudentB.length);
	}
}
