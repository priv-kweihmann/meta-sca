SUMMARY = "go.mod: github.com/edsrzf/mmap-go"
HOMEPAGE = "https://pkg.go.dev/github.com/edsrzf/mmap-go"
DEFAULT_PREFERENCE = "-1"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-edsrzf-mmap-go-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-sys-native \
"

GO_IMPORT = "github.com/edsrzf/mmap-go"

inherit gosrc
inherit native
