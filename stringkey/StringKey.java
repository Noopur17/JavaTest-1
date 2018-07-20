package com.marlabs.stringkey;

public class StringKey {
	public static void main(String[] args) {
		String[] k = new String[] { "a", "b", "a", "b", "b", "a" };
		String[] a = new String[] { "a", "a", "b", "b", "b", "a" };
		System.out.println("Key is  :" + k);
		System.out.println("Answer is:" + a);
		StringKey sk1 = new StringKey();
		sk1.scoreUp(k, a);
	}

	public int scoreUp(String[] key, String[] answers) {

		int score = 0;

		for (int i = 0; i < key.length; i++) {

			if (key[i] == answers[i])

				score += 4;

			else if (answers[i] != "?" && answers[i] != key[i])

				score--;

		}
		System.out.println(score);

		return score;

	}

}
