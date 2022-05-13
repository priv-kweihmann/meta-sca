SRC_URI += "https://proxy.golang.org/github.com/go-ole/go-ole/@v/v1.2.6.zip;srcoutput=github.com/go-ole/go-ole;srcinput=github.com/go-ole/go-ole@v1.2.6;downloadfilename=github-com-go-ole-go-ole-1.2.6.zip;name=github-com-go-ole-go-ole"
SRC_URI[github-com-go-ole-go-ole.sha256sum] = "95b192df81ca16f0fb7d2d98ff6596d70256d73e49e899c55fabd511fd6768ef"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-ole/go-ole/LICENSE;md5=7326db50c2d71ed0b0ca841d49b9e63e \
"

GOSRC_INCLUDEGUARD += "github.com-go-ole-go-ole-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
