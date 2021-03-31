SUMMARY = "go.mod: github.com/boyter/golangvectorspace"
HOMEPAGE = "https://pkg.go.dev/github.com/boyter/golangvectorspace"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-boyter-golangvectorspace-sources.inc

GO_IMPORT = "github.com/boyter/golangvectorspace"

inherit gosrc
inherit native
