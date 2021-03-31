SRC_URI_append = " https://proxy.golang.org/cloud.google.com/go/@v/v0.80.0.zip;srcoutput=cloud.google.com/go;srcinput=cloud.google.com/go@v0.80.0;downloadfilename=cloud-google-com-go-0.80.0.zip;name=cloud-google-com-go"
SRC_URI[cloud-google-com-go.sha256sum] = "925809a6e3b55b82b23f44150d9c94d2caaedfc4d7d126a4346821f2081a9f51"

MOD_LICENSE_append = " \
    Apache-2.0 \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/cloud.google.com/go/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/cloud.google.com/go/third_party/pkgsite/LICENSE;md5=9d210c7471ce08e3db5261f33bf8fce6 \
"
