SUMMARY = "go.mod: github.com/mwitkow/go-conntrack"
HOMEPAGE = "https://pkg.go.dev/github.com/mwitkow/go-conntrack"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mwitkow-go-conntrack-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-jpillora-backoff \
    nativesdk-github.com-prometheus-client-golang \
    nativesdk-golang.org-x-net \
"
GO_IMPORT = "github.com/mwitkow/go-conntrack"
inherit gosrc
inherit nativesdk
