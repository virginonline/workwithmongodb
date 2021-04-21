import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.pojo.PojoCodecProvider;

public class application {
    private static final String db_uri = ""; //your uri link for connection
    public static void main(String[] args) {

        MongoCollection<Pojo> collection = new MongoClient(new MongoClientURI(db_uri))
                .getDatabase("data")
                .withCodecRegistry(CodecRegistries.fromRegistries(
                        MongoClientSettings.getDefaultCodecRegistry(),
                        CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build())
                )).getCollection("test",Pojo.class);
        System.out.println("Connected!");
        collection.insertOne(new Pojo(5555555,"Ivan",Pojo.Jobs.PROGRAMMER));
        System.out.println("Done");
    }
}
