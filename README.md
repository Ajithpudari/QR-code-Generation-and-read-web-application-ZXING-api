# QR-code-Generation-and-read-web-application-ZXING-api
Java QR Code: 
Quick Response Code (QR Code) is a two-dimensional matrix like barcode, designed by a subsidiary of Toyota to mark their vehicles for tracking in their manufacturing facilities. This is nothing but a type of barcode.
Following are the information that QR Code can stored.

Product Number.
Product Name.
Simple text.
URL.
Email Address.
Secret Client Code.
And many more.

Java Api for QR code:

Xing ("Zebra Crossing") is the popular API for QR code processing in Java. Its library has multiple components and we will be using the ‘core’ for QR code creation in our Java example. Following code is example to create a QR code image and read information from a QR code image.

```
<dependency>
			<groupId>com.google.zxing</groupId>
			<artifactId>core</artifactId>
			<version>3.3.2</version>
		</dependency>

		<dependency>
			<groupId>com.google.zxing</groupId>
			<artifactId>javase</artifactId>
			<version>3.3.2</version>
		</dependency>
    
```
   To generate QR code:
   
````
   public class QRCodeGenerator {

		public static void generateQRCodeImage(String text, int width, int height, String filePath)
	            throws WriterException, IOException {
	        QRCodeWriter qrCodeWriter = new QRCodeWriter();
	        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

	        Path path = FileSystems.getDefault().getPath(filePath);
	        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
	       
	 }  
   
```
   
   To read Qr Code :
   
```
    private String readQR(String qrImage) throws Exception {
        final Resource fileResource = resourceLoader.getResource("classpath:static/" + qrImage);
        File QRfile = fileResource.getFile();
        BufferedImage bufferedImg = ImageIO.read(QRfile);
        LuminanceSource source = new BufferedImageLuminanceSource(bufferedImg);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Result result = new MultiFormatReader().decode(bitmap);
        System.out.println("Barcode Format: " + result.getBarcodeFormat());
        System.out.println("Content: " + result.getText());
        return result.getText();

    } 
 ```
    
    Excute above code sample and run on post man or web by hitting this URL :
    
    ### http://localhost:8080/
    
    Than you get an home page  fill the nformation. hit enter.
    
    Then go to refersh it.
    
    Than scan the QR code
    
    You get The information which you fill in home.
    
   
   
   
   
   
   
   
   
