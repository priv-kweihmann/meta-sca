SUMMARY = "go.mod: github.com/envoyproxy/protoc-gen-validate"
HOMEPAGE = "https://pkg.go.dev/github.com/envoyproxy/protoc-gen-validate"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-envoyproxy-protoc-gen-validate-sources.inc

GO_IMPORT = "github.com/envoyproxy/protoc-gen-validate"

inherit gosrc
inherit native
