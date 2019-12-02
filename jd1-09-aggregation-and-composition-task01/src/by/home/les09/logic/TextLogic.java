package by.home.les09.logic;

import by.home.les09.entity.Text;

public class TextLogic {

	public Text textRules(Text text) {

		int textSize = text.getText().size();

		for (int i = 0; i < textSize; i++) {

			String space = " ";
			String point = ".";

			int sentenceLength = text.getText().get(i).getSentence().size();

			for (int j = 0; j < sentenceLength; j++) {

				String nextWord = text.getText().get(i).getSentence().get(j).getWord();

				if (j == sentenceLength - 1) {
					nextWord = nextWord + point;

				} else {
					nextWord = nextWord + space;
				}

				text.getText().get(i).getSentence().get(j).setWord(nextWord);
			}

		}
		return text;
	}

	public String titleRules(String title) {
		title = title.toUpperCase();
		return title;
	}
}
