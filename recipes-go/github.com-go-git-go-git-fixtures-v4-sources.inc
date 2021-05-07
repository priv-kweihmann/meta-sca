SRC_URI += "https://proxy.golang.org/github.com/go-git/go-git-fixtures/v4/@v/v4.2.2.zip;srcoutput=github.com/go-git/go-git-fixtures/v4;srcinput=github.com/go-git/go-git-fixtures/v4@v4.2.2;downloadfilename=github-com-go-git-go-git-fixtures-v4-4.2.2.zip;name=github-com-go-git-go-git-fixtures-v4"
SRC_URI[github-com-go-git-go-git-fixtures-v4.sha256sum] = "cfb7fd5093441691cdbd6b8c278055205645f72170ef02133d9f49f952c4202e"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-git/go-git-fixtures/v4/LICENSE;md5=33c8a5f17d0f6a102fd51cfe74425237 \
"

GOSRC_INCLUDEGUARD += "github.com-go-git-go-git-fixtures-v4-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-git-go-billy-v5-sources.inc', '', 'github.com-go-git-go-billy-v5-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-check.v1-sources.inc', '', 'gopkg.in-check.v1-sources.inc', d)}
