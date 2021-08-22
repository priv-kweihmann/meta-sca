SRC_URI += "https://proxy.golang.org/github.com/creack/pty/@v/v1.1.15.zip;srcoutput=github.com/creack/pty;srcinput=github.com/creack/pty@v1.1.15;downloadfilename=github-com-creack-pty-1.1.15.zip;name=github-com-creack-pty"
SRC_URI[github-com-creack-pty.sha256sum] = "7c0205e9a24cc366a154eb63b104294dadecb4ef9bf715ae8268c4514879cb40"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/creack/pty/LICENSE;md5=93958070863d769117fa33b129020050 \
"

GOSRC_INCLUDEGUARD += "github.com-creack-pty-sources.inc"

