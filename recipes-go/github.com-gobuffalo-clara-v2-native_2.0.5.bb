SUMMARY = "go.mod: github.com/gobuffalo/clara/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/gobuffalo/clara/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gobuffalo-clara-v2-sources.inc

EXTRA_DEPENDS += "\
    github.com-fatih-color-native \
    github.com-gobuffalo-genny-v2-native \
    github.com-gobuffalo-here-native \
    github.com-gobuffalo-logger-native \
    github.com-gobuffalo-meta-native \
    github.com-gobuffalo-plush-v4-native \
    github.com-masterminds-semver-native \
    github.com-spf13-pflag-native \
"

GO_IMPORT = "github.com/gobuffalo/clara/v2"

inherit gosrc
inherit native
