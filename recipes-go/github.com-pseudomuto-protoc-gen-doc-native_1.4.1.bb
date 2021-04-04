SUMMARY = "go.mod: github.com/pseudomuto/protoc-gen-doc"
HOMEPAGE = "https://pkg.go.dev/github.com/pseudomuto/protoc-gen-doc"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pseudomuto-protoc-gen-doc-sources.inc

GO_IMPORT = "github.com/pseudomuto/protoc-gen-doc"

inherit gosrc
inherit native
