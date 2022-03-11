SUMMARY = "go.mod: github.com/hashicorp/go-hclog"
HOMEPAGE = "https://pkg.go.dev/github.com/hashicorp/go-hclog"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hashicorp-go-hclog-sources.inc

EXTRA_DEPENDS += "\
    github.com-fatih-color-native \
    github.com-mattn-go-colorable-native \
    github.com-mattn-go-isatty-native \
"

GO_IMPORT = "github.com/hashicorp/go-hclog"

inherit gosrc
inherit native
