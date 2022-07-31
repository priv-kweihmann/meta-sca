SUMMARY = "go.mod: github.com/google/btree"
HOMEPAGE = "https://pkg.go.dev/github.com/google/btree"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-btree-sources.inc

GO_IMPORT = "github.com/google/btree"
inherit gosrc
inherit nativesdk
