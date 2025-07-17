import React from "react";  

function Hero() {
  return (  
    <div className="container p-5" >
        <div className="row text-center">
        <img src="IMAGES\homeHero.png" alt="homeHero" className="mb-5" />
         
         <h1 className="mt-5">Invest in everything</h1>
            <p >Online platform to invest in stocks, derivatives, mutual funds, and more</p>
            <button className="btn btn-primary p-2"style= {{ width:"20%", margin: "0 auto"}}>Sign up now</button>
            </div>
    </div> 
  );  
}
export default Hero;