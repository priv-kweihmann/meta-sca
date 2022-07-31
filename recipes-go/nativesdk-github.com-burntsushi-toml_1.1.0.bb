SUMMARY = "go.mod: github.com/BurntSushi/toml"
HOMEPAGE = "https://pkg.go.dev/github.com/BurntSushi/toml"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-burntsushi-toml-sources.inc

GO_IMPORT = "github.com/BurntSushi/toml"
UPSTREAM_CHECK_GITTAGREGEX = "v(?P<pver>\d+\.\d+)"
inherit gosrc
inherit nativesdk
