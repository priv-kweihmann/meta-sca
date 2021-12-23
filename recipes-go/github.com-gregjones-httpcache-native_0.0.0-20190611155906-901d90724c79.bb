SUMMARY = "go.mod: github.com/gregjones/httpcache"
HOMEPAGE = "https://pkg.go.dev/github.com/gregjones/httpcache"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-gregjones-httpcache-sources.inc

EXTRA_DEPENDS += "\
    github.com-bradfitz-gomemcache-native \
    github.com-gomodule-redigo-redis-native \
    github.com-peterbourgon-diskv-native \
    github.com-syndtr-goleveldb-native \
"

GO_IMPORT = "github.com/gregjones/httpcache"

inherit gosrc
inherit native
