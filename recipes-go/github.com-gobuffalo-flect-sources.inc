SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/flect/@v/v0.2.3.zip;srcoutput=github.com/gobuffalo/flect;srcinput=github.com/gobuffalo/flect@v0.2.3;downloadfilename=github-com-gobuffalo-flect-0.2.3.zip;name=github-com-gobuffalo-flect"
SRC_URI[github-com-gobuffalo-flect.sha256sum] = "0d0161b8dd3b6a13e5898381d7ae1efacc8a61e1715cf6cb602fb9acdfe4f08a"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/flect/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-flect-sources.inc"

