

let inp = document.querySelector("input");
let btn = document.querySelector("button");
let ul = document.querySelector("ul");
let print= document.querySelector("h4");
let template = document.getElementById("li-template");

btn.addEventListener("click", function () {
  if (inp.value == "") {
    console.log("write something to add task");
  } else {
    let clone = template.content.cloneNode(true);
    clone.querySelector(".task-text").innerText = inp.value;

    let checkbox = clone.querySelector(".checkbox");
    let taskText = clone.querySelector(".task-text");
    let editIcon = clone.querySelector(".edit-div");
    let deleteIcon = clone.querySelector(".dlt-div");
    let list = clone.querySelector("li");
    print.style.visibilty="visible";


    checkbox.addEventListener("change", function () {
      if (checkbox.checked) {
        taskText.style.textDecoration = "line-through";
        taskText.style.color = "gray";
        editIcon.style.pointerEvents = "none";
        deleteIcon.style.pointerEvents = "none";
        taskText.contentEditable = false;
        list.style.opacity = 0.5;
      } else {
        taskText.style.textDecoration = "none";
        taskText.style.color = "black";
        editIcon.style.pointerEvents = "auto";
        deleteIcon.style.pointerEvents = "auto";
        taskText.contentEditable = true;
        list.style.opacity = 1;
      }
    });

    deleteIcon.addEventListener("click", function () {
      list.remove();
    });
    editIcon.addEventListener("click", function () {
      let newTask = prompt("Edit your task:", taskText.innerText);
      if (newTask !== null && newTask.trim() !== "") {
        taskText.innerText = newTask.trim();
      }
    });

    ul.appendChild(clone);
    inp.value = "";
  }
});
