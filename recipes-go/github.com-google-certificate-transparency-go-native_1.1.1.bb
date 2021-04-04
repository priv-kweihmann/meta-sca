SUMMARY = "go.mod: github.com/google/certificate-transparency-go"
HOMEPAGE = "https://pkg.go.dev/github.com/google/certificate-transparency-go"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-google-certificate-transparency-go-sources.inc

GO_IMPORT = "github.com/google/certificate-transparency-go"

# trillian integration is completely broken
do_compile[noexec] = "1"

inherit gosrc
inherit native
