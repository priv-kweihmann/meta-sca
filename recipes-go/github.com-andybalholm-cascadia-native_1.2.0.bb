SUMMARY = "go.mod: github.com/andybalholm/cascadia"
HOMEPAGE = "https://pkg.go.dev/github.com/andybalholm/cascadia"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-andybalholm-cascadia-sources.inc

GO_IMPORT = "github.com/andybalholm/cascadia"

inherit gosrc
inherit native
