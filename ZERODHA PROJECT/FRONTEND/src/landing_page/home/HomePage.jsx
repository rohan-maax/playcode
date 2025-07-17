import React from "react"; 
import Navbar from "../Navbar.jsx";
import Hero from "./Hero.jsx";
import Awards from "./Awards.jsx";
import Pricing from "./Pricing.jsx";
import Stats from "./stats.jsx";
import Education from "./Education.jsx";


import OpenAccount from "../OpenAccount.jsx";
import Footer from "../Footer.jsx";


function HomePage() {   
  return (   
   <>
  
    <Hero/>
    <Awards/>
    <Stats/>
    <Pricing/>
    <Education/>
    <OpenAccount/>
    

   </>   
  );   
}

export default HomePage;