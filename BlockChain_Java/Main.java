import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {

    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        String[] genesisTransactions = {"jin sent bob 1 bitcoin","tom sent jin 1 bitcoin"};
        Block genesisBlock = new Block( 0, genesisTransactions);

        String[] block2Transactions = {"jin sent mike 1 bitcoin","tom sent bob 1 bitcoin"};
        Block block2 = new Block( genesisBlock.getBlockHash(), block2Transactions);

        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());
        System.out.println("Hash of block2:");
        System.out.println(block2.getBlockHash());
    }
}