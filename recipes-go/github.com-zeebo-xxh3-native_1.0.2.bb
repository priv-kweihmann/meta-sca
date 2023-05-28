SUMMARY = "go.mod: github.com/zeebo/xxh3"
HOMEPAGE = "https://pkg.go.dev/github.com/zeebo/xxh3"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-zeebo-xxh3-sources.inc

EXTRA_DEPENDS += "\
    github.com-klauspost-cpuid-v2-native \
"

GO_IMPORT = "github.com/zeebo/xxh3"

inherit gosrc
inherit native
