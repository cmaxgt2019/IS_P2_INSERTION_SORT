package gt.edu.miumg.sistemas.ingesoftware.parcial2.InsertionSort;

import gt.edu.miumg.sistemas.ingesoftware.parcial2.InsertionSort.Services.IIsertionSort;
import gt.edu.miumg.sistemas.ingesoftware.parcial2.InsertionSort.Services.InsertionSort;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsertionSortApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(InsertionSortApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
        IIsertionSort ordering = new InsertionSort();
        
        String[] words ={"Android","IOS","Chromeos","FifefoxOS","Linux","Kali","Debian","Windows"};
        
        int count = 0;
        
        String orderingArray[] = ordering.InsertSort(words, words.length);
        
        for(int i = 0; i<words.length; i++){
        
            System.out.println(orderingArray[i]);
        }
        
        
        
        
    }

}
