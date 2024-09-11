// const image_input = document.querySelector("#image_input");
// var uploaded_image = "";
//
// image_input.addEventListener("change", function(){
// //  console.log(image_input.value);
//     const reader = new FileReader();
//     reader.addEventListener("load", () => {
//         uploaded_image = reader.result;
//         document.querySelector("#display_image").style.backgroundImage = `url(${uploaded_image})`;
//     });
//     reader.readAsDataURL(this.files[0])
// })

const video = document.getElementById('video');
const captureButton = document.getElementById('capture');
const displayImage = document.getElementById('display_image');

navigator.mediaDevices.getUserMedia({ video: true })
    .then(stream => {
        video.srcObject = stream;
        video.play();
    })
    .catch(err => {
        console.error('카메라 접근 실패:', err);
    });

captureButton.addEventListener('click', () => {
    const canvas = document.createElement('canvas');
    canvas.width = video.videoWidth;
    canvas.height = video.videoHeight;
    const ctx = canvas.getContext('2d');
    ctx.drawImage(video, 0, 0, canvas.width, canvas.height);

    const img = document.createElement('img');
    img.src = canvas.toDataURL('image/png');

    displayImage.innerHTML = ''; // 기존 이미지 삭제
    displayImage.appendChild(img);
});

//  아직 test 안했음
// // "분석하기" 버튼 클릭 시 이미지 전송
// uploadForm.addEventListener('submit', (event) => {
//     event.preventDefault();  // 폼의 기본 제출 동작 방지
//
//     if (imageBlob) {
//         const formData = new FormData();
//         formData.append('file', imageBlob, 'image.png');
//
//         fetch('http://127.0.0.1:5000/analyze', {
//             method: 'POST',
//             body: formData
//         })
//             .then(response => response.json())
//             .then(data => {
//                 console.log('서버 응답:', data);
//                 alert('분석 완료: ' + JSON.stringify(data));
//             })
//             .catch(error => {
//                 console.error('파일 전송 실패:', error);
//             });
//     } else {
//         alert('사진을 먼저 찍어주세요.');
//     }
// });