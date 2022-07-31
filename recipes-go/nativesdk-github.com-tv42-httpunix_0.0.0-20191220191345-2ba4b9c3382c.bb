SUMMARY = "go.mod: github.com/tv42/httpunix"
HOMEPAGE = "https://pkg.go.dev/github.com/tv42/httpunix"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-tv42-httpunix-sources.inc

GO_IMPORT = "github.com/tv42/httpunix"
inherit gosrc
inherit nativesdk
