SUMMARY = "go.mod: github.com/pelletier/go-toml/v2"
HOMEPAGE = "https://pkg.go.dev/github.com/pelletier/go-toml/v2"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pelletier-go-toml-v2-sources.inc

GO_IMPORT = "github.com/pelletier/go-toml/v2"

# needs CGO
do_compile[noexec] = "1"

inherit gosrc
inherit native
