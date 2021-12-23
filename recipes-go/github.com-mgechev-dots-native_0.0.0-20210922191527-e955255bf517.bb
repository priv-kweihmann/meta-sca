SUMMARY = "go.mod: github.com/mgechev/dots"
HOMEPAGE = "https://pkg.go.dev/github.com/mgechev/dots"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mgechev-dots-sources.inc

GO_IMPORT = "github.com/mgechev/dots"

inherit gosrc
inherit native
