package cts.test.design.patterns.structurals.proxy;

public class FilterProxy implements  IChatServer{

    IChatServer server;  // handle the message sending if the message passes the filter.

    //constructor
    public FilterProxy(IChatServer server) {
        this.server = server;
    }

    @Override
    public void sendMessage(String author, String destination, String message) //overrides the 'sendMessage' method from the interface
    {
        //filter the messages
        String[] dictionary = {"violent", "stupid", "hate"}; // words considered forbidden
        String[] words =message.split(" "); // the message is split into individual words based on spaces and stores in the 'words' array
        boolean hasForbiddenWords = false; //initialize with false; used to indicate if any forbidden words are found in the message

        for (String word : words){   // check each word in the 'words' array against each word in the 'dictionary'
            for (String w : dictionary)
            {
                if(word.toLowerCase().equals(w)){
                    hasForbiddenWords=true;
                    break;
                }
            }
        }

        if(! hasForbiddenWords){
            server.sendMessage(author, destination, message);
        }
        else {
            System.out.println("Message dropped");
        }





    }
}
