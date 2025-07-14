/* eslint-disable */
import { Navbar, Container, Nav, NavDropdown, Button } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";
import bg from "./images/bg.jpg";
import Data from "./data";
import { useState } from "react";

function App() {
  let [books, setBoocks] = useState(Data);

  return (
    <div className="App">
      <Navbar expand="lg" className="bg-body-tertiary">
        <Container>
          <Navbar.Brand href="#home">Heejin의 책방</Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link href="#home">Home</Nav.Link>
              <Nav.Link href="#link">Cart</Nav.Link>
              <NavDropdown title="정책" id="basic-nav-dropdown">
                <NavDropdown.Item href="#action/3.1">환불</NavDropdown.Item>
                <NavDropdown.Item href="#action/3.2">반품</NavDropdown.Item>
                <NavDropdown.Item href="#action/3.3">분실</NavDropdown.Item>
                <NavDropdown.Divider />
                <NavDropdown.Item href="#action/3.4">
                  찾아오는길
                </NavDropdown.Item>
              </NavDropdown>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>

      <div class="jumbotron">
        <img
          src={bg}
          width={"70%"}
          height={"5%"}
          alt="바다"
          className="banner-img"
        />
        <h1 class="display-4">여름 책방</h1>
        <p class="lead">2025년 여름에 어울리는 책을 추천해줄게요.</p>
        <p>I will recommend a book that suits the summer of 2025.</p>
        <p>
          <Button variant="success">20% DC</Button>
          <br />
        </p>
      </div>
      <div className="container">
        <div className="row">
          {books.map((item, i) => (
            <Card item={item} key={i} />
          ))}
        </div>
      </div>
    </div>
  );
}
function Card(props) {
  return (
    <div className="col-md-4">
      <img
        src={props.item.imageUrl}
        alt={props.item.title}
        className="img-fluid"
        style={{ maxHeight: "500px" }}
      />
      <h4>{props.item.title}</h4>
      <p>{props.item.author}</p>
      <p>{props.item.price}원</p>
    </div>
  );
}

export default App;
