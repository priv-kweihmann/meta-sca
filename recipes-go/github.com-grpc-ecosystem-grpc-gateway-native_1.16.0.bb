SUMMARY = "go.mod: github.com/grpc-ecosystem/grpc-gateway"
HOMEPAGE = "https://pkg.go.dev/github.com/grpc-ecosystem/grpc-gateway"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-grpc-ecosystem-grpc-gateway-sources.inc

GO_IMPORT = "github.com/grpc-ecosystem/grpc-gateway"

inherit gosrc
inherit native
