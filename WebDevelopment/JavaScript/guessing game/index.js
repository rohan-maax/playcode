const max = prompt( "enter the maximum number of guessing game ");

const random= Math.floor(Math.random()*max)+1;

let guess= prompt(" guess the number");

while(true){
    if(guess=="quit"){
        console.log("user quit the game ");
        break;
     }
     if(guess==random){

        console.log("you are right ! congrats !!  Random number was ", random);
        break;
     }
     else if(guess<random) {
        guess=prompt(" Hint : your guess was too small ... please try again !!");

     }
     else{
        guess=prompt(" Hint : your guess was too large ... please try again !!" )
     }

}