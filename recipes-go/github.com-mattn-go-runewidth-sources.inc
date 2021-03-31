SRC_URI_append = " https://proxy.golang.org/github.com/mattn/go-runewidth/@v/v0.0.10.zip;srcoutput=github.com/mattn/go-runewidth;srcinput=github.com/mattn/go-runewidth@v0.0.10;downloadfilename=github-com-mattn-go-runewidth-0.0.10.zip;name=github-com-mattn-go-runewidth"
SRC_URI[github-com-mattn-go-runewidth.sha256sum] = "030dcf3ea6cb39b34269f119ee5fe5e9d5834daf409e1f3f48c065a45326f4a6"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/mattn/go-runewidth/LICENSE;md5=24ce168f90aec2456a73de1839037245 \
"
