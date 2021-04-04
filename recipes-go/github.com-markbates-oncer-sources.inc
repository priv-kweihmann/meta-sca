SRC_URI += "https://proxy.golang.org/github.com/markbates/oncer/@v/v1.0.0.zip;srcoutput=github.com/markbates/oncer;srcinput=github.com/markbates/oncer@v1.0.0;downloadfilename=github-com-markbates-oncer-1.0.0.zip;name=github-com-markbates-oncer"
SRC_URI[github-com-markbates-oncer.sha256sum] = "9a774885bfa4c9a96c438fdb51768833e1c7003f35cd27961137ff4096b1a764"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/markbates/oncer/LICENSE;md5=e15c553ebb88e0f83deb605759a42839 \
"

GOSRC_INCLUDEGUARD += "github.com-markbates-oncer-sources.inc"

