SUMMARY = "go.mod: github.com/grpc-ecosystem/go-grpc-middleware"
HOMEPAGE = "https://pkg.go.dev/github.com/grpc-ecosystem/go-grpc-middleware"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-grpc-ecosystem-go-grpc-middleware-sources.inc

GO_IMPORT = "github.com/grpc-ecosystem/go-grpc-middleware"

inherit gosrc
inherit native
