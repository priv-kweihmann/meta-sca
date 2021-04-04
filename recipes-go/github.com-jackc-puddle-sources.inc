SRC_URI += "https://proxy.golang.org/github.com/jackc/puddle/@v/v1.1.3.zip;srcoutput=github.com/jackc/puddle;srcinput=github.com/jackc/puddle@v1.1.3;downloadfilename=github-com-jackc-puddle-1.1.3.zip;name=github-com-jackc-puddle"
SRC_URI[github-com-jackc-puddle.sha256sum] = "2106d95f2e74cd3a80c5ae06a7e904e52d6c5c617db67fd4491af3a77a29e677"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackc/puddle/LICENSE;md5=bc1309f9a9a1700900dd861e88d22c5f \
"

GOSRC_INCLUDEGUARD += "github.com-jackc-puddle-sources.inc"

