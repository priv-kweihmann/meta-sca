SRC_URI += "https://proxy.golang.org/github.com/quasilyte/go-consistent/@v/v0.0.0-20200404105227-766526bf1e96.zip;srcoutput=github.com/quasilyte/go-consistent;srcinput=github.com/quasilyte/go-consistent@v0.0.0-20200404105227-766526bf1e96;downloadfilename=github-com-quasilyte-go-consistent-0.0.0-20200404105227-766526bf1e96.zip;name=github-com-quasilyte-go-consistent"
SRC_URI[github-com-quasilyte-go-consistent.sha256sum] = "c969368757b6f5eef5c7fcb2ffcc231cbdd3998ec17873f6ad49b49f22fc2000"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/quasilyte/go-consistent/LICENSE;md5=6488a078600266d4e3f2d5372b70846c \
"

GOSRC_INCLUDEGUARD += "github.com-quasilyte-go-consistent-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-toolsmith-astcast-sources.inc', '', 'github.com-go-toolsmith-astcast-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-toolsmith-astequal-sources.inc', '', 'github.com-go-toolsmith-astequal-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-toolsmith-astinfo-sources.inc', '', 'github.com-go-toolsmith-astinfo-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-toolsmith-pkgload-sources.inc', '', 'github.com-go-toolsmith-pkgload-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-toolsmith-typep-sources.inc', '', 'github.com-go-toolsmith-typep-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-kisielk-gotool-sources.inc', '', 'github.com-kisielk-gotool-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
