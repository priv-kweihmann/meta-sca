SUMMARY = "go.mod: github.com/letsencrypt/pkcs11key/v4"
HOMEPAGE = "https://pkg.go.dev/github.com/letsencrypt/pkcs11key/v4"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-letsencrypt-pkcs11key-v4-sources.inc

EXTRA_DEPENDS += "\
    github.com-miekg-pkcs11-native \
"

GO_IMPORT = "github.com/letsencrypt/pkcs11key/v4"

inherit gosrc
inherit native
