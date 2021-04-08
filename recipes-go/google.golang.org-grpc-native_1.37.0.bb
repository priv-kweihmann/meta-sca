SUMMARY = "go.mod: google.golang.org/grpc"
HOMEPAGE = "https://pkg.go.dev/google.golang.org/grpc"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require google.golang.org-grpc-sources.inc

GO_IMPORT = "google.golang.org/grpc"

# version is somehow broken
do_compile[noexec] = "1"

inherit gosrc
inherit native
