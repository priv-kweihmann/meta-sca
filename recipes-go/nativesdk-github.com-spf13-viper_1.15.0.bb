SUMMARY = "go.mod: github.com/spf13/viper"
HOMEPAGE = "https://pkg.go.dev/github.com/spf13/viper"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-spf13-viper-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-fsnotify-fsnotify \
    nativesdk-github.com-hashicorp-hcl \
    nativesdk-github.com-magiconair-properties \
    nativesdk-github.com-mitchellh-mapstructure \
    nativesdk-github.com-pelletier-go-toml-v2 \
    nativesdk-github.com-sagikazarmark-crypt \
    nativesdk-github.com-spf13-afero \
    nativesdk-github.com-spf13-cast \
    nativesdk-github.com-spf13-jwalterweatherman \
    nativesdk-github.com-spf13-pflag \
    nativesdk-github.com-subosito-gotenv \
    nativesdk-gopkg.in-ini.v1 \
    nativesdk-gopkg.in-yaml.v3 \
"
GO_IMPORT = "github.com/spf13/viper"
inherit gosrc
inherit nativesdk
