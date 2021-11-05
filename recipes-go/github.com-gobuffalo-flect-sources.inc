SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/flect/@v/v0.2.4.zip;srcoutput=github.com/gobuffalo/flect;srcinput=github.com/gobuffalo/flect@v0.2.4;downloadfilename=github-com-gobuffalo-flect-0.2.4.zip;name=github-com-gobuffalo-flect"
SRC_URI[github-com-gobuffalo-flect.sha256sum] = "7f06fee9844aaa0b452fdc64d19c2d50ff554b0eb5cc31133a824641f04758c1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/flect/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-flect-sources.inc"

