SUMMARY = "go.mod: modernc.org/z"
HOMEPAGE = "https://pkg.go.dev/modernc.org/z"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require modernc.org-z-sources.inc

EXTRA_DEPENDS += "\
    modernc.org-ccgo-v3-native \
    modernc.org-libc-native \
"

GO_IMPORT = "modernc.org/z"

inherit gosrc
inherit native
