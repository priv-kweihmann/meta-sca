SUMMARY = "go.mod: github.com/markbates/sigtx"
HOMEPAGE = "https://pkg.go.dev/github.com/markbates/sigtx"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-markbates-sigtx-sources.inc

GO_IMPORT = "github.com/markbates/sigtx"

inherit gosrc
inherit native
