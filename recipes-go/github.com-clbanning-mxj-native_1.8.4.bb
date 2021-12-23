SUMMARY = "go.mod: github.com/clbanning/mxj"
HOMEPAGE = "https://pkg.go.dev/github.com/clbanning/mxj"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-clbanning-mxj-sources.inc

GO_IMPORT = "github.com/clbanning/mxj"

inherit gosrc
inherit native
