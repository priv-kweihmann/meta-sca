SUMMARY = "go.mod: github.com/go-logfmt/logfmt"
HOMEPAGE = "https://pkg.go.dev/github.com/go-logfmt/logfmt"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-logfmt-logfmt-sources.inc

GO_IMPORT = "github.com/go-logfmt/logfmt"
inherit gosrc
inherit nativesdk
