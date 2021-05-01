SUMMARY = "go.mod: github.com/golang/groupcache"
HOMEPAGE = "https://pkg.go.dev/github.com/golang/groupcache"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-golang-groupcache-sources.inc

EXTRA_DEPENDS += "\
    github.com-golang-protobuf-native \
"

GO_IMPORT = "github.com/golang/groupcache"

inherit gosrc
inherit native
