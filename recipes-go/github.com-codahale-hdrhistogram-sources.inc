SRC_URI += "https://proxy.golang.org/github.com/codahale/hdrhistogram/@v/v1.1.2.zip;srcoutput=github.com/codahale/hdrhistogram;srcinput=github.com/codahale/hdrhistogram@v1.1.2;downloadfilename=github-com-codahale-hdrhistogram-1.1.2.zip;name=github-com-codahale-hdrhistogram"
SRC_URI[github-com-codahale-hdrhistogram.sha256sum] = "82cb3ee61d580d677ebd191bbd22e77538a754b7c816ec985d8057a8b1347bdf"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/codahale/hdrhistogram/LICENSE;md5=8f7951af356bbbfcf3d07d3b26219e45 \
"

GOSRC_INCLUDEGUARD += "github.com-codahale-hdrhistogram-sources.inc"

