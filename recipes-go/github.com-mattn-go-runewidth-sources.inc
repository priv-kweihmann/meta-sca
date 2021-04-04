SRC_URI += "https://proxy.golang.org/github.com/mattn/go-runewidth/@v/v0.0.12.zip;srcoutput=github.com/mattn/go-runewidth;srcinput=github.com/mattn/go-runewidth@v0.0.12;downloadfilename=github-com-mattn-go-runewidth-0.0.12.zip;name=github-com-mattn-go-runewidth"
SRC_URI[github-com-mattn-go-runewidth.sha256sum] = "88d1f897fe2a1d24b3fdcc6509ae8094f00540394710b3a29bf36e6730faaaca"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-runewidth/LICENSE;md5=24ce168f90aec2456a73de1839037245 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-runewidth-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rivo-uniseg-sources.inc', '', 'github.com-rivo-uniseg-sources.inc', d)}
