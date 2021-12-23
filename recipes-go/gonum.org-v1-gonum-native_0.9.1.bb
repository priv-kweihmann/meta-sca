SUMMARY = "go.mod: gonum.org/v1/gonum"
HOMEPAGE = "https://pkg.go.dev/gonum.org/v1/gonum"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require gonum.org-v1-gonum-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-exp-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "gonum.org/v1/gonum"

inherit gosrc
inherit native
