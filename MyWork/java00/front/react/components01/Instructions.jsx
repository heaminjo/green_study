//조리과정정
const Instructions = ({ name, steps }) => {
  <section className="instructions">
    <h3>{name}조리방법</h3>
    {steps.map((step, i) => (
      <p key={i}>{i + 1 + ". " + step}</p>
    ))}
  </section>;
};
export default Instructions;
