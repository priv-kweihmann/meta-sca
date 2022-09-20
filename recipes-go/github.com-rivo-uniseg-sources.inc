SRC_URI += "https://proxy.golang.org/github.com/rivo/uniseg/@v/v0.4.2.zip;srcoutput=github.com/rivo/uniseg;srcinput=github.com/rivo/uniseg@v0.4.2;downloadfilename=github-com-rivo-uniseg-0.4.2.zip;name=github-com-rivo-uniseg"
SRC_URI[github-com-rivo-uniseg.sha256sum] = "49887c5e54b045d7cf88d45b8fe92788830cf4c800b8cfab8a6aa70746fd4b7f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rivo/uniseg/LICENSE.txt;md5=4393c339bf180cf6e188b6ea32d8b93c \
"

GOSRC_INCLUDEGUARD += "github.com-rivo-uniseg-sources.inc"

