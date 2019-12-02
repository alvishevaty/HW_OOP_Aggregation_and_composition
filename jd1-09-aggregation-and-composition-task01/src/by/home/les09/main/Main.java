package by.home.les09.main;

import by.home.les09.entity.Sentence;
import by.home.les09.entity.Text;
import by.home.les09.entity.Word;
import by.home.les09.logic.TextLogic;
import by.home.les09.view.TextView;

public class Main {

	public static void main(String[] args) {

		Word word = new Word("Нон-стоп");
		Word word1 = new Word("Музыка");
		Word word2 = new Word("громче");
		Word word3 = new Word("глаза");
		Word word4 = new Word("закрыты");
		Word word5 = new Word("Это");
		Word word6 = new Word("нон-стоп");
		Word word7 = new Word("ночью");
		Word word8 = new Word("открытий");
		Word word9 = new Word("Делай");
		Word word10 = new Word("что");
		Word word11 = new Word("хочешь");
		Word word12 = new Word("я");
		Word word13 = new Word("забываюсь");
		Word word14 = new Word("Это");
		Word word15 = new Word("нон-стоп");
		Word word16 = new Word("не");
		Word word17 = new Word("прекращаясь");

		Sentence sentence1 = new Sentence();
		Sentence sentence2 = new Sentence();
		Sentence sentence3 = new Sentence();
		Sentence sentence4 = new Sentence();

		sentence1.getSentence().add(word1);
		sentence1.getSentence().add(word2);
		sentence1.getSentence().add(word3);
		sentence1.getSentence().add(word4);
		sentence2.getSentence().add(word5);
		sentence2.getSentence().add(word6);
		sentence2.getSentence().add(word7);
		sentence2.getSentence().add(word8);
		sentence3.getSentence().add(word9);
		sentence3.getSentence().add(word10);
		sentence3.getSentence().add(word11);
		sentence3.getSentence().add(word12);
		sentence3.getSentence().add(word13);
		sentence4.getSentence().add(word14);
		sentence4.getSentence().add(word15);
		sentence4.getSentence().add(word16);
		sentence4.getSentence().add(word17);

		Text text = new Text();

		text.setTitle(word.getWord());
		text.getText().add(sentence1);
		text.getText().add(sentence2);
		text.getText().add(sentence3);
		text.getText().add(sentence4);

		TextLogic textLogic = new TextLogic();
		TextView textView = new TextView();

		textView.printTitle(textLogic.titleRules(text.getTitle()));
		textView.printText(textLogic.textRules(text));

	}
}
