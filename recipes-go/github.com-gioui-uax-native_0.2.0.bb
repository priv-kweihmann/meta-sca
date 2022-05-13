SUMMARY = "go.mod: github.com/gioui/uax"
HOMEPAGE = "https://pkg.go.dev/github.com/gioui/uax"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gioui-uax-sources.inc

EXTRA_DEPENDS += "\
    github.com-cloudfoundry-jibber-jabber-native \
    github.com-emirpasic-gods-native \
    github.com-jolestar-go-commons-pool-native \
    github.com-npillmayer-schuko-native \
    github.com-npillmayer-uax-native \
    golang.org-x-text-native \
"

GO_IMPORT = "github.com/gioui/uax"

# fails to compile
do_compile[noexec] = "1"

inherit gosrc
inherit native
