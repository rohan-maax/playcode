// creating object literal---->>>>

const student = {
  name: "rohan",
  age: 20,
  city: "varanasi",
};

//creating nested object literals----->>>

const classInfo = {
  aman: {
    grade: "A",
    city: "varanasi",
  },

  anshu: {
    grade: "A",
    city: "delhi",
  },

  shudhanshu: {
    grade: "A",
    city: "mumbai",
  },
};

//creating array of object literals----->>>

const classInfo2 = [
  {
    name: "aman",
    grade: "A",
    city: "varanasi",
  },

  {
    name: "anshu",
    grade: "A",
    city: "delhi",
  },

  {
    name: "shudhanshu",
    grade: "A",
    city: "mumbai",
  },
];

// getting value of object literals ---->>>

// First method

console.log(student["name"]);

//second method

console.log(student.age);


// update  value in  object literal  ---->>>>>


student.name="rohanyadav";

// add new value in  object literal  ---->>>>>

student.grade="B";

// delete value in  object literal  ---->>>>>

delete student.city;





