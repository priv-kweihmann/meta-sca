SUMMARY = "go.mod: github.com/fredbi/uri"
HOMEPAGE = "https://pkg.go.dev/github.com/fredbi/uri"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-fredbi-uri-sources.inc

GO_IMPORT = "github.com/fredbi/uri"
inherit gosrc
inherit nativesdk
