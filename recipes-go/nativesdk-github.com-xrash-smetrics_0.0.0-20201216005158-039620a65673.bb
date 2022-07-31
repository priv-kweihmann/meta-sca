SUMMARY = "go.mod: github.com/xrash/smetrics"
HOMEPAGE = "https://pkg.go.dev/github.com/xrash/smetrics"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-xrash-smetrics-sources.inc

GO_IMPORT = "github.com/xrash/smetrics"
inherit gosrc
inherit nativesdk
