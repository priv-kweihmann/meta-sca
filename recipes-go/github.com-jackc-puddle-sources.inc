SRC_URI += "https://proxy.golang.org/github.com/jackc/puddle/@v/v1.2.1.zip;srcoutput=github.com/jackc/puddle;srcinput=github.com/jackc/puddle@v1.2.1;downloadfilename=github-com-jackc-puddle-1.2.1.zip;name=github-com-jackc-puddle"
SRC_URI[github-com-jackc-puddle.sha256sum] = "40d73550686666eb1f6df02b65008b2a4c98cfed1254dc4866e6ebe95fbc5c95"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackc/puddle/LICENSE;md5=bc1309f9a9a1700900dd861e88d22c5f \
"

GOSRC_INCLUDEGUARD += "github.com-jackc-puddle-sources.inc"

