SUMMARY = "go.mod: github.com/stretchr/objx"
HOMEPAGE = "https://pkg.go.dev/github.com/stretchr/objx"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-stretchr-objx-sources.inc

GO_IMPORT = "github.com/stretchr/objx"

inherit gosrc
inherit native
