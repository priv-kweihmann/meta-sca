SRC_URI += "https://proxy.golang.org/github.com/creack/pty/@v/v1.1.16.zip;srcoutput=github.com/creack/pty;srcinput=github.com/creack/pty@v1.1.16;downloadfilename=github-com-creack-pty-1.1.16.zip;name=github-com-creack-pty"
SRC_URI[github-com-creack-pty.sha256sum] = "c24ec5e3038bc98af7a4ebed2e59f3a959102a348a7cffc41eb869df4699191d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/creack/pty/LICENSE;md5=93958070863d769117fa33b129020050 \
"

GOSRC_INCLUDEGUARD += "github.com-creack-pty-sources.inc"

