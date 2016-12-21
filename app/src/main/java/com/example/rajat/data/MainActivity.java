package com.example.rajat.data;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;


public class MainActivity extends Activity {
public static String p;

    Button b1;
     DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p = getApplicationContext().getPackageName();
        db=new DatabaseHelper(this);
        // Inserting Contacts
        Log.d("Insert: ", "Inserting ..");


        db.addContact(new Contact(1, "A Study In Pink", "The police investigate the deaths of a series of people who all appear to have committed suicide by taking a poisonous pill. They turn to their unofficial consultant, Sherlock Holmes, who deduces various elements pointing to a serial killer. Meanwhile, Holmes is introduced to John Watson, a former soldier who served in Afghanistan, and the pair immediately move into a flat in Baker Street. John Watson slowly gets to know and trust Sherlock despite police officer Sally Donovan (Vinette Robinson) warning him that Holmes is a psychopath and will one day be responsible for murder. Sherlock's brother Mycroft (Mark Gatiss), at first not revealing his identity, arranges a meeting with Watson and asks whether he'll spy on Sherlock for money, but John refuses. After a series of incidents, the person responsible for the deaths, a taxicab driver (Phil Davis), reveals that his victims took their own lives by playing a game of Russian roulette with two pills: one fatally poisonous, the other safe. Before Sherlock can play the cabbie's game, John shoots the cabbie from an opposite building. Before he dies, the taxicab driver reveals that \"Moriarty\" was his sponsor.", "88 minutes",BitmapFactory.decodeResource(getResources(),R.drawable.qw)));
        db.addContact(new Contact(2, "The Blind Banker", "Sherlock is hired by an old friend to investigate a mysterious break-in at a bank in the City. He discovers that symbols spray-painted onto an office wall are a coded message intended for an employee of the bank, who is later discovered dead in his flat. The next day, a journalist is killed and the same symbols are found nearby. Sherlock and John follow a trail of clues that link the two dead men to a Chinese smuggling ring, who are trying to retrieve a valuable item that one of the dead men stole. Sherlock eventually cracks the coded message based on Suzhou numerals and a book cipher, but not before John and Sarah (John's date) are kidnapped by the criminals, who believe that John is Sherlock. Sherlock rescues John and Sarah, but the leader of the gang escapes. Later, the leader of the gang is in communication with her superior, who is identified by the initial \"M\". She is then shot by a sniper.", "88 minutes",BitmapFactory.decodeResource(getResources(),R.drawable.qw)));
        db.addContact(new Contact(3, "The Great Game", "Sherlock is commissioned by Mycroft to investigate the suspicious death of a government employee, who was working on a top-secret defence project: the Bruce-Partington Project.[12] After rejecting the case and handing it over to John, Sherlock begins to be taunted by a criminal who puts his victims into explosive vests and sets Sherlock deadlines to solve the apparently unrelated cases, which include a twenty-year-old cold case involving the shoes of a drowned boy, the disappearance of a businessman, the death of a TV personality, and the assassination of a guard of an art gallery by the \"Golem\". As Sherlock solves the cases, he finds links between them. After clearing up the original case of the civil servant, Sherlock tries to force his unseen adversary to reveal himself. Near the end of the episode, Sherlock and \"Jim Moriarty\" reach a standoff, where Jim reveals that he is responsible for the crimes. In the final seconds, Sherlock Holmes points his gun at a bomb on the floor that had been strapped to John.", "89 minutes",BitmapFactory.decodeResource(getResources(),R.drawable.qw)));
        db.addContact(new Contact(4, "A Scandal In Belgravia", "Mycroft hires Sherlock and John to retrieve compromising photos of a minor royal, which are held on the camera phone of Irene Adler (Lara Pulver), a ruthless and brilliant dominatrix who also trades in classified information extracted from her rich and powerful clients. Sherlock obtains Adler's phone, but discovers it is booby-trapped and requires a code to disarm it. When Adler discovers that the CIA are on her trail, she disappears and is then apparently killed, only to reappear to ask John to get her camera phone back from Sherlock. Weeks later when the coast is clear, Adler tricks Sherlock into deciphering a coded message on her phone which she obtained from another well-connected client. She sends the message to Moriarty, who in turn uses it to foil a British counter-terror operation. She almost succeeds in blackmailing Mycroft, but Sherlock finally cracks the password for the phone, leaving Adler without the protection she needs to survive. The episode concludes as Mycroft tells John that she has been killed by a terrorist group in Pakistan.\n" +
                "\n", "89 minutes",BitmapFactory.decodeResource(getResources(),R.drawable.qw)));
        db.addContact(new Contact(5, "The Hounds Of Baskervile", "Sherlock and John are contacted by Henry Knight (Russell Tovey), a man traumatised by the death of his father by a monstrous hound on Dartmoor years before. Investigating Dewer's Hollow, a local spot where the beast was allegedly seen, as well as the nearby Ministry of Defence testing site Baskerville, Sherlock and John uncover a conspiracy wherein one of the Baskerville scientists, Dr. Frankland (Clive Mantle), is continuing the work of H.O.U.N.D., an aborted project to create a hallucinogenic gas for military use. Sherlock and John discover that the legendary hound is an ordinary dog used for publicity that the hallucinogenic gas makes appear as a demonic monster. The \"hound\" that killed Henry's father was actually Frankland wearing a red-lensed gas mask and a T-shirt bearing the logo of the H.O.U.N.D. group. Confronting both the dog and Frankland at Dewer's Hollow, John and Lestrade shoot the dog. Frankland attempts to flee, but dies when he runs into a minefield. In the final scene, Mycroft releases a confined Jim Moriarty.", "88 minutes",BitmapFactory.decodeResource(getResources(),R.drawable.qw)));
        db.addContact(new Contact(6, "The Reichenbach Fail", "Moriarty launches a simultaneous heist on the Tower of London, Bank of England and Pentonville Prison using just a few lines of code that can break any security; crimes for which he allows himself to be captured and put on trial. He secures a not-guilty verdict through intimidating the jury and visits Sherlock, explaining he still intends to \"burn\" him, taunting him with a \"final problem\" for him to solve. Soon afterwards, Moriarty arranges for the kidnapping of the children of an American ambassador, who are terrified of Sherlock once he has them rescued. This leads to Sherlock becoming a suspect. Sherlock escapes arrest, and soon learns Moriarty is using the alias of an actor who claims to have been hired by Sherlock, and has seeded the press with a story of Sherlock being a fraud. The two meet on the roof of a hospital, where Moriarty explains that assassins will kill John, Mrs. Hudson and Lestrade if Sherlock does not commit suicide; he wants Sherlock to do this to cement his story after explaining that his \"god code\" was a myth. After a tense conversation, in which Moriarty realises the two are enough alike that Sherlock would be willing to do anything to Moriarty to get him to call off the assassins, Moriarty kills himself to force Sherlock to do the same. Sherlock calls John and \"confesses\" to being a fraud (which John refuses to believe). John pleads for him to come down. Sherlock states his final \"Goodbye\" and then steps off the roof.", "88 minutes",BitmapFactory.decodeResource(getResources(),R.drawable.qw)));
        db.addContact(new Contact(7, "The Empty Hearse", "Two years after his reported Reichenbach Fall demise, Sherlock, who has been cleared of all fraud charges against him, returns with Mycroft's help to a London under threat of terrorist attack. He tries to convince John - who has moved on and now has a girlfriend, Mary Morstan (Amanda Abbington) - to help; however, John is angry that Sherlock didn't tell him he was alive. Instead, Sherlock enlists Molly to assist him, but when John is kidnapped by unknown assailants and is rescued by Sherlock and Mary, John returns to help find the terrorists and an underground plot to blow up the Houses of Parliament during an all night sitting on Guy Fawkes Night.\n" +
                "\n" +
                "Based on the short story \"The Adventure of the Empty House\",[16] with numerous references to other works by Sir Arthur Conan Doyle, and other adaptations of the original stories.", "86 minutes",BitmapFactory.decodeResource(getResources(),R.drawable.qw)));
        db.addContact(new Contact(8, "The Sign Of Three", "It is John and Mary's wedding day and Sherlock is daunted by the task of delivering a Best Man's speech. As part of the speech, he recounts cases they have worked on including a soldier being stalked and somehow stabbed in a locked shower, a ghost dating women he dubs \"The Mayfly Man\", the last being part of John's disastrous stag night, among others. Before his speech ends, he realises that a murderer is present among the guests intent on killing John's old friend, Major Sholto. Sherlock saves the targeted guest, and then informs John and Mary of the meaning of the sign of three; namely that Mary is pregnant.\n" +
                "\n" +
                "The title is based on the Holmes novel The Sign of the Four.", "86 minutes",BitmapFactory.decodeResource(getResources(),R.drawable.qw)));
        db.addContact(new Contact(9, "His Last Vow", "Stolen letters lead Sherlock into conflict with Charles Augustus Magnussen, \"the Napoleon of blackmail\" who knows the personal weakness of every person of importance in the Western world. During the investigation Sherlock is shot and nearly killed by Mary, who is being blackmailed by Magnussen. After waking up from near-death, Sherlock escapes the hospital and lures Mary to an abandoned building, where he tricks her into revealing her false identity and attempted murder while John is listening nearby. Months later, Sherlock drugs everyone at the Holmes family Christmas party, steals Mycroft's laptop full of state secrets, and he and John take the laptop to Magnussen to trade for all of the files on 'Mary Morstan'. It's revealed that Magnussen keeps no files; it's all in his near-perfect photographic memory. To protect John, Mary, and their forthcoming child, Holmes kills Magnussen in front of Mycroft and several other witnesses, and as a result is sent off on a suicidal assignment overseas. However, he is brought back almost immediately because of a video being broadcast all over London with Jim Moriarty's face asking \"Did you miss me?\"\n" +
                "\n" +
                "The title is based on Doyle's short story \"His Last Bow\", whereas the plot contains elements of two other short stories, \"The Adventure of Charles Augustus Milverton\" and \"The Man with the Twisted Lip\".", "89 minutes",BitmapFactory.decodeResource(getResources(),R.drawable.qw)));
        db.addContact(new Contact(10, "The Six Thatchers", "yet to be aired", "not known",BitmapFactory.decodeResource(getResources(),R.drawable.qw)));
        db.addContact(new Contact(11, "The Lying Detective", "yet to be aired", "not known",BitmapFactory.decodeResource(getResources(),R.drawable.qw)));
        db.addContact(new Contact(12, "The Final Problem", "yet to be aired", "not known",BitmapFactory.decodeResource(getResources(),R.drawable.qw)));




       b1=(Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i=new Intent(MainActivity.this,Seasons.class);
                startActivity(i);

            }
        });



    }
}
