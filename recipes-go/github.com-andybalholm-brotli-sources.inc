SRC_URI += "https://proxy.golang.org/github.com/andybalholm/brotli/@v/v1.0.5.zip;srcoutput=github.com/andybalholm/brotli;srcinput=github.com/andybalholm/brotli@v1.0.5;downloadfilename=github-com-andybalholm-brotli-1.0.5.zip;name=github-com-andybalholm-brotli"
SRC_URI[github-com-andybalholm-brotli.sha256sum] = "f5ae9b2f3260a22ff3f3445fff081d3ef12ee1aa3c0b87eadc59b5a8fb2cdef0"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/andybalholm/brotli/LICENSE;md5=941ee9cd1609382f946352712a319b4b \
"

GOSRC_INCLUDEGUARD += "github.com-andybalholm-brotli-sources.inc"

