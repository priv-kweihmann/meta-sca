SUMMARY = "go.mod: github.com/esiqveland/notify"
HOMEPAGE = "https://pkg.go.dev/github.com/esiqveland/notify"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-esiqveland-notify-sources.inc

EXTRA_DEPENDS += "\
    github.com-godbus-dbus-v5-native \
"

GO_IMPORT = "github.com/esiqveland/notify"

inherit gosrc
inherit native
