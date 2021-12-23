SUMMARY = "go.mod: github.com/StackExchange/wmi"
HOMEPAGE = "https://pkg.go.dev/github.com/StackExchange/wmi"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-stackexchange-wmi-sources.inc

GO_IMPORT = "github.com/StackExchange/wmi"

do_compile[noexec] = "1"

inherit gosrc
inherit native
