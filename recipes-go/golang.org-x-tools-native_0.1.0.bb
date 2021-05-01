SUMMARY = "go.mod: golang.org/x/tools"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/tools"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-tools-sources.inc

EXTRA_DEPENDS += "\
    github.com-yuin-goldmark-native \
    golang.org-x-mod-native \
    golang.org-x-net-native \
    golang.org-x-sync-native \
    golang.org-x-sys-native \
    golang.org-x-xerrors-native \
"

GO_IMPORT = "golang.org/x/tools"

inherit gosrc
inherit native
