SUMMARY = "go.mod: github.com/prometheus/procfs"
HOMEPAGE = "https://pkg.go.dev/github.com/prometheus/procfs"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-prometheus-procfs-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-golang.org-x-sync \
    nativesdk-golang.org-x-sys \
"
GO_IMPORT = "github.com/prometheus/procfs"
inherit gosrc
inherit nativesdk
