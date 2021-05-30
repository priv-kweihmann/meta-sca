SRC_URI += "https://proxy.golang.org/github.com/creack/pty/@v/v1.1.13.zip;srcoutput=github.com/creack/pty;srcinput=github.com/creack/pty@v1.1.13;downloadfilename=github-com-creack-pty-1.1.13.zip;name=github-com-creack-pty"
SRC_URI[github-com-creack-pty.sha256sum] = "0fce0d9b51cdc9fd20f200c4a2fedfb9537e7778dab1cbe1180f71df95d51bb2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/creack/pty/LICENSE;md5=93958070863d769117fa33b129020050 \
"

GOSRC_INCLUDEGUARD += "github.com-creack-pty-sources.inc"

