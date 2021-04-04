SRC_URI += "https://proxy.golang.org/github.com/spf13/cobra/@v/v1.1.3.zip;srcoutput=github.com/spf13/cobra;srcinput=github.com/spf13/cobra@v1.1.3;downloadfilename=github-com-spf13-cobra-1.1.3.zip;name=github-com-spf13-cobra"
SRC_URI[github-com-spf13-cobra.sha256sum] = "a5d41eb6af8dc87e660f985b402db40decaed441b68ec15b2dc2fb5777945d7b"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/spf13/cobra/LICENSE.txt;md5=920d76114a32b0fb75b3f2718c5a91be \
"

GOSRC_INCLUDEGUARD += "github.com-spf13-cobra-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-cpuguy83-go-md2man-v2-sources.inc', '', 'github.com-cpuguy83-go-md2man-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-inconshreveable-mousetrap-sources.inc', '', 'github.com-inconshreveable-mousetrap-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-go-homedir-sources.inc', '', 'github.com-mitchellh-go-homedir-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-pflag-sources.inc', '', 'github.com-spf13-pflag-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-viper-sources.inc', '', 'github.com-spf13-viper-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
