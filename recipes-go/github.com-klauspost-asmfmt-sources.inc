SRC_URI += "https://proxy.golang.org/github.com/klauspost/asmfmt/@v/v1.3.2.zip;srcoutput=github.com/klauspost/asmfmt;srcinput=github.com/klauspost/asmfmt@v1.3.2;downloadfilename=github-com-klauspost-asmfmt-1.3.2.zip;name=github-com-klauspost-asmfmt"
SRC_URI[github-com-klauspost-asmfmt.sha256sum] = "fa6a350a8677a77e0dbf3664c6baf23aab5c0b60a64b8f3c00299da5d279021f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/klauspost/asmfmt/LICENSE;md5=00d6f962401947482d082858f7ba2ff3 \
    file://src/github.com/klauspost/asmfmt/cmd/asmfmt/LICENSE;md5=591778525c869cdde0ab5a1bf283cd81 \
"

GOSRC_INCLUDEGUARD += "github.com-klauspost-asmfmt-sources.inc"

