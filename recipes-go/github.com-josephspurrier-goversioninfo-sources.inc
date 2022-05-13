SRC_URI += "https://proxy.golang.org/github.com/josephspurrier/goversioninfo/@v/v1.4.0.zip;srcoutput=github.com/josephspurrier/goversioninfo;srcinput=github.com/josephspurrier/goversioninfo@v1.4.0;downloadfilename=github-com-josephspurrier-goversioninfo-1.4.0.zip;name=github-com-josephspurrier-goversioninfo"
SRC_URI[github-com-josephspurrier-goversioninfo.sha256sum] = "61232b1351fb5e9e9539bf8b48da1862aba8d9812475b4044ecc180f9e4987c5"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/josephspurrier/goversioninfo/LICENSE;md5=6480da19702d9416437ffba7822035f6 \
"

GOSRC_INCLUDEGUARD += "github.com-josephspurrier-goversioninfo-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-akavel-rsrc-sources.inc', '', 'github.com-akavel-rsrc-sources.inc', d)}
