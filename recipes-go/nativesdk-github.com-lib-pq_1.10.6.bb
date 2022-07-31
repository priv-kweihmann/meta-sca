SUMMARY = "go.mod: github.com/lib/pq"
HOMEPAGE = "https://pkg.go.dev/github.com/lib/pq"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-lib-pq-sources.inc

GO_IMPORT = "github.com/lib/pq"
inherit gosrc
inherit nativesdk
