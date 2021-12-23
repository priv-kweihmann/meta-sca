SUMMARY = "go.mod: github.com/hhatto/gorst"
HOMEPAGE = "https://pkg.go.dev/github.com/hhatto/gorst"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-hhatto-gorst-sources.inc

GO_IMPORT = "github.com/hhatto/gorst"

inherit gosrc
inherit native
