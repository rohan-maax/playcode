const express= require("express");
const app= express();

let port= 8080;

app.listen(port,() =>{
    console.log(`app listen on ports ${port}`);
});

// app.use((req , res) => {
//     console.log("new incoming request");
// });


app.use((req, res) => {
    console.log("request recieved ");
    res.send("this is basic response")
})
// app.use((req, res) => {
//     console.log("request recieved ");
//     res.send("this is basic response")
// })
// app.use((req, res) => {
//     console.log("request recieved ");
//     res.send("this is basic response")
// })
// app.use((req, res) => {
//     console.log("request recieved ");
//     res.send("this is basic response")
// })