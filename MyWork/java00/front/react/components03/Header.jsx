const Header = ({ color, style, price, size }) => {
  // const { color, style, price, size } = bestDress;
  return (
    <>
      <div id="container">
        <h1>Header</h1>
        <p>
          {color}
          {style}
          {price}
        </p>
        <p>size는 {size.length} 종류</p>
      </div>
    </>
  );
};
export default Header;
