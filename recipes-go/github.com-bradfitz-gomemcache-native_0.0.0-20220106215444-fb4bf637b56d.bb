SUMMARY = "go.mod: github.com/bradfitz/gomemcache"
HOMEPAGE = "https://pkg.go.dev/github.com/bradfitz/gomemcache"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-bradfitz-gomemcache-sources.inc

GO_IMPORT = "github.com/bradfitz/gomemcache"

inherit gosrc
inherit native
