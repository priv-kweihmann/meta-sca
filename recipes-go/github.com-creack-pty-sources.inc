SRC_URI += "https://proxy.golang.org/github.com/creack/pty/@v/v1.1.20.zip;srcoutput=github.com/creack/pty;srcinput=github.com/creack/pty@v1.1.20;downloadfilename=github-com-creack-pty-1.1.20.zip;name=github-com-creack-pty"
SRC_URI[github-com-creack-pty.sha256sum] = "ad41345119a5afcc46af6e60a107254c8e0a739bdac034c65eed7cc9735be5f2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/creack/pty/LICENSE;md5=93958070863d769117fa33b129020050 \
"

GOSRC_INCLUDEGUARD += "github.com-creack-pty-sources.inc"

