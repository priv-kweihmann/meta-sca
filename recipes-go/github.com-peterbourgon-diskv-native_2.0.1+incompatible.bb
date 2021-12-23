SUMMARY = "go.mod: github.com/peterbourgon/diskv"
HOMEPAGE = "https://pkg.go.dev/github.com/peterbourgon/diskv"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-peterbourgon-diskv-sources.inc

EXTRA_DEPENDS += "\
    github.com-google-btree-native \
"

GO_IMPORT = "github.com/peterbourgon/diskv"

inherit gosrc
inherit native
