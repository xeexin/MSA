import { useNavigate, useParams } from "react-router-dom";
import styled from "styled-components";
// import styled from "styled-components";

function Detail(props) {
  let Box = styled.div`
    padding: 20px;
    color: grey;
  `;

  let ColorBtn = styled.button`
    background: ${(props) => props.bg}
    color: ${(props) => (props.bg == `black` ? `white` : props.color)};
    padding: 10px;
  `;

  let YellowBtn = styled(ColorBtn)`
    background: pink;
  `;

  // let YellowBtn = styled.button`
  //   background: yellow;
  //   color: blue;
  //   padding: 10px;
  // `;

  let { id } = useParams(); // HOOK
  let navigate = useNavigate();
  let findId = props.books.find((item) => item.id == id);

  return (
    <div className="container my-5">
      {/* <YellowBtn>BUTTON;</YellowBtn> */}

      <Box>사용자가 만든 태그</Box>
      <YellowBtn>사용자가 만든 태그</YellowBtn>
      <ColorBtn>사용자가 만든 태그</ColorBtn>
      <Box>사용자가 만든 태그</Box>
      <ColorBtn>사용자가 만든 태그</ColorBtn>
      <ColorBtn>사용자가 만든 태그</ColorBtn>
      <YellowBtn>사용자가 만든 태그</YellowBtn>

      <div className="row align-items-center">
        {/* 이미지 영역 */}
        <div className="col-md-6 text-center">
          <img
            src={findId.imageUrl}
            alt={findId.title}
            className="img-fluid rounded shadow-sm"
            style={{ maxHeight: "400px", objectFit: "cover" }}
          />
        </div>

        {/* 정보 영역 */}
        <div className="col-md-6 mt-4 mt-md-0">
          <h2 className="mb-3">{findId.title}</h2>
          <p className="text-muted mb-2">작가: {findId.author}</p>
          <p className="lead text-danger font-weight-bold">
            {findId.price.toLocaleString()}원
          </p>

          <div className="d-flex flex-wrap gap-2 mt-4">
            <button
              onClick={() => navigate("/cart")}
              className="btn btn-danger"
            >
              🛒 주문하기
            </button>
            <button onClick={() => navigate(-1)} className="btn btn-secondary">
              🔙 뒤로가기
            </button>
            <button onClick={() => navigate("/")} className="btn btn-success">
              🏠 홈
            </button>
            <button
              onClick={() => navigate("/cart")}
              className="btn btn-warning"
            >
              📦 장바구니
            </button>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Detail;
