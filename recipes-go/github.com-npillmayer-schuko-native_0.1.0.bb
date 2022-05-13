SUMMARY = "go.mod: github.com/npillmayer/schuko"
HOMEPAGE = "https://pkg.go.dev/github.com/npillmayer/schuko"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-npillmayer-schuko-sources.inc

EXTRA_DEPENDS += "\
    github.com-davecgh-go-spew-native \
    github.com-sirupsen-logrus-native \
    github.com-spf13-viper-native \
"

GO_IMPORT = "github.com/npillmayer/schuko"

# fails to compile
do_compile[noexec] = "1"

inherit gosrc
inherit native
