SUMMARY = "go.mod: github.com/miekg/pkcs11"
HOMEPAGE = "https://pkg.go.dev/github.com/miekg/pkcs11"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-miekg-pkcs11-sources.inc

GO_IMPORT = "github.com/miekg/pkcs11"

inherit gosrc
inherit native
