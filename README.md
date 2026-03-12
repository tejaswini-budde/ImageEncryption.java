Image Encryption Using Java

📌 Project Description

This project demonstrates a simple Image Encryption technique using Java.
The program reads an input image and encrypts it by modifying the RGB values of each pixel using a key value.

The encrypted image is then saved as a new file.

---

⚙️ How the Program Works

1. The program loads an image file ("input.png").
2. It reads the width and height of the image.
3. Each pixel's RGB (Red, Green, Blue) values are extracted.
4. A key value is added to the RGB values.
5. The new encrypted pixel values are stored in the image.
6. The encrypted image is saved as "encrypted.png".

---

🛠 Technologies Used

- Java
- BufferedImage
- ImageIO
- File Handling

---

📂 Files Used

- ImageEncryption.java
- input.png (original image)
- encrypted.png (generated encrypted image)

---


💻 Example Output

Console Output

Image encrypted successfully!

File Output

After running the program, a new file will be created:

encrypted.png

This file contains the encrypted version of the original image.

---

💡 Features

- Encrypts image pixel values
- Uses RGB color manipulation
- Generates a new encrypted image file
  
