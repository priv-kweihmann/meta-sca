SRC_URI += "https://proxy.golang.org/github.com/mattn/go-runewidth/@v/v0.0.15.zip;srcoutput=github.com/mattn/go-runewidth;srcinput=github.com/mattn/go-runewidth@v0.0.15;downloadfilename=github-com-mattn-go-runewidth-0.0.15.zip;name=github-com-mattn-go-runewidth"
SRC_URI[github-com-mattn-go-runewidth.sha256sum] = "d97c4f0667a14957569c932a8e2488f1c43757b4dcce313897aa001f07d149b0"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-runewidth/LICENSE;md5=24ce168f90aec2456a73de1839037245 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-runewidth-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rivo-uniseg-sources.inc', '', 'github.com-rivo-uniseg-sources.inc', d)}
