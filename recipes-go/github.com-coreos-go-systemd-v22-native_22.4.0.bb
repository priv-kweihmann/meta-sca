SUMMARY = "go.mod: github.com/coreos/go-systemd/v22"
HOMEPAGE = "https://pkg.go.dev/github.com/coreos/go-systemd/v22"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-coreos-go-systemd-v22-sources.inc

EXTRA_DEPENDS += "\
    github.com-godbus-dbus-v5-native \
"

GO_IMPORT = "github.com/coreos/go-systemd/v22"

# recipe needs systemd header, which isn't available as a native recipe
do_compile[noexec] = "1"
UPSTREAM_CHECK_GITHUB_TAGS = "1"
UPSTREAM_CHECK_URI = "https://github.com/coreos/go-systemd/tags"

inherit gosrc
inherit native
