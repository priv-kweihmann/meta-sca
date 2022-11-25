SRC_URI += "https://proxy.golang.org/github.com/rivo/uniseg/@v/v0.4.3.zip;srcoutput=github.com/rivo/uniseg;srcinput=github.com/rivo/uniseg@v0.4.3;downloadfilename=github-com-rivo-uniseg-0.4.3.zip;name=github-com-rivo-uniseg"
SRC_URI[github-com-rivo-uniseg.sha256sum] = "bac292df998571a72a5dcdf9150dedc56b3b611c81bc1b6ff84055e1a434832d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rivo/uniseg/LICENSE.txt;md5=4393c339bf180cf6e188b6ea32d8b93c \
"

GOSRC_INCLUDEGUARD += "github.com-rivo-uniseg-sources.inc"

