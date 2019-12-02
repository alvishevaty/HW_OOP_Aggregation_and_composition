package by.home.les09.view;

import java.util.List;

import by.home.les09.entity.Sentence;
import by.home.les09.entity.Text;

public class TextView {

	public void printTitle(String title) {

		System.out.println("♦ " + title + " ♦");
	}

	public void printText(Text text) {

		List<Sentence> sentenceList = text.getText();
		for (int i = 0; i < sentenceList.size(); i++) {
			for (int j = 0; j < sentenceList.get(i).getSentence().size(); j++) {
				String nextWord = sentenceList.get(i).getSentence().get(j).getWord();
				System.out.print(nextWord);
			}
			System.out.println();
			
		}
	}
}
