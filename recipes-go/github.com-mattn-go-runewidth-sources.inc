SRC_URI += "https://proxy.golang.org/github.com/mattn/go-runewidth/@v/v0.0.16.zip;srcoutput=github.com/mattn/go-runewidth;srcinput=github.com/mattn/go-runewidth@v0.0.16;downloadfilename=github-com-mattn-go-runewidth-0.0.16.zip;name=github-com-mattn-go-runewidth"
SRC_URI[github-com-mattn-go-runewidth.sha256sum] = "179d2d900c76ee3560fbeda60d0237a3be6acb734d0cb7423b55e5ccb0cedbca"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/mattn/go-runewidth/LICENSE;md5=24ce168f90aec2456a73de1839037245 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-runewidth-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rivo-uniseg-sources.inc', '', 'github.com-rivo-uniseg-sources.inc', d)}
