export default function Controller({ onChangeCount }) {
  return (
    <div>
      <button
        onClick={() => {
          onChangeCount(-1);
        }}
      >
        -1
      </button>
      <button
        onClick={() => {
          onChangeCount(-10);
        }}
      >
        -10
      </button>
      <button
        onClick={() => {
          onChangeCount(-100);
        }}
      >
        -100
      </button>
      <button
        onClick={() => {
          onChangeCount(100);
        }}
      >
        +100
      </button>
      <button
        onClick={() => {
          onChangeCount(10);
        }}
      >
        +10
      </button>
      <button
        onClick={() => {
          onChangeCount(1);
        }}
      >
        +1
      </button>
    </div>
  );
}
