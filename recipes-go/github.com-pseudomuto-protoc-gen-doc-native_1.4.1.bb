SUMMARY = "go.mod: github.com/pseudomuto/protoc-gen-doc"
HOMEPAGE = "https://pkg.go.dev/github.com/pseudomuto/protoc-gen-doc"

# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('MOD_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-pseudomuto-protoc-gen-doc-sources.inc
require github.com-creack-pty-sources.inc
require github.com-davecgh-go-spew-sources.inc
require github.com-envoyproxy-protoc-gen-validate-sources.inc
require github.com-gogo-protobuf-sources.inc
require github.com-golang-protobuf-sources.inc
require github.com-google-go-cmp-sources.inc
require github.com-iancoleman-strcase-sources.inc
require github.com-kr-fs-sources.inc
require github.com-kr-pretty-sources.inc
require github.com-kr-text-sources.inc
require github.com-lyft-protoc-gen-star-sources.inc
require github.com-masterminds-sprig-sources.inc
require github.com-mwitkow-go-proto-validators-sources.inc
require github.com-pkg-errors-sources.inc
require github.com-pkg-sftp-sources.inc
require github.com-pmezard-go-difflib-sources.inc
require github.com-pseudomuto-protokit-sources.inc
require github.com-spf13-afero-sources.inc
require github.com-stretchr-objx-sources.inc
require github.com-stretchr-testify-sources.inc
require github.com-yuin-goldmark-sources.inc
require golang.org-x-crypto-sources.inc
require golang.org-x-lint-sources.inc
require golang.org-x-mod-sources.inc
require golang.org-x-net-sources.inc
require golang.org-x-sync-sources.inc
require golang.org-x-sys-sources.inc
require golang.org-x-term-sources.inc
require golang.org-x-text-sources.inc
require golang.org-x-tools-sources.inc
require golang.org-x-xerrors-sources.inc
require google.golang.org-genproto-sources.inc
require google.golang.org-protobuf-sources.inc
require gopkg.in-check.v1-sources.inc
require gopkg.in-yaml.v3-sources.inc

GO_IMPORT = "github.com/pseudomuto/protoc-gen-doc"

inherit gosrc
inherit native
