SRC_URI += "https://proxy.golang.org/github.com/go-git/go-billy/v5/@v/v5.1.0.zip;srcoutput=github.com/go-git/go-billy/v5;srcinput=github.com/go-git/go-billy/v5@v5.1.0;downloadfilename=github-com-go-git-go-billy-v5-5.1.0.zip;name=github-com-go-git-go-billy-v5"
SRC_URI[github-com-go-git-go-billy-v5.sha256sum] = "82d9d10c1e322901fe7b87c6d61ceb60f5126b06c64e1b3b5f52015d4b484650"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-git/go-billy/v5/LICENSE;md5=7b6086dcb6977f0ca57a7c47167999e7 \
"

GOSRC_INCLUDEGUARD += "github.com-go-git-go-billy-v5-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-check.v1-sources.inc', '', 'gopkg.in-check.v1-sources.inc', d)}
