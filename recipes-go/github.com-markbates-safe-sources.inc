SRC_URI += "https://proxy.golang.org/github.com/markbates/safe/@v/v1.0.1.zip;srcoutput=github.com/markbates/safe;srcinput=github.com/markbates/safe@v1.0.1;downloadfilename=github-com-markbates-safe-1.0.1.zip;name=github-com-markbates-safe"
SRC_URI[github-com-markbates-safe.sha256sum] = "d5a98e8242318d4e88844ddbbfebe91f67f41e5aa1f6a96a58fa2fa94e0ae9ef"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/markbates/safe/LICENSE;md5=d38716f96ebe1fa8f2818e6c239f8f94 \
"

GOSRC_INCLUDEGUARD += "github.com-markbates-safe-sources.inc"

