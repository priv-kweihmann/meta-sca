SUMMARY = "go.mod: github.com/stretchr/testify"
HOMEPAGE = "https://pkg.go.dev/github.com/stretchr/testify"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-stretchr-testify-sources.inc

GO_IMPORT = "github.com/stretchr/testify"

inherit gosrc
inherit native
