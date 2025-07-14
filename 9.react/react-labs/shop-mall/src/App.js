/* eslint-disable */
import { Navbar, Container, Nav, NavDropdown, Button } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";
import bg from "./images/bg.jpg";
import Data from "./data";
import { useState } from "react";

import { Link, Route, Routes, Outlet } from "react-router-dom";
import Detail from "./components/detail";

function App() {
  let [books, setBooks] = useState(Data);

  return (
    <div className="App">
      <Navbar expand="lg" className="bg-body-tertiary">
        <Container>
          <Navbar.Brand href="/">Heejin의 책방</Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link as={Link} to="/">
                Home
              </Nav.Link>
              <Nav.Link as={Link} to="/detail/0">
                Detail
              </Nav.Link>
              <Nav.Link as={Link} to="/cart">
                Cart
              </Nav.Link>
              <NavDropdown title="정책" id="basic-nav-dropdown">
                <NavDropdown.Item href="/about/emp">About</NavDropdown.Item>
                <NavDropdown.Item href="/about/location">
                  Location
                </NavDropdown.Item>
                <NavDropdown.Item href="#action/3.3">분실</NavDropdown.Item>
                <NavDropdown.Divider />
                <NavDropdown.Item href="/about/location">
                  찾아오는길
                </NavDropdown.Item>
              </NavDropdown>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>

      <div className="jumbotron">
        <img
          src={bg}
          width={"70%"}
          height={"5%"}
          alt="바다"
          className="banner-img"
        />
        <h1 className="display-4">여름 책방</h1>
        <p className="lead">2025년 여름에 어울리는 책을 추천해줄게요.</p>
        <p>I will recommend a book that suits the summer of 2025.</p>
        <p>
          <Button variant="success">20% DC</Button>
          <br />
        </p>
      </div>

      <Routes>
        <Route
          path="/"
          element={
            <div className="container">
              <div className="row">
                {books.map((item, i) => (
                  <Card item={item} key={i} />
                ))}
              </div>
            </div>
          }
        ></Route>

        <Route path="*" element={<h3>없는 페이지 입니다.</h3>} />

        <Route path="/detail/:id" element={<Detail books={books} />} />

        <Route path="/about" element={<About />}>
          <Route path="emp" element={<div>너는 우리 직원이야</div>} />
          <Route path="location" element={<div>혜화로 111</div>} />
        </Route>

        <Route path="/event" element={<Event />}>
          <Route path="sale" element={<h5>오늘 하루 11% 할인</h5>} />
          <Route path="sale2" element={<h5>두권 이상 구매시 30% 할인</h5>} />
        </Route>
      </Routes>
    </div>
  );
}

function About() {
  return (
    <>
      <h1>About Page</h1>
      <Outlet></Outlet>
    </>
  );
}

function Event() {
  return (
    <>
      <h4>오늘의 이벤트!</h4>
      <Outlet></Outlet>
    </>
  );
}

// function Card(books, i)
function Card(props) {
  return (
    <div className="col-md-4">
      <Link
        to={`/detail/${props.item.id}`}
        style={{ textDecoration: "none", color: "black" }}
      >
        <img
          src={props.item.imageUrl}
          alt={props.item.title}
          className="img-fluid"
          style={{ maxHeight: "400px" }}
        />
        <h4>{props.item.title}</h4>
        <p>{props.item.author}</p>
        <p>{props.item.price}원</p>
      </Link>
    </div>
  );
}

export default App;
