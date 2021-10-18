SRC_URI += "https://proxy.golang.org/github.com/creack/pty/@v/v1.1.17.zip;srcoutput=github.com/creack/pty;srcinput=github.com/creack/pty@v1.1.17;downloadfilename=github-com-creack-pty-1.1.17.zip;name=github-com-creack-pty"
SRC_URI[github-com-creack-pty.sha256sum] = "c6b0820b35c25f7d782f86c00545045b28992b6de894930634191feec56fc484"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/creack/pty/LICENSE;md5=93958070863d769117fa33b129020050 \
"

GOSRC_INCLUDEGUARD += "github.com-creack-pty-sources.inc"

