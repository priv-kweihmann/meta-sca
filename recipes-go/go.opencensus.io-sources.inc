SRC_URI_append = " https://proxy.golang.org/go.opencensus.io/@v/v0.23.0.zip;srcoutput=go.opencensus.io;srcinput=go.opencensus.io@v0.23.0;downloadfilename=go-opencensus-io-0.23.0.zip;name=go-opencensus-io"
SRC_URI[go-opencensus-io.sha256sum] = "81c78beb84872084d6d5ddc0a0bffc47294412898472c891a29cfcb66f3fa2d8"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/go.opencensus.io/LICENSE;md5=175792518e4ac015ab6696d16c4f607e \
"
