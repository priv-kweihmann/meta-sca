SUMMARY = "go.mod: github.com/go-enry/go-license-detector/v4"
HOMEPAGE = "https://pkg.go.dev/github.com/go-enry/go-license-detector/v4"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-go-enry-go-license-detector-v4-sources.inc

GO_IMPORT = "github.com/go-enry/go-license-detector/v4"

inherit gosrc
inherit native
