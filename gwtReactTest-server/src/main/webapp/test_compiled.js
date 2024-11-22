import { ReactDOM } from 'react-dom';
function Person2(personData) {
  return /*#__PURE__*/React.createElement("li", null, "$", personData.getId(), " $", personData.getForename(), " $", personData.getSurname());
}
function Persons2(personsList) {
  const personData = personsList[0];
  return /*#__PURE__*/React.createElement("ul", null, /*#__PURE__*/React.createElement(Person2, {
    personData: true
  }));
}
function test2() {
  // Get data via JsInterop
  const personData2 = net.spiffymap.Utils2.getExampleArray();
  const root = ReactDOM.createRoot(document.getElementById("jsx_container"));
  root.render(/*#__PURE__*/React.createElement(Persons2, {
    personData2: true
  }));
}

