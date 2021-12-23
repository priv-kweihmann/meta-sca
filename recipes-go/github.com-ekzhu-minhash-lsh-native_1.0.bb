SUMMARY = "go.mod: github.com/ekzhu/minhash-lsh"
HOMEPAGE = "https://pkg.go.dev/github.com/ekzhu/minhash-lsh"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ekzhu-minhash-lsh-sources.inc

EXTRA_DEPENDS += "\
    github.com-dgryski-go-minhash-native \
"

GO_IMPORT = "github.com/ekzhu/minhash-lsh"

UPSTREAM_CHECK_GITHUB_TAGS = "1"
UPSTREAM_CHECK_REGEX = "releases/tag/v(?P<pver>\d+\.\d+)"

inherit gosrc
inherit native
