SUMMARY = "go.mod: github.com/markbates/safe"
HOMEPAGE = "https://pkg.go.dev/github.com/markbates/safe"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-markbates-safe-sources.inc

GO_IMPORT = "github.com/markbates/safe"

inherit gosrc
inherit native
