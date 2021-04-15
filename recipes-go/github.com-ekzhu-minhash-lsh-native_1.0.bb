SUMMARY = "go.mod: github.com/ekzhu/minhash-lsh"
HOMEPAGE = "https://pkg.go.dev/github.com/ekzhu/minhash-lsh"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-ekzhu-minhash-lsh-sources.inc

GO_IMPORT = "github.com/ekzhu/minhash-lsh"

UPSTREAM_CHECK_GITHUB_TAGS = "1"

inherit gosrc
inherit native
