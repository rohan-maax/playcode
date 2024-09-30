const mongoose = require('mongoose');
main()
.then(() => {
    console.log("connection successful");
})
.catch((err) => console.log(err));

async function main() {
    await mongoose.connect('mongodb://127.0.0.1:27017/test');
}

const bookSchema= new mongoose.Schema({
    title : { 
        type : String,
        required: true,
    },

    Auther : {
        type : String,
    },

    Price :{
        type : Number,
    },
});

const book = mongoose.model("book", bookSchema);

let book1 = new book ({
    title : "mathmatics",
    Auther : "rd sharma",
    Price : 789,
});
book1.save()
.then(res => {
    console.log(res);

})
.catch ( (err) => {
    console.log(err);
});