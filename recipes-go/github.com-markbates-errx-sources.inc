SRC_URI += "https://proxy.golang.org/github.com/markbates/errx/@v/v1.1.0.zip;srcoutput=github.com/markbates/errx;srcinput=github.com/markbates/errx@v1.1.0;downloadfilename=github-com-markbates-errx-1.1.0.zip;name=github-com-markbates-errx"
SRC_URI[github-com-markbates-errx.sha256sum] = "0a7d5825780c1b82041eb4f574d18c2630cf5019c8c64f022122c0f8b63daef0"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/markbates/errx/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-markbates-errx-sources.inc"

