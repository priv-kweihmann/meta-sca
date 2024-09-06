SRC_URI += "https://proxy.golang.org/github.com/creack/pty/@v/v1.1.23.zip;srcoutput=github.com/creack/pty;srcinput=github.com/creack/pty@v1.1.23;downloadfilename=github-com-creack-pty-1.1.23.zip;name=github-com-creack-pty"
SRC_URI[github-com-creack-pty.sha256sum] = "2151b7121020954864de83eacf854634866cca0a3bfe33a2ebffa2edebc25df3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/creack/pty/LICENSE;md5=93958070863d769117fa33b129020050 \
"

GOSRC_INCLUDEGUARD += "github.com-creack-pty-sources.inc"

