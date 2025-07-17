import React from "react";

function Team() {
  return (
    <div className="container ">
      <div className="row text-center mt-5 p-5">
        <h1>People</h1>
      </div>
      <div className="row ">
        <div className="col-6 text-center">
          <img
            className="img-fluid"
            src="IMAGES/nithinKamath.jpg"
            alt="team"
            style={{ width: "50%", borderRadius:"100%"} }
          />
          <h3>Nitin Kamath</h3>
          <p>Founder</p>
        </div>
        <div className="col-6 text-muted fs-5">
          <p>
            Nithin bootstrapped and founded Zerodha in 2010 to overcome the
            hurdles he faced during his decade long stint as a trader. Today,
            Zerodha has changed the landscape of the Indian broking industry.
          </p>
          <p>
            He is a member of the SEBI Secondary Market Advisory Committee
            (SMAC) and the Market Data Advisory Committee (MDAC)-
          </p>
          <p>Playing basketball is his Zen.</p>
          <p>
            Connect on{" "}
            <a href="" style={{ textDecoration: "none" }}>
              Homepage /
            </a>{" "}
            <a href="" style={{ textDecoration: "none" }}>
              TradingQnA /
            </a>{" "}
         
            <a href="" style={{ textDecoration: "none" }}>
              Twitter
            </a>
          </p>
        </div>
      </div>
    </div>
  );
}

export default Team;
