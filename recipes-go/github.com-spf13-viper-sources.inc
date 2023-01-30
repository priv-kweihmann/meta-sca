SRC_URI += "https://proxy.golang.org/github.com/spf13/viper/@v/v1.15.0.zip;srcoutput=github.com/spf13/viper;srcinput=github.com/spf13/viper@v1.15.0;downloadfilename=github-com-spf13-viper-1.15.0.zip;name=github-com-spf13-viper"
SRC_URI[github-com-spf13-viper.sha256sum] = "b81a0f1510bd596e41afa885cb0c5d5d3a7e7267258c3da98adf47cf3d9a51f1"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/spf13/viper/LICENSE;md5=67fac7567cbf6ba946e5576d590b1ed4 \
"

GOSRC_INCLUDEGUARD += "github.com-spf13-viper-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fsnotify-fsnotify-sources.inc', '', 'github.com-fsnotify-fsnotify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-hcl-sources.inc', '', 'github.com-hashicorp-hcl-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-magiconair-properties-sources.inc', '', 'github.com-magiconair-properties-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mitchellh-mapstructure-sources.inc', '', 'github.com-mitchellh-mapstructure-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pelletier-go-toml-v2-sources.inc', '', 'github.com-pelletier-go-toml-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sagikazarmark-crypt-sources.inc', '', 'github.com-sagikazarmark-crypt-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-afero-sources.inc', '', 'github.com-spf13-afero-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-cast-sources.inc', '', 'github.com-spf13-cast-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-jwalterweatherman-sources.inc', '', 'github.com-spf13-jwalterweatherman-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-pflag-sources.inc', '', 'github.com-spf13-pflag-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-subosito-gotenv-sources.inc', '', 'github.com-subosito-gotenv-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-ini.v1-sources.inc', '', 'gopkg.in-ini.v1-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v3-sources.inc', '', 'gopkg.in-yaml.v3-sources.inc', d)}
