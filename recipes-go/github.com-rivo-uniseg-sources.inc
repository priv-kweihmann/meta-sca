SRC_URI += "https://proxy.golang.org/github.com/rivo/uniseg/@v/v0.3.1.zip;srcoutput=github.com/rivo/uniseg;srcinput=github.com/rivo/uniseg@v0.3.1;downloadfilename=github-com-rivo-uniseg-0.3.1.zip;name=github-com-rivo-uniseg"
SRC_URI[github-com-rivo-uniseg.sha256sum] = "eb088f8fe4974de60592c71ebcd0a9aaa0bfe8a92f5350dea66193d6da035559"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rivo/uniseg/LICENSE.txt;md5=4393c339bf180cf6e188b6ea32d8b93c \
"

GOSRC_INCLUDEGUARD += "github.com-rivo-uniseg-sources.inc"

