SRC_URI += "https://proxy.golang.org/github.com/creack/pty/@v/v1.1.24.zip;srcoutput=github.com/creack/pty;srcinput=github.com/creack/pty@v1.1.24;downloadfilename=github-com-creack-pty-1.1.24.zip;name=github-com-creack-pty"
SRC_URI[github-com-creack-pty.sha256sum] = "754e25253e76a5583b80d57d3add3afe68fc4d9f2a490968a9d1eda8c8fd8815"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/creack/pty/LICENSE;md5=93958070863d769117fa33b129020050 \
"

GOSRC_INCLUDEGUARD += "github.com-creack-pty-sources.inc"

