function Person2(personData) {
    console.log(Object.keys(personData));
    var id = personData.getId();
    return <li>${id}</li>;
}

function Persons2(personsList) {
    const personData = personsList[0];
    return <ul><Person2 personData /></ul>;
}

function test2() {
    // Get data via JsInterop
    const personData2 = net.spiffymap.Utils2.getExampleArray();
    console.log("" + personData2);
    const container = document.getElementById("jsx_container");
    ReactDOM.render(Persons2(personData2), container);
}
