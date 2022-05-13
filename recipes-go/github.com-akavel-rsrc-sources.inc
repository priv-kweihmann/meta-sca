SRC_URI += "https://proxy.golang.org/github.com/akavel/rsrc/@v/v0.10.2.zip;srcoutput=github.com/akavel/rsrc;srcinput=github.com/akavel/rsrc@v0.10.2;downloadfilename=github-com-akavel-rsrc-0.10.2.zip;name=github-com-akavel-rsrc"
SRC_URI[github-com-akavel-rsrc.sha256sum] = "4a1f17e289dec94b49610f74b467c7e2053332e856a8766ec8c3e7c3d39af04f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/akavel/rsrc/LICENSE.txt;md5=c2a4381359f35d6f4ff4d4ca39459844 \
"

GOSRC_INCLUDEGUARD += "github.com-akavel-rsrc-sources.inc"

