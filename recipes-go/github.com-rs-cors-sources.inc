SRC_URI += "https://proxy.golang.org/github.com/rs/cors/@v/v1.8.2.zip;srcoutput=github.com/rs/cors;srcinput=github.com/rs/cors@v1.8.2;downloadfilename=github-com-rs-cors-1.8.2.zip;name=github-com-rs-cors"
SRC_URI[github-com-rs-cors.sha256sum] = "0364a06be6e3b06304c0bfd2f7c4d6cfb7ffeb9d4c9a7f7518f8177a09e6376b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rs/cors/LICENSE;md5=04924a837bc661a5d288479a17393ff2 \
"

GOSRC_INCLUDEGUARD += "github.com-rs-cors-sources.inc"

