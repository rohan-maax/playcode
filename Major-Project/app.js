const express = require("express");
const app = express();
const mongoose= require("mongoose");
const Listing= require("../models/listing.js");

const MONGO_URL="mongodb://127.0.0.1:27017/wonderlust";

main() 
.then(() => {
    console.log("connected to DB ");

}).catch((err) => {
    console.log(err);
});

async function main() {
    await mongoose.connect(MONGO_URL);
}
  

app.get("/", (req, res) => {
    res.send("hi , iam root ");
});


app.get("/testlListing" ,  async (req,res) => {
    let sampleListing = new Listing ({
        title : "my new villa ",
        description : "by the beach",
        price : 1200,
        location: "calangute , goa",
        country : "india",
    });

    await sampleListing.save();
    console.log("sample was saved ");
    res.send ( "succesful testing ");
});

app.listen(8080, () => {
    console.log(" server is listening on port 8080 ")
});