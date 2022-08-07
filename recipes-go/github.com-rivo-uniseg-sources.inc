SRC_URI += "https://proxy.golang.org/github.com/rivo/uniseg/@v/v0.3.4.zip;srcoutput=github.com/rivo/uniseg;srcinput=github.com/rivo/uniseg@v0.3.4;downloadfilename=github-com-rivo-uniseg-0.3.4.zip;name=github-com-rivo-uniseg"
SRC_URI[github-com-rivo-uniseg.sha256sum] = "410ba5034e1683946d68e7fd50ad793c2ad72b157f2959fe4719449666d1e63f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/rivo/uniseg/LICENSE.txt;md5=4393c339bf180cf6e188b6ea32d8b93c \
"

GOSRC_INCLUDEGUARD += "github.com-rivo-uniseg-sources.inc"

