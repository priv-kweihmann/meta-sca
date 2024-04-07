SUMMARY = "go.mod: golang.org/x/telemetry"
HOMEPAGE = "https://pkg.go.dev/golang.org/x/telemetry"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require golang.org-x-telemetry-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-golang.org-x-mod \
    nativesdk-golang.org-x-sync \
    nativesdk-golang.org-x-sys \
"
GO_IMPORT = "golang.org/x/telemetry"
# needs CGO
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
