SRC_URI += "https://proxy.golang.org/github.com/creack/pty/@v/v1.1.12.zip;srcoutput=github.com/creack/pty;srcinput=github.com/creack/pty@v1.1.12;downloadfilename=github-com-creack-pty-1.1.12.zip;name=github-com-creack-pty"
SRC_URI[github-com-creack-pty.sha256sum] = "8c26c955bfc4c3fb1dbd630f47ea9c8f7c4fc7c790e02711e5e392e18cd0e0f8"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/creack/pty/LICENSE;md5=93958070863d769117fa33b129020050 \
"

GOSRC_INCLUDEGUARD += "github.com-creack-pty-sources.inc"

