SRC_URI_append = " https://proxy.golang.org/cloud.google.com/go/storage/@v/v1.14.0.zip;srcoutput=cloud.google.com/go/storage;srcinput=cloud.google.com/go/storage@v1.14.0;downloadfilename=cloud-google-com-go-storage-1.14.0.zip;name=cloud-google-com-go-storage"
SRC_URI[cloud-google-com-go-storage.sha256sum] = "5a3c80a9867c15730b6fb3a547d75fa53f3cf75b82c1920e4c98cd4b64763238"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/cloud.google.com/go/storage/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"
