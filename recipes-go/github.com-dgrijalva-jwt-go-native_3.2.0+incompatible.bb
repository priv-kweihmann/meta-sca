SUMMARY = "go.mod: github.com/dgrijalva/jwt-go"
HOMEPAGE = "https://pkg.go.dev/github.com/dgrijalva/jwt-go"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-dgrijalva-jwt-go-sources.inc

GO_IMPORT = "github.com/dgrijalva/jwt-go"

inherit gosrc
inherit native
