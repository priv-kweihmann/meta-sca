SRC_URI += "https://proxy.golang.org/git.sr.ht/~sbinet/gg/@v/v0.5.0.zip;srcoutput=git.sr.ht/~sbinet/gg;srcinput=git.sr.ht/~sbinet/gg@v0.5.0;downloadfilename=git-sr-ht--sbinet-gg-0.5.0.zip;name=git-sr-ht--sbinet-gg"
SRC_URI[git-sr-ht--sbinet-gg.sha256sum] = "b73149ec2597c8c569f436da7fa16bbfeebcdd3cdc00b8275b19e77c130a50ba"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/git.sr.ht/~sbinet/gg/LICENSE.md;md5=427bfce4131bac053ba6e005e7f56adb \
"

GOSRC_INCLUDEGUARD += "git.sr.ht--sbinet-gg-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-campoy-embedmd-sources.inc', '', 'github.com-campoy-embedmd-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-freetype-sources.inc', '', 'github.com-golang-freetype-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
