SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/packd/@v/v1.0.0.zip;srcoutput=github.com/gobuffalo/packd;srcinput=github.com/gobuffalo/packd@v1.0.0;downloadfilename=github-com-gobuffalo-packd-1.0.0.zip;name=github-com-gobuffalo-packd"
SRC_URI[github-com-gobuffalo-packd.sha256sum] = "02fc94086c35eca0b2e0b7e12eb858309151f5bb15020b00f2119a9a67df1527"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/packd/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
    file://src/github.com/gobuffalo/packd/internal/takeon/github.com/markbates/errx/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-packd-sources.inc"

