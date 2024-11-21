import React from 'react';
import { createRoot } from 'react-dom/client';

const myElement = <h1>I Love JSX!</h1>;
const root = ReactDOM.createRoot(document.getElementById("react_holder"));
root.render(myElement);


