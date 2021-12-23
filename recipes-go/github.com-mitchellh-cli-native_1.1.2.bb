SUMMARY = "go.mod: github.com/mitchellh/cli"
HOMEPAGE = "https://pkg.go.dev/github.com/mitchellh/cli"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mitchellh-cli-sources.inc

EXTRA_DEPENDS += "\
    github.com-armon-go-radix-native \
    github.com-bgentry-speakeasy-native \
    github.com-fatih-color-native \
    github.com-masterminds-sprig-native \
    github.com-mattn-go-isatty-native \
    github.com-posener-complete-native \
"

GO_IMPORT = "github.com/mitchellh/cli"

inherit gosrc
inherit native
