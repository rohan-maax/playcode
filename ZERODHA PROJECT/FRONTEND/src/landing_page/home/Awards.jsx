import React from "react";

function Awards() {
  return (
    <div className="container mt-5">
      <div className="row">
        <div className="col-md-6 p-5" >
          <img src="IMAGES\largestBroker.svg" alt="largestBroker" />
        </div>
        <div className="col-md-6 p-5 mt-2">
          <h1>Largest stock broker in India</h1>
          <p className="mb-5">
            2+ million Zerodha clients contribute to over 15% of all retail
            order volumes in India daily by trading and investing in:
          </p>
          <div className="row">
            <div className="col-md-6">
              <ul>
                <li> <p className="text-muted"> Futures an Options</p></li>
                <li> <p className="text-muted"> Commodity derivatives</p></li>
                <li> <p className="text-muted"> Currency derivatives</p></li>
              </ul>
            </div>
            <div className="col-md-6">
              <ul>
                <li><p className="text-muted"> Futures an Options</p> </li>
                <li> <p className="text-muted"> Currency derivatives</p></li>
                <li><p  className="text-muted"> Commodity derivatives</p> </li>
               
              </ul>
            </div>
          </div>
          <img src="IMAGES\pressLogos.png" alt="presslogos" className="mt-2" style={{width:"90%"}}/>
        </div>
      </div>
    </div>
  );
}

export default Awards;
