import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import './App.css';
import Todos from './modernreact/router/Todos';



const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Todos/>
  </React.StrictMode>
);


