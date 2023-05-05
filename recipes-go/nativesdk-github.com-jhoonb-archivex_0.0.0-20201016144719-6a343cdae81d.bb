SUMMARY = "go.mod: github.com/jhoonb/archivex"
HOMEPAGE = "https://pkg.go.dev/github.com/jhoonb/archivex"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jhoonb-archivex-sources.inc

GO_IMPORT = "github.com/jhoonb/archivex"
inherit gosrc
inherit nativesdk
