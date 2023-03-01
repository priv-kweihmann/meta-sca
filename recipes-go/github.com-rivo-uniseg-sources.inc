SRC_URI += "https://proxy.golang.org/github.com/rivo/uniseg/@v/v0.4.4.zip;srcoutput=github.com/rivo/uniseg;srcinput=github.com/rivo/uniseg@v0.4.4;downloadfilename=github-com-rivo-uniseg-0.4.4.zip;name=github-com-rivo-uniseg"
SRC_URI[github-com-rivo-uniseg.sha256sum] = "740cd5803104efadf277a0f3519f0ead97e321dbd909ceeebd7c8b6b36b44754"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rivo/uniseg/LICENSE.txt;md5=4393c339bf180cf6e188b6ea32d8b93c \
"

GOSRC_INCLUDEGUARD += "github.com-rivo-uniseg-sources.inc"

