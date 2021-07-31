SRC_URI += "https://proxy.golang.org/github.com/creack/pty/@v/v1.1.14.zip;srcoutput=github.com/creack/pty;srcinput=github.com/creack/pty@v1.1.14;downloadfilename=github-com-creack-pty-1.1.14.zip;name=github-com-creack-pty"
SRC_URI[github-com-creack-pty.sha256sum] = "66d460d5b3022b375f1b2ec8fabaf68f55244c5990d708605c2c7bb575b039f1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/creack/pty/LICENSE;md5=93958070863d769117fa33b129020050 \
"

GOSRC_INCLUDEGUARD += "github.com-creack-pty-sources.inc"

