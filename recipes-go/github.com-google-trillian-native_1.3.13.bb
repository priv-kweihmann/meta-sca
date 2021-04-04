SUMMARY = "go.mod: github.com/google/trillian"
HOMEPAGE = "https://pkg.go.dev/github.com/google/trillian"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-trillian-sources.inc

GO_IMPORT = "github.com/google/trillian"

# who ever made that weird mix of test/internal and cross reference should get fired
# version is simply not compilable
do_compile[noexec] = "1"

inherit gosrc
inherit native
