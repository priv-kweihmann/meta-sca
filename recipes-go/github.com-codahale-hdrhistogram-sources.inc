SRC_URI += "https://proxy.golang.org/github.com/codahale/hdrhistogram/@v/v1.1.0.zip;srcoutput=github.com/codahale/hdrhistogram;srcinput=github.com/codahale/hdrhistogram@v1.1.0;downloadfilename=github-com-codahale-hdrhistogram-1.1.0.zip;name=github-com-codahale-hdrhistogram"
SRC_URI[github-com-codahale-hdrhistogram.sha256sum] = "5dfeb593ff3efd26d0e377f57c6b63e8b1084826b2293e04b83c491636371e3c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/codahale/hdrhistogram/LICENSE;md5=8f7951af356bbbfcf3d07d3b26219e45 \
"

GOSRC_INCLUDEGUARD += "github.com-codahale-hdrhistogram-sources.inc"

