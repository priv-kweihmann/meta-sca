SRC_URI += "https://proxy.golang.org/github.com/jdkato/prose/@v/v1.2.1.zip;srcoutput=github.com/jdkato/prose;srcinput=github.com/jdkato/prose@v1.2.1;downloadfilename=github-com-jdkato-prose-1.2.1.zip;name=github-com-jdkato-prose"
SRC_URI[github-com-jdkato-prose.sha256sum] = "0b909511b913e254c75aa2bfd84479a98350aacc35f51e50de614932549195a3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jdkato/prose/LICENSE;md5=385b83e077032c3ea122f20163bbb9c4 \
"

GOSRC_INCLUDEGUARD += "github.com-jdkato-prose-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-montanaflynn-stats-sources.inc', '', 'github.com-montanaflynn-stats-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-shogo82148-go-shuffle-sources.inc', '', 'github.com-shogo82148-go-shuffle-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-neurosnap-sentences.v1-sources.inc', '', 'gopkg.in-neurosnap-sentences.v1-sources.inc', d)}
