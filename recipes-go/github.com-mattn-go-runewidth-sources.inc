SRC_URI += "https://proxy.golang.org/github.com/mattn/go-runewidth/@v/v0.0.13.zip;srcoutput=github.com/mattn/go-runewidth;srcinput=github.com/mattn/go-runewidth@v0.0.13;downloadfilename=github-com-mattn-go-runewidth-0.0.13.zip;name=github-com-mattn-go-runewidth"
SRC_URI[github-com-mattn-go-runewidth.sha256sum] = "c104e14c1612a6d736bd109fe5fec9749a8146e1f7d37844d8a0a1296e00d4e9"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-runewidth/LICENSE;md5=24ce168f90aec2456a73de1839037245 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-runewidth-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rivo-uniseg-sources.inc', '', 'github.com-rivo-uniseg-sources.inc', d)}
