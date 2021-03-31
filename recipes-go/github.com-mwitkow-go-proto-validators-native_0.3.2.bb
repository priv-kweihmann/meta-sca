SUMMARY = "go.mod: github.com/mwitkow/go-proto-validators"
HOMEPAGE = "https://pkg.go.dev/github.com/mwitkow/go-proto-validators"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-mwitkow-go-proto-validators-sources.inc
require github.com-creack-pty-sources.inc
require github.com-davecgh-go-spew-sources.inc
require github.com-gogo-protobuf-sources.inc
require github.com-golang-protobuf-sources.inc
require github.com-google-go-cmp-sources.inc
require github.com-kr-pretty-sources.inc
require github.com-kr-text-sources.inc
require github.com-pmezard-go-difflib-sources.inc
require github.com-stretchr-objx-sources.inc
require github.com-stretchr-testify-sources.inc
require golang.org-x-xerrors-sources.inc
require google.golang.org-protobuf-sources.inc
require gopkg.in-check.v1-sources.inc
require gopkg.in-yaml.v3-sources.inc

GO_IMPORT = "github.com/mwitkow/go-proto-validators"

inherit gosrc
inherit native
