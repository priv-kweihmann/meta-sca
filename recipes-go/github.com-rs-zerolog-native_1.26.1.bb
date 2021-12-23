SUMMARY = "go.mod: github.com/rs/zerolog"
HOMEPAGE = "https://pkg.go.dev/github.com/rs/zerolog"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-rs-zerolog-sources.inc

EXTRA_DEPENDS += "\
    github.com-coreos-go-systemd-v22-native \
    github.com-pkg-errors-native \
    github.com-rs-xid-native \
    golang.org-x-tools-native \
"

GO_IMPORT = "github.com/rs/zerolog"

inherit gosrc
inherit native
