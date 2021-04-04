SUMMARY = "go.mod: github.com/lyft/protoc-gen-star"
HOMEPAGE = "https://pkg.go.dev/github.com/lyft/protoc-gen-star"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-lyft-protoc-gen-star-sources.inc

GO_IMPORT = "github.com/lyft/protoc-gen-star"

inherit gosrc
inherit native
