SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/flect/@v/v0.2.5.zip;srcoutput=github.com/gobuffalo/flect;srcinput=github.com/gobuffalo/flect@v0.2.5;downloadfilename=github-com-gobuffalo-flect-0.2.5.zip;name=github-com-gobuffalo-flect"
SRC_URI[github-com-gobuffalo-flect.sha256sum] = "59a823b26bbc47f3400d429043294cbb22dfec5730ce0c0c8e0eb818f8287a10"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/flect/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-flect-sources.inc"

