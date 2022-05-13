SUMMARY = "go.mod: github.com/shirou/gopsutil/v3"
HOMEPAGE = "https://pkg.go.dev/github.com/shirou/gopsutil/v3"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-shirou-gopsutil-v3-sources.inc

EXTRA_DEPENDS += "\
    github.com-lufia-plan9stats-native \
    github.com-power-devops-perfstat-native \
    github.com-tklauser-go-sysconf-native \
    github.com-yusufpapurcu-wmi-native \
    golang.org-x-sys-native \
"

GO_IMPORT = "github.com/shirou/gopsutil/v3"

inherit gosrc
inherit native
