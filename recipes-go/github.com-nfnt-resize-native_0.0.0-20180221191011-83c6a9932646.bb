SUMMARY = "go.mod: github.com/nfnt/resize"
HOMEPAGE = "https://pkg.go.dev/github.com/nfnt/resize"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-nfnt-resize-sources.inc

GO_IMPORT = "github.com/nfnt/resize"

inherit gosrc
inherit native
