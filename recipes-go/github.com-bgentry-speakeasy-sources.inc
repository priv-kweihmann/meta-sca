SRC_URI_append = " https://proxy.golang.org/github.com/bgentry/speakeasy/@v/v0.1.0.zip;srcoutput=github.com/bgentry/speakeasy;srcinput=github.com/bgentry/speakeasy@v0.1.0;downloadfilename=github-com-bgentry-speakeasy-0.1.0.zip;name=github-com-bgentry-speakeasy"
SRC_URI[github-com-bgentry-speakeasy.sha256sum] = "d4bfd48b9bf68c87f92c94478ac910bcdab272e15eb909d58f1fb939233f75f0"

MOD_LICENSE_append = " \
    Apache-2.0 \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/bgentry/speakeasy/LICENSE;md5=adf5a740fe07eb2aa1ac54aafe2d41f2 \
    file://src/github.com/bgentry/speakeasy/LICENSE_WINDOWS;md5=b563ae7163bca24b2c0ed1486f8c944c \
"
