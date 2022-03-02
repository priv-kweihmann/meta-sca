SUMMARY = "go.mod: github.com/godbus/dbus/v5"
HOMEPAGE = "https://pkg.go.dev/github.com/godbus/dbus/v5"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-godbus-dbus-v5-sources.inc

GO_IMPORT = "github.com/godbus/dbus/v5"

inherit gosrc
inherit native
