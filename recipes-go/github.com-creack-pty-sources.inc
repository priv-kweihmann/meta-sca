SRC_URI += "https://proxy.golang.org/github.com/creack/pty/@v/v1.1.21.zip;srcoutput=github.com/creack/pty;srcinput=github.com/creack/pty@v1.1.21;downloadfilename=github-com-creack-pty-1.1.21.zip;name=github-com-creack-pty"
SRC_URI[github-com-creack-pty.sha256sum] = "bfd7ae42bd64033adce4053aa401ce595859f2bd88dcfdba7dd55f19b8864e45"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/creack/pty/LICENSE;md5=93958070863d769117fa33b129020050 \
"

GOSRC_INCLUDEGUARD += "github.com-creack-pty-sources.inc"

