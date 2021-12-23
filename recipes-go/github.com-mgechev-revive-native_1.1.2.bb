SUMMARY = "go.mod: github.com/mgechev/revive"
HOMEPAGE = "https://pkg.go.dev/github.com/mgechev/revive"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mgechev-revive-sources.inc

EXTRA_DEPENDS += "\
    github.com-burntsushi-toml-native \
    github.com-chavacava-garif-native \
    github.com-fatih-color-native \
    github.com-fatih-structtag-native \
    github.com-mgechev-dots-native \
    github.com-mitchellh-go-homedir-native \
    github.com-olekukonko-tablewriter-native \
    github.com-pkg-errors-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "github.com/mgechev/revive"

inherit gosrc
inherit native
