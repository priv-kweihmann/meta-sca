SRC_URI += "https://proxy.golang.org/github.com/jackc/puddle/@v/v1.1.4.zip;srcoutput=github.com/jackc/puddle;srcinput=github.com/jackc/puddle@v1.1.4;downloadfilename=github-com-jackc-puddle-1.1.4.zip;name=github-com-jackc-puddle"
SRC_URI[github-com-jackc-puddle.sha256sum] = "d86b8f4dd0ab9ed34063a73cddb3f4e7144153d078a0f60b2e41ea99310718c2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackc/puddle/LICENSE;md5=bc1309f9a9a1700900dd861e88d22c5f \
"

GOSRC_INCLUDEGUARD += "github.com-jackc-puddle-sources.inc"

