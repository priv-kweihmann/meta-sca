SUMMARY = "go.mod: github.com/markbates/oncer"
HOMEPAGE = "https://pkg.go.dev/github.com/markbates/oncer"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-markbates-oncer-sources.inc

GO_IMPORT = "github.com/markbates/oncer"

inherit gosrc
inherit native
