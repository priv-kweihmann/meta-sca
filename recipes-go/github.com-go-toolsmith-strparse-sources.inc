SRC_URI += "https://proxy.golang.org/github.com/go-toolsmith/strparse/@v/v1.0.0.zip;srcoutput=github.com/go-toolsmith/strparse;srcinput=github.com/go-toolsmith/strparse@v1.0.0;downloadfilename=github-com-go-toolsmith-strparse-1.0.0.zip;name=github-com-go-toolsmith-strparse"
SRC_URI[github-com-go-toolsmith-strparse.sha256sum] = "6ef3361b6ef96308b09faf198405f6278548c690c99d2727c7da66c98c225bcc"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-toolsmith/strparse/LICENSE;md5=eb5e5cdecfe2b39a637e7494505d6fa6 \
"

GOSRC_INCLUDEGUARD += "github.com-go-toolsmith-strparse-sources.inc"

