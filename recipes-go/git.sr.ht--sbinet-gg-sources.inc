SRC_URI += "https://proxy.golang.org/git.sr.ht/~sbinet/gg/@v/v0.3.1.zip;srcoutput=git.sr.ht/~sbinet/gg;srcinput=git.sr.ht/~sbinet/gg@v0.3.1;downloadfilename=git-sr-ht--sbinet-gg-0.3.1.zip;name=git-sr-ht--sbinet-gg"
SRC_URI[git-sr-ht--sbinet-gg.sha256sum] = "435103529c4f24aecf7e4550bc816db2482dda4ee0123d337daba99971a8c498"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/git.sr.ht/~sbinet/gg/LICENSE.md;md5=427bfce4131bac053ba6e005e7f56adb \
"

GOSRC_INCLUDEGUARD += "git.sr.ht--sbinet-gg-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-freetype-sources.inc', '', 'github.com-golang-freetype-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
