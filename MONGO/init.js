const mongoose = require("mongoose");
const chat = require("./models/chat.js");

main()
  .then(() => {
    console.log("connection successful");
  })
  .catch((err) => console.log(err));

async function main() {
  await mongoose.connect("mongodb://127.0.0.1:27017/whatapp");
}



let allchats = [
 {
    from : "neha",
    to : "akash",
    msg: " how are you",
    created_at: new Date(),
},
 {
    from : "ravi",
    to : "sushil",
    msg: " are you coming",
    created_at: new Date(),
},
 {
    from : "sakshi",
    to : "aanand",
    msg: " i am fine",
    created_at: new Date(),
},
 {
    from : "sujit",
    to : "rani",
    msg: " its ok for you ",
    created_at: new Date(),
},
 {
    from : "aryan",
    to : "sanjana",
    msg: " send me notes of history",
    created_at: new Date(),
},
 {
    from : "rohan",
    to : "shushdhansu",
    msg: " when are you comig back home",
    created_at: new Date(),
},
 {
    from : "nikhill",
    to : "anansu",
    msg: " have send this file ",
    created_at: new Date(),
},

];

chat.insertMany(allchats);

