SUMMARY = "go.mod: github.com/jcmturner/gokrb5/v8"
HOMEPAGE = "https://pkg.go.dev/github.com/jcmturner/gokrb5/v8"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-jcmturner-gokrb5-v8-sources.inc
require github.com-gorilla-securecookie-sources.inc
require github.com-gorilla-sessions-sources.inc
require github.com-hashicorp-go-uuid-sources.inc
require github.com-jcmturner-aescts-v2-sources.inc
require github.com-jcmturner-dnsutils-v2-sources.inc
require github.com-jcmturner-gofork-sources.inc
require github.com-jcmturner-goidentity-v6-sources.inc
require github.com-jcmturner-rpc-v2-sources.inc
require golang.org-x-crypto-sources.inc
require golang.org-x-net-sources.inc
require golang.org-x-sys-sources.inc
require golang.org-x-term-sources.inc
require golang.org-x-text-sources.inc

GO_IMPORT = "github.com/jcmturner/gokrb5/v8"

inherit gosrc
inherit native
