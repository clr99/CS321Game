
package pkg321_project;

public class Storyline {
    B_Tree tree = new B_Tree();
    String a="Your eyes open. And you wake up in a cold sweat. Something has changed from yesterday to today. And there is an unsettling feeling that sweeps across from you. \n" +
"\n" +
">> A You jolt up, check your phone. Some nervous habits never die.\n" +
"\n" +
">> B You shake off the bad feeling. Stay in bed. Maybe your mood can improve.";
     
   String b1="There's a ping. Wait… no there's several. Apparently, everyone has been calling you. You see calls from your mom, your dad, even your ex, checking in, worrying about you.\n" +
"\n" +
"No… worrying about everything. Apparently, the whole world is falling apart. \n" +
"\n" +
"\n" +
">> A Grab your coat. Lace your shoes. Figure out what the @#*! is going on. \n" +
"\n" +
">> B Spend a moment. Use your diligence and persistence to figure out exactly what you're up against.";
    String b2="You don't wake up again. You're here for the big sleep.\n" +
"\n" +
"You have died.";
    String c1="You slam the door behind you. You look around. You're surprised the screams didn't wake you up sooner. Everyone is running, better yet, fleeing. You hear an old man cry. Your neighbor, dear old Mr. Jenkins, starts levitating. A beam of light pulls him up and into a dark cloud. He disappears. \n" +
"\n" +
"Okay, things are getting real. \n" +
"\n" +
">> A You gotta get going, dude. Those high school years of track didn't mean nothing. You start running a full marathon down the block. Creepy beam of light? No thanks.\n" +
"\n" +
">> B Something jangles in your pocket. Dear God! It's the keys to your 1998 Volvo. You have parked a little ways down the street, and as you say a little prayer for dear old Jenkins, you hop in the car, you kiss the little rubber duck you have taped to your dash, and you speed away. Good riddens.    ";
    String c2="Breathe in, breathe out. You feel your phone vibrating. It's your best friend from college calling, Rocco. You answer it to hear him exasperated on the other side. \"You... you're alive?\", he pants, \"I thought you were a goner for sure.\"\n" +
"\n" +
"You: I don't have time for this... what's going on?\n" +
"\n" +
"Rocco: You don't know? We are being invaded. Like real-life extraterrestrials. Dude, you need to get here quick. Everyone is heading to the media room of OKT. It's the only place with a signal. \n" +
"\n" +
"\n" +
"Your response:  \n" +
"\n" +
">> A \"Be there in 10. God, I'll be glad to see your dumb face again.\"\n" +
"\n" +
">> B \"I'll be there as soon as I can... I just need to find something first...\"";
    String d1="Okay, maybe it has been a while. The beam of light starts to catch on your shoes. It spreads. You feel your whole body grow light. Lighter than a feather. And you see the street below you. It almost feels peaceful. The little houses, and little ants scurrying about. \n" +
"\n" +
"Uh wait. The light is flickering. And, oh, it's over this time. The light goes out. You start hurling down to the earth. Your body makes a little splat when you finally touch down.\n" +
"\n" +
"You have died.";
    String d2="You start accelerating down the street, carefully to avoid any of the mayhem and people scattered about. You turn from the local road and are prompted with a choice. Do you carry on straight and head to the main highway, or do you turn left and head to a little known detour?\n" +
"\n" +
">> A Take the highway. Sometimes faster is better.\n" +
">> B Take the detour. Gives you a little more time to think.";
    String d3="You pull up to the UAH campus. You've never gotten a parking spot as good as the one you've got today. Funny how those things work out. You see a person off into the distance. He seems familiar. \n" +
"\n" +
">> A Oh, look it's your dear friend Rocco. You head to him, open arms.\n" +
" \n" +
">> B You tilt your head to the side. Can't be too sure of everything today. You call him from your phone instead.";
    String d4="You disconnect. You look around the room, and before you have time to think, you hear the sound of a motor and the squealing of tires. The neighbor's Ford comes crashing through your living room windows and takes you out. \n" +
"\n" +
"You have died.";
    String e1="To be continued.";
    String e2="You take the left. It has always given you a little comfort to take the road less traveled. However, you pull up to the entrance, and the forest that surrounds the detour is set ablaze. Dumbfounded, you step out of your car, and from the forest, a strange creature emerges engulfed in the flames. He heads your way deliberately, and through his eyes, shoots lasers at you. Your last moment in the world, and all you remember is smelling burnt hair, the worst smell in the world. \n" +
"\n" +
"You have died.";
    String e3="You head to him. Ready for the full embrace. He waves you over and smiles. Steadily you pick up speed. You realize you don't remember Rocco ever having that kind of limp before. Nonetheless, you run up to him, and right before the hug, you change your mind. You take a step back. There's no twinkle in his eye. That's not right. Rocco keeps smiling, unnervingly, and starts opening his mouth larger where you see an extra row of teeth. His tongue unfurls, and he wraps it around you. Squeezing tighter. His jaw unhinges, and you are swallowed in one gulp.\n" +
"\n" +
"You have died.";
    String e4="With the phone to your ear, you hear the ringing, and the anxiety starts to build. Instead of an answer, you see a side door swing open, and a hand starts motioning you into it. Without batting an eye, you rush in. Rocco and your friends are there huddled watching the television. I guess your eyes were playing tricks on you. You barricade the doors, and you all hunker down for the next couple of weeks. Maybe the aliens won't last that long.\n" +
"\n" +
"The game has ended. You are waiting for rescue.";
    
    Storyline() {
        //below we are instantiating our binary tree
        tree.current= new Node(1, a); 
        tree.current.left= new Node(2, b1);
        tree.current.right= new Node(3, b2);
        tree.current.left.left= new Node(4, c1);
        tree.current.left.right= new Node(5, c2);
        tree.current.left.left.left= new Node(6, d1);
        tree.current.left.left.right= new Node(7, d2);
        tree.current.left.right.left= new Node(8, d3);
        tree.current.left.right.right= new Node(9, d4);
        tree.current.left.left.right.left= new Node(10, e1);
        tree.current.left.left.right.right= new Node(11, e2);
        tree.current.left.right.left.left= new Node(12, e3);
        tree.current.left.right.left.right= new Node(13, e4);

    }
  
}
