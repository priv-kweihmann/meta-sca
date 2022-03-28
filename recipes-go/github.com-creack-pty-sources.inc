SRC_URI += "https://proxy.golang.org/github.com/creack/pty/@v/v1.1.18.zip;srcoutput=github.com/creack/pty;srcinput=github.com/creack/pty@v1.1.18;downloadfilename=github-com-creack-pty-1.1.18.zip;name=github-com-creack-pty"
SRC_URI[github-com-creack-pty.sha256sum] = "7dcada7782e04f0d4b47d50d4ef35f36f2c80f909231019149480429bdb176e5"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/creack/pty/LICENSE;md5=93958070863d769117fa33b129020050 \
"

GOSRC_INCLUDEGUARD += "github.com-creack-pty-sources.inc"

