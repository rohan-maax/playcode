const mongoose = require('mongoose');
main()
.then(() => {
    console.log("connection successful");
})
.catch((err) => console.log(err));

async function main() {
    await mongoose.connect('mongodb://127.0.0.1:27017/test');
}

const userschema=new mongoose.Schema({
    name: String,
    email: String,
    age: Number,
});


const user = mongoose.model("user", userschema);
// const Employee = mongoose.model("Employee", userschema);

// const user1= new user({
//     name:"adam",
//     email: "adam@gmail.com",
//     age: 49,

// });

// user1.save();


// const user2= new user({
//     name:"rohan",
//     email: "rohan@gmail.com",
//     age: 20,
// });

// user2.save().then((res) =>{
//     console.log(res);
// }).catch((user) => {
//     console.log(err);
// });


// const user1= user.insertMany([
//     {
//         name:"rsm",
//         email: "ardm@gmail.com",
//         age: 49,
    
//     },
//     {
//         name:"alok",
//         email: "adlok@gmail.com",
//         age: 49,
    
//     },
//     {
//         name:"apre",
//         email: "apre@gmail.com",
//         age: 49,
    
//     },
// ]).then((res) =>{
//     console.log(res);
// }).catch((user) => {
//     console.log(err);
// });
    
   

// user.find()
// .then((data) =>{
//     console.log(data);

// });

// using with some conditinon

// user.find( { age: { $gte : 47}})
// .then((data) =>{
//     console.log(data);

// });

// using with some conditinon and some specific value

// user.find( { age: { $gte : 47}})
// .then((data) =>{
//     console.log(data);

// }).catch((err) =>{
//     console.log(err);

// });


// using with findOne 

// user.findOne( { age: { $gte : 47}})
// .then((data) =>{
//     console.log(data);

// }).catch((err) =>{
//     console.log(err);

// });
// using with findwith id

// user.findById("66f0ef6f46b61da858f41982" )
// .then((data) =>{
//     console.log(data);

// }).catch((err) =>{
//     console.log(err);

// });


// using with update one

// user.updateOne({ name:"apre"}, {age:56})
// .then((res) => {
//     console.log(res);

// })
// .catch((err) =>{
//     console.log(err);
// })

// using with update many 

// user.updateMany({age :{ $gt : 48}}, {age : 88})
// .then((res) => {
//     console.log(res);
// })
// .catch((err) => {
//     console.log(err);
// }) 
// using with findOneandupdate 

user.findOneAndUpdate({name: "rohan"}, {age : 66}, {new: true})
.then((res) => {
    console.log(res);
})
.catch((err) => {
    console.log(err);
}) 