SUMMARY = "go.mod: github.com/neelance/sourcemap"
HOMEPAGE = "https://pkg.go.dev/github.com/neelance/sourcemap"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-neelance-sourcemap-sources.inc

GO_IMPORT = "github.com/neelance/sourcemap"
inherit gosrc
inherit nativesdk
