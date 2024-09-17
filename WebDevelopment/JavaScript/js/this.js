// creating object literal---->>>>

const student = [{
  eng: 55,
  math: 20,
  hindi: 50,

  //creating a method

  getAvg() {
    let avg = (this.eng + this.math + this.hindi) / 3;
  },
} 
];

// implement of try & catch statement

console.log("hello");
console.log("hello");

try {
  console.log(a);
} catch (err) {
  console.log("caught a error");
  console.log(err);
}

console.log("hello");
console.log("hello");

//implement of arrow function ----->>

// passing 2 argument

const sum = (a, b) => {
  return a + b;
};

// pasing 1 argument

const cube = (a) => {
  return a ** a;
};

//passing without aargument

const hello = () => {
  console.log("heloo rohan ");
};

console.log(sum(2, 5), cube(4));
hello();
