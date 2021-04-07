SRC_URI += "https://proxy.golang.org/github.com/go-toolsmith/astinfo/@v/v1.0.0.zip;srcoutput=github.com/go-toolsmith/astinfo;srcinput=github.com/go-toolsmith/astinfo@v1.0.0;downloadfilename=github-com-go-toolsmith-astinfo-1.0.0.zip;name=github-com-go-toolsmith-astinfo"
SRC_URI[github-com-go-toolsmith-astinfo.sha256sum] = "401b7d8c06a1cea5c7b735bf8a6f514330050c02cbb644fdfa5b264890520212"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-toolsmith/astinfo/LICENSE;md5=eb5e5cdecfe2b39a637e7494505d6fa6 \
"

GOSRC_INCLUDEGUARD += "github.com-go-toolsmith-astinfo-sources.inc"

