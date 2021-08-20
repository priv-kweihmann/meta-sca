SRC_URI += "https://proxy.golang.org/github.com/codahale/hdrhistogram/@v/v1.1.1.zip;srcoutput=github.com/codahale/hdrhistogram;srcinput=github.com/codahale/hdrhistogram@v1.1.1;downloadfilename=github-com-codahale-hdrhistogram-1.1.1.zip;name=github-com-codahale-hdrhistogram"
SRC_URI[github-com-codahale-hdrhistogram.sha256sum] = "f2297136e0a4fc7de7b209eb301a9de5f5404f411637bc8983288160f3f590cd"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/codahale/hdrhistogram/LICENSE;md5=8f7951af356bbbfcf3d07d3b26219e45 \
"

GOSRC_INCLUDEGUARD += "github.com-codahale-hdrhistogram-sources.inc"

