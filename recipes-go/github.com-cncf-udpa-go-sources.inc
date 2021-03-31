SRC_URI_append = " https://proxy.golang.org/github.com/cncf/udpa/go/@v/v0.0.0-20210322005330-6414d713912e.zip;srcoutput=github.com/cncf/udpa/go;srcinput=github.com/cncf/udpa/go@v0.0.0-20210322005330-6414d713912e;downloadfilename=github-com-cncf-udpa-go-0.0.0-20210322005330-6414d713912e.zip;name=github-com-cncf-udpa-go"
SRC_URI[github-com-cncf-udpa-go.sha256sum] = "11c1c21f63fc7682200f3cdc637e93a7162e4a5cd82d5e492e6957c2ec3f4ce7"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/cncf/udpa/go/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"
