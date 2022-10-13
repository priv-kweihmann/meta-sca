SRC_URI += "https://proxy.golang.org/github.com/spf13/cobra/@v/v1.6.0.zip;srcoutput=github.com/spf13/cobra;srcinput=github.com/spf13/cobra@v1.6.0;downloadfilename=github-com-spf13-cobra-1.6.0.zip;name=github-com-spf13-cobra"
SRC_URI[github-com-spf13-cobra.sha256sum] = "61b6ba34cd34ac5f82f386bde90fc4531f84f0ace33ce82b9d5310d8e0101915"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/spf13/cobra/LICENSE.txt;md5=920d76114a32b0fb75b3f2718c5a91be \
"

GOSRC_INCLUDEGUARD += "github.com-spf13-cobra-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cpuguy83-go-md2man-v2-sources.inc', '', 'github.com-cpuguy83-go-md2man-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-inconshreveable-mousetrap-sources.inc', '', 'github.com-inconshreveable-mousetrap-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-pflag-sources.inc', '', 'github.com-spf13-pflag-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v3-sources.inc', '', 'gopkg.in-yaml.v3-sources.inc', d)}
