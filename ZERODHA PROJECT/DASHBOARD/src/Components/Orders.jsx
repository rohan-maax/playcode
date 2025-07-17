import React from "react";
import { Link } from "react-router-dom";
import "../App.css";
import { useState, useEffect } from "react";
import axios from "axios";

// import GradientBar from "./GradientBar.jsx";


const Orders = () => {
  const [allOrders, setallOrders] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:3002/allOrders").then((res) => {
      // console.log(res.data);
      setallOrders(res.data);
    });
  }, []);

  

  return (
    <div className="orders">
      <div className="orders">
        <h3 className="title">Orders ({allOrders.length})</h3>

        <div className="order-table">
          <table className="order-table">
            <tr>
              <th>name</th>
              <th>Qty.</th>
              <th>price</th>
              <th>mode</th>
            </tr>

            {allOrders.map((stock, index) => {
              

              return (
                <tr key={index}>
                  <td>{stock.name}</td>
                  <td>{stock.qty}</td>

                  <td>{stock.price.toFixed(2)}</td>

                  <td>{stock.mode}</td>
                </tr>
              );
            })}
          </table>
        </div>

      
     
      </div>
    </div>
  );
};

export default Orders;
