const form = document.getElementById("form");

const fullName = document.getElementById("fullName");
const password = document.getElementById("password");
const mobileNo = document.getElementById("mobileNo");
const emailId = document.getElementById("emailId");

const radios = document.getElementsByName("gender");
const checkboxes = document.getElementsByName("hobbies");

const skills = document.getElementById("skills");
const submit = document.getElementById("submit");
const error = document.getElementById("error");

// Fat arrow function
// (e) => {}

form.addEventListener("submit", (e) => {
  // var, let, const

  let errorMessages = [];

  if (fullName.value === "" || password.value === "" ||mobileNo.value === "" ||emailId.value === ""
  ) {

    console.log("1. errorMesages : " + errorMessages.length);
    errorMessages.push("All fields are compulsory");
    console.log("2. errorMesages : " + errorMessages.length);
  }

  if (password.value.length < 6 || password.value.length > 10) {
    errorMessages.push("Password must be 6-10 characters long");
  }

  console.log("3. " + radios[0].checked);
  if (!(radios[0].checked || radios[1].checked) || radios[2].checked) {
    errorMessages.push("Please select a radio button");
  }

  console.log("4. " + checkboxes[0].checked);
  if (
    !(checkboxes[0].checked || checkboxes[1].checked) ||
    checkboxes[2].checked
  ) {
    errorMessages.push("Please select a check box");
  }

  console.log(skills.value);
  if (skills.value === "-1") {
    errorMessages.push("Please select a course");
  }

  if (validateEmailId(emailId) == true) {
    errorMessages.push("Wrong emailId format");
  }

  if (validatePhoneNumber(mobileNo) == true) {
    errorMessages.push("Wrong mobile no format");
  }

  if (errorMessages.length > 0) {

    error.innerText = errorMessages.join("\n");

    // The preventDefault() method cancels the event if it is cancelable, 
    // meaning that the default action that belongs to the event will not occur.
    // Clicking on a "Submit" button, prevent it from submitting a form
    e.preventDefault();
  }

  // console.log("Add Event Listener has ended");

});

// The match() method searches a string for a match against a regular expression, 
// and returns the matches, as an Array object.
// match() returns null if no match is found.

function validatePhoneNumber(mobileNo) {
  // Regex: 10 digits with no comma, spaces, punctuation and no + sign
  var phoneno = /^\d{10}$/; // Regex : Regular Expression

  if (mobileNo.value.match(phoneno) == null) {
    return true;
  } else {
    return false;
  }
}

function validateEmailId(emailId) {
  var emailFormat =
    /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;

  if (emailId.value.match(emailFormat) == null) {
    return true;
  } else {
    return false;
  }
}
