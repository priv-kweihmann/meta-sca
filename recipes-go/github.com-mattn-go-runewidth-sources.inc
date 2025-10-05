SRC_URI += "https://proxy.golang.org/github.com/mattn/go-runewidth/@v/v0.0.19.zip;srcoutput=github.com/mattn/go-runewidth;srcinput=github.com/mattn/go-runewidth@v0.0.19;downloadfilename=github-com-mattn-go-runewidth-0.0.19.zip;name=github-com-mattn-go-runewidth"
SRC_URI[github-com-mattn-go-runewidth.sha256sum] = "4a99857860b6c26557e6d275d737df8bc29a542cc28fb041d47a417515906876"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/mattn/go-runewidth/LICENSE;md5=24ce168f90aec2456a73de1839037245 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-runewidth-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-clipperhouse-uax29-v2-sources.inc', '', 'github.com-clipperhouse-uax29-v2-sources.inc', d)}
