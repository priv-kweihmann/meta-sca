SUMMARY = "go.mod: github.com/pelletier/go-toml"
HOMEPAGE = "https://pkg.go.dev/github.com/pelletier/go-toml"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pelletier-go-toml-sources.inc

GO_IMPORT = "github.com/pelletier/go-toml"
# needs CGO
do_compile[noexec] = "1"
inherit gosrc
inherit nativesdk
