SRC_URI += "https://proxy.golang.org/github.com/go-git/go-git-fixtures/v4/@v/v4.3.0.zip;srcoutput=github.com/go-git/go-git-fixtures/v4;srcinput=github.com/go-git/go-git-fixtures/v4@v4.3.0;downloadfilename=github-com-go-git-go-git-fixtures-v4-4.3.0.zip;name=github-com-go-git-go-git-fixtures-v4"
SRC_URI[github-com-go-git-go-git-fixtures-v4.sha256sum] = "9a2e44c7335b94ae94be0105d96e8bac33ccc63374cb7d91c22b3d05d7a46e29"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-git/go-git-fixtures/v4/LICENSE;md5=33c8a5f17d0f6a102fd51cfe74425237 \
"

GOSRC_INCLUDEGUARD += "github.com-go-git-go-git-fixtures-v4-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-git-go-billy-v5-sources.inc', '', 'github.com-go-git-go-billy-v5-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-check.v1-sources.inc', '', 'gopkg.in-check.v1-sources.inc', d)}
