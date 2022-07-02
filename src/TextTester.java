
import java.util.*;

public class TextTester {
	List<Collection> collection_list;
	List<Document> document_list;
	List<Paragraph> paragraph_list;
	
	TextTester(){

		collection_list = new ArrayList<>();
		
		document_list = new ArrayList<>();
		paragraph_list = new ArrayList<>();
	}
	
	public void addText(TextCharacter tc){
		if(tc.getClass().getName() == "Document") {
			document_list.add((Document) tc);
		}else if(tc.getClass().getName() == "Collection") {
			collection_list.add((Collection) tc);
		}else if(tc.getClass().getName() == "Paragraph") {
			paragraph_list.add((Paragraph)tc);
		}
	}
	
	public double displayTextAverage(TextCharacter tc) {
		if(tc.getClass().getName() == "Document") {
			int sum = 0;
			for(Document doc: document_list) {
				sum += doc.Number_of_paragraph;
			}
			return sum/document_list.size();
		}else if(tc.getClass().getName() == "Collection") {
			int sum = 0;
			for(Collection col: collection_list) {
				sum += col.Number_of_document;
			}
			return sum/collection_list.size();
		}else if(tc.getClass().getName() == "Paragraph") {
			int sum = 0;
			for(Paragraph para: paragraph_list) {
				sum += para.Number_of_scentence;
			}
			return sum/paragraph_list.size();
		}
		return 0;
	}
	
	public static void main(String[] args) {
		TextTester tt = new TextTester();
		
		TextCharacter doc1 = new Document();
		TextCharacter doc2 = new Document();
		tt.addText(doc1);
		tt.addText(doc2);
		
		TextCharacter col1 = new Collection();
		TextCharacter col2 = new Collection();
		TextCharacter col3 = new Collection();
		tt.addText(col1);
		tt.addText(col2);
		tt.addText(col3);
		
		TextCharacter para1 = new Paragraph();
		TextCharacter para2 = new Paragraph();
		TextCharacter para3 = new Paragraph();
		TextCharacter para4 = new Paragraph();
		tt.addText(para1);
		tt.addText(para2);
		tt.addText(para3);
		tt.addText(para4);
		
		System.out.println(tt.displayTextAverage(para1));
		System.out.println(tt.displayTextAverage(col1));
		System.out.println(tt.displayTextAverage(doc1));
	}
}
