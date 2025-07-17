import React from "react";

function Universe() {
  return (
    <div className="container mt-5">
      <div className="row text-center">
        <h1>The Zerodha Universe</h1>
        <p>
          Extend your trading and investment experience even further with our
          partner platforms
        </p>

        <div className="col-4 p-3 mt-5">
          <img src="IMAGES/streakLogo.png" style={{width:"50%"}}/>
          <p className="text-small text-muted">Thematic investment platform</p>
        </div>
        <div className="col-4 p-3 mt-5">
          <img src="IMAGES/sensibullLogo.svg" />
          <p className="text-small text-muted">Alge Strategy platform</p>
        </div>
        <div className="col-4 p-3 mt-5">
          <img src="IMAGES/zerodhaFundhouse.png"  style={{width:"50%"}}/>
          <p className="text-small text-muted">Options trading plallnrrn</p>
        </div>
        <div className="col-4 p-3 mt-5">
          <img src="IMAGES/goldenpiLogo.png" />
          <p className="text-small text-muted">Asset mansaement</p>
        </div>
        <div className="col-4 p-3 mt-5">
          <img src="IMAGES/dittoLogo.png" style={{width:"50%"}} />
          <p className="text-small text-muted">platforn</p>
        </div>
        <div className="col-4 p-3 mt-5">
          <img src="IMAGES/smallcaseLogo.png" />
          <p className="text-small text-muted">Insurance</p>
        </div>
        <br></br>
        <button
          className="p-2 btn btn-primary fs-5 mb-5 mt-5 "
          style={{ width: "20%", margin: "0 auto" }}
        >
          Signup Now
        </button >
      </div>
    </div>
  );
}

export default Universe;