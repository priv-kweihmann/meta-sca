SUMMARY = "go.mod: github.com/dgryski/go-minhash"
HOMEPAGE = "https://pkg.go.dev/github.com/dgryski/go-minhash"

# License is determined by the modules included and will be therefore computed
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-dgryski-go-minhash-sources.inc

GO_IMPORT = "github.com/dgryski/go-minhash"

inherit gosrc
inherit native
