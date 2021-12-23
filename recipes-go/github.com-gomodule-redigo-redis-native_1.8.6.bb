SUMMARY = "go.mod: github.com/gomodule/redigo/redis"
HOMEPAGE = "https://pkg.go.dev/github.com/gomodule/redigo/redis"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gomodule-redigo-redis-sources.inc

GO_IMPORT = "github.com/gomodule/redigo/redis"

# version is somehow broken
do_compile[noexec] = "1"
UPSTREAM_CHECK_URI = "https://github.com/gomodule/redigo/tags"
UPSTREAM_CHECK_REGEX = "releases/tag/v(?P<pver>1\.\d+\.\d+)"

inherit gosrc
inherit native
