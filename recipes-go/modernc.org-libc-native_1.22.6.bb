SUMMARY = "go.mod: modernc.org/libc"
HOMEPAGE = "https://pkg.go.dev/modernc.org/libc"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require modernc.org-libc-sources.inc

EXTRA_DEPENDS += "\
    github.com-dustin-go-humanize-native \
    github.com-google-uuid-native \
    github.com-mattn-go-isatty-native \
    golang.org-x-sys-native \
    modernc.org-mathutil-native \
    modernc.org-memory-native \
"

GO_IMPORT = "modernc.org/libc"

inherit gosrc
inherit native
