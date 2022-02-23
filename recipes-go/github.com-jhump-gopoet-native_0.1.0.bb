SUMMARY = "go.mod: github.com/jhump/gopoet"
HOMEPAGE = "https://pkg.go.dev/github.com/jhump/gopoet"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jhump-gopoet-sources.inc

GO_IMPORT = "github.com/jhump/gopoet"

inherit gosrc
inherit native
