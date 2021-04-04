SUMMARY = "go.mod: github.com/jhump/protoreflect"
HOMEPAGE = "https://pkg.go.dev/github.com/jhump/protoreflect"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jhump-protoreflect-sources.inc

GO_IMPORT = "github.com/jhump/protoreflect"

inherit gosrc
inherit native
