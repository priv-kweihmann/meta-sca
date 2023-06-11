SUMMARY = "go.mod: modernc.org/ccgo/v3"
HOMEPAGE = "https://pkg.go.dev/modernc.org/ccgo/v3"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require modernc.org-ccgo-v3-sources.inc

EXTRA_DEPENDS += "\
    github.com-kballard-go-shellquote-native \
    golang.org-x-sys-native \
    golang.org-x-tools-native \
    modernc.org-cc-v3-native \
    modernc.org-libc-native \
    modernc.org-mathutil-native \
    modernc.org-opt-native \
"

GO_IMPORT = "modernc.org/ccgo/v3"

inherit gosrc
inherit native
