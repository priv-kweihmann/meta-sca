SUMMARY = "go.mod: github.com/klauspost/asmfmt"
HOMEPAGE = "https://pkg.go.dev/github.com/klauspost/asmfmt"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-klauspost-asmfmt-sources.inc

GO_IMPORT = "github.com/klauspost/asmfmt"

inherit gosrc
inherit native
