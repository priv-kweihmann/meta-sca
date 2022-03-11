SRC_URI += "https://proxy.golang.org/github.com/spf13/cobra/@v/v1.4.0.zip;srcoutput=github.com/spf13/cobra;srcinput=github.com/spf13/cobra@v1.4.0;downloadfilename=github-com-spf13-cobra-1.4.0.zip;name=github-com-spf13-cobra"
SRC_URI[github-com-spf13-cobra.sha256sum] = "98998ee512f4d4e13c594b3ebc36eb1fb1060173e92d468b3b43518afd17f110"

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
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
