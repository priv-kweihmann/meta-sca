SRC_URI += "https://proxy.golang.org/github.com/jackc/puddle/@v/v1.2.0.zip;srcoutput=github.com/jackc/puddle;srcinput=github.com/jackc/puddle@v1.2.0;downloadfilename=github-com-jackc-puddle-1.2.0.zip;name=github-com-jackc-puddle"
SRC_URI[github-com-jackc-puddle.sha256sum] = "9482e1b4f4d31b5e758eef6114325bfb2ae7aa9c5bd7da903f0990d9cb93efa3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackc/puddle/LICENSE;md5=bc1309f9a9a1700900dd861e88d22c5f \
"

GOSRC_INCLUDEGUARD += "github.com-jackc-puddle-sources.inc"

