SRC_URI += "https://proxy.golang.org/github.com/jackc/puddle/@v/v1.3.0.zip;srcoutput=github.com/jackc/puddle;srcinput=github.com/jackc/puddle@v1.3.0;downloadfilename=github-com-jackc-puddle-1.3.0.zip;name=github-com-jackc-puddle"
SRC_URI[github-com-jackc-puddle.sha256sum] = "b1eb42bb3cf9a430146af79cb183860b9dddfca51844c2d4b447dc2f43becc55"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackc/puddle/LICENSE;md5=bc1309f9a9a1700900dd861e88d22c5f \
"

GOSRC_INCLUDEGUARD += "github.com-jackc-puddle-sources.inc"

