SRC_URI += "https://proxy.golang.org/github.com/rivo/uniseg/@v/v0.4.7.zip;srcoutput=github.com/rivo/uniseg;srcinput=github.com/rivo/uniseg@v0.4.7;downloadfilename=github-com-rivo-uniseg-0.4.7.zip;name=github-com-rivo-uniseg"
SRC_URI[github-com-rivo-uniseg.sha256sum] = "b995e4aa0cc1e5779cc61138ac925cb8c1e963e40c80e4b93ee8553812ebb792"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/rivo/uniseg/LICENSE.txt;md5=4393c339bf180cf6e188b6ea32d8b93c \
"

GOSRC_INCLUDEGUARD += "github.com-rivo-uniseg-sources.inc"

