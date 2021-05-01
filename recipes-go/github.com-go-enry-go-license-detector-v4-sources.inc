SRC_URI += "https://proxy.golang.org/github.com/go-enry/go-license-detector/v4/@v/v4.2.0.zip;srcoutput=github.com/go-enry/go-license-detector/v4;srcinput=github.com/go-enry/go-license-detector/v4@v4.2.0;downloadfilename=github-com-go-enry-go-license-detector-v4-4.2.0.zip;name=github-com-go-enry-go-license-detector-v4"
SRC_URI[github-com-go-enry-go-license-detector-v4.sha256sum] = "3e436249cbe8dc15b7865476d00afb1289320938421cb170ab5ceecbfe736368"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/go-enry/go-license-detector/v4/LICENSE.md;md5=e06bb9eb867ad187ff551478be6d9747 \
    file://src/github.com/go-enry/go-license-detector/v4/licensedb/licensedb.go;md5=98d31e9f6b17d264979b74d2122c3aca \
"

GOSRC_INCLUDEGUARD += "github.com-go-enry-go-license-detector-v4-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ekzhu-minhash-lsh-sources.inc', '', 'github.com-ekzhu-minhash-lsh-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-git-go-git-v5-sources.inc', '', 'github.com-go-git-go-git-v5-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hhatto-gorst-sources.inc', '', 'github.com-hhatto-gorst-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jdkato-prose-sources.inc', '', 'github.com-jdkato-prose-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-russross-blackfriday-v2-sources.inc', '', 'github.com-russross-blackfriday-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sergi-go-diff-sources.inc', '', 'github.com-sergi-go-diff-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-pflag-sources.inc', '', 'github.com-spf13-pflag-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-exp-sources.inc', '', 'golang.org-x-exp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gonum.org-v1-gonum-sources.inc', '', 'gonum.org-v1-gonum-sources.inc', d)}
