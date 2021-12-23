SUMMARY = "go.mod: github.com/spf13/cobra"
HOMEPAGE = "https://pkg.go.dev/github.com/spf13/cobra"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-spf13-cobra-sources.inc

EXTRA_DEPENDS += "\
    github.com-cpuguy83-go-md2man-v2-native \
    github.com-inconshreveable-mousetrap-native \
    github.com-spf13-pflag-native \
    github.com-spf13-viper-native \
    gopkg.in-yaml.v2-native \
"

GO_IMPORT = "github.com/spf13/cobra"

inherit gosrc
inherit native
