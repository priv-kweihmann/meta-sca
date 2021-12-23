SUMMARY = "go.mod: github.com/leodido/go-urn"
HOMEPAGE = "https://pkg.go.dev/github.com/leodido/go-urn"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-leodido-go-urn-sources.inc

GO_IMPORT = "github.com/leodido/go-urn"

inherit gosrc
inherit native
