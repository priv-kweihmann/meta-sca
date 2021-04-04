SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/flect/@v/v0.2.2.zip;srcoutput=github.com/gobuffalo/flect;srcinput=github.com/gobuffalo/flect@v0.2.2;downloadfilename=github-com-gobuffalo-flect-0.2.2.zip;name=github-com-gobuffalo-flect"
SRC_URI[github-com-gobuffalo-flect.sha256sum] = "ba9e4550c0745879f967ed655cef97c011dbcfbcfa4caa383e0bd7397e775f55"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/flect/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-flect-sources.inc"

