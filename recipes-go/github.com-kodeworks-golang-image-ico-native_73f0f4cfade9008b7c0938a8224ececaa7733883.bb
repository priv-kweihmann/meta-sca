SUMMARY = "go.mod: github.com/Kodeworks/golang-image-ico"
HOMEPAGE = "https://pkg.go.dev/github.com/Kodeworks/golang-image-ico"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-kodeworks-golang-image-ico-sources.inc

GO_IMPORT = "github.com/Kodeworks/golang-image-ico"

UPSTREAM_CHECK_COMMITS = "1"

inherit gosrc
inherit native
