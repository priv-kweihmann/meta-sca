SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/packd/@v/v1.0.1.zip;srcoutput=github.com/gobuffalo/packd;srcinput=github.com/gobuffalo/packd@v1.0.1;downloadfilename=github-com-gobuffalo-packd-1.0.1.zip;name=github-com-gobuffalo-packd"
SRC_URI[github-com-gobuffalo-packd.sha256sum] = "300a6ccd80bd230f564ff3ffdc5aa6280d0d37d1bcc971c2e6f6918c3f07bf5b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/packd/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
    file://src/github.com/gobuffalo/packd/internal/takeon/github.com/markbates/errx/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-packd-sources.inc"

