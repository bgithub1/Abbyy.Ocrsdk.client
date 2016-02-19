Abbyy Cloud Java  Sdk, with some minor modifications (Scanner input of Application_id and password).  Abbyy has a great restful based OCR service, in which you can very quickly upload image files, and receive converted text back.  The cloud service has run significantly faster, and with much more accuracy, than running Tesseract locally.

See  http://ocrsdk.com/plans-and-pricing/ for pricing.
The first 50 uploads are free.

There are too mains that you can run:
To upload and convert one file, run the main in TestApp .
TestApp requires 3 arguments to do an image: recognize myImage.tif myText.txt
where 
1. the keyword "recognize" tells TestApp to do an image conversion
2. the argument myImage.tif is the path of the tif file that you want to OCR
3. The argument myText.tx is the path where you want to store the OCR text result

To upload multiple files, run the main in ProcessManyFiles .
ProcessManyFiles requires 3 arguments as well: recognize imageSourceFolderPath textDestinationFolderPath
where
1. The keyword "recognize" tells ProcessManyFiles to do an image conversion
2. The argument imageSourceFolderPath is a folder path where your images are stored
3. The argument textDestinationFolderPath is a folder path where your text files will be stored when they are returned.
 
