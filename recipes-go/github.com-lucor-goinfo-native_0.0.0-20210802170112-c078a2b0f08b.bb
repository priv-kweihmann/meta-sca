SUMMARY = "go.mod: github.com/lucor/goinfo"
HOMEPAGE = "https://pkg.go.dev/github.com/lucor/goinfo"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-lucor-goinfo-sources.inc

EXTRA_DEPENDS += "\
    golang.org-x-mod-native \
    golang.org-x-sys-native \
"

GO_IMPORT = "github.com/lucor/goinfo"

inherit gosrc
inherit native
