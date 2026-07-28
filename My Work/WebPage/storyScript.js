const showBtn = document.getElementById('toClick');
const content = document.getElementById('content');

  showBtn.addEventListener('click', function() {
    if (content.style.display === 'none') {
      content.style.display = 'block';
    } else {
      content.style.display = 'none';
    }
  });