SUMMARY = "go.mod: github.com/go-redis/redis"
HOMEPAGE = "https://pkg.go.dev/github.com/go-redis/redis"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-redis-redis-sources.inc

GO_IMPORT = "github.com/go-redis/redis"

inherit gosrc
inherit native
