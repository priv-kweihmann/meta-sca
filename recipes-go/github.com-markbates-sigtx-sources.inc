SRC_URI += "https://proxy.golang.org/github.com/markbates/sigtx/@v/v1.0.0.zip;srcoutput=github.com/markbates/sigtx;srcinput=github.com/markbates/sigtx@v1.0.0;downloadfilename=github-com-markbates-sigtx-1.0.0.zip;name=github-com-markbates-sigtx"
SRC_URI[github-com-markbates-sigtx.sha256sum] = "e3b591a1a2b4dcec7b86d59e504b0bbf87ec3663efad818cd9b00471a33a0345"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/markbates/sigtx/LICENSE.txt;md5=8d487ef2d40a9da39a2a5ced2b008cc2 \
"

GOSRC_INCLUDEGUARD += "github.com-markbates-sigtx-sources.inc"

