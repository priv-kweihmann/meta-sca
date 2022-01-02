SUMMARY = "go.mod: github.com/ekzhu/minhash-lsh"
HOMEPAGE = "https://pkg.go.dev/github.com/ekzhu/minhash-lsh"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ekzhu-minhash-lsh-sources.inc

EXTRA_DEPENDS += "\
    github.com-dgryski-go-minhash-native \
"

GO_IMPORT = "github.com/ekzhu/minhash-lsh"

UPSTREAM_CHECK_REGEX = "v(?P<pver>\d+\.\d+)"

inherit gosrc
inherit native
