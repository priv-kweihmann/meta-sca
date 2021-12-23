SUMMARY = "go.mod: github.com/spf13/viper"
HOMEPAGE = "https://pkg.go.dev/github.com/spf13/viper"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-spf13-viper-sources.inc

EXTRA_DEPENDS += "\
    github.com-fsnotify-fsnotify-native \
    github.com-hashicorp-hcl-native \
    github.com-magiconair-properties-native \
    github.com-mitchellh-mapstructure-native \
    github.com-pelletier-go-toml-native \
    github.com-sagikazarmark-crypt-native \
    github.com-spf13-afero-native \
    github.com-spf13-cast-native \
    github.com-spf13-jwalterweatherman-native \
    github.com-spf13-pflag-native \
    github.com-subosito-gotenv-native \
    gopkg.in-ini.v1-native \
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/spf13/viper"

inherit gosrc
inherit native
