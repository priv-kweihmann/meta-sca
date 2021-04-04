SRC_URI += "https://proxy.golang.org/github.com/franela/goreq/@v/v0.0.0-20171204163338-bcd34c9993f8.zip;srcoutput=github.com/franela/goreq;srcinput=github.com/franela/goreq@v0.0.0-20171204163338-bcd34c9993f8;downloadfilename=github-com-franela-goreq-0.0.0-20171204163338-bcd34c9993f8.zip;name=github-com-franela-goreq"
SRC_URI[github-com-franela-goreq.sha256sum] = "4f0deb16b3d3acf93ac2e699fe189cf2632fe833bdd5d64f5a54787fed62d19a"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/franela/goreq/LICENSE;md5=513bc07d2111b1391227ad0bd1469ee1 \
"

GOSRC_INCLUDEGUARD += "github.com-franela-goreq-sources.inc"

