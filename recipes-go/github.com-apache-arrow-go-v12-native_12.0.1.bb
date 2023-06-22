SUMMARY = "go.mod: github.com/apache/arrow/go/v12"
HOMEPAGE = "https://pkg.go.dev/github.com/apache/arrow/go/v12"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-apache-arrow-go-v12-sources.inc

EXTRA_DEPENDS += "\
    github.com-andybalholm-brotli-native \
    github.com-apache-thrift-native \
    github.com-docopt-docopt-go-native \
    github.com-goccy-go-json-native \
    github.com-golang-snappy-native \
    github.com-google-flatbuffers-native \
    github.com-google-uuid-native \
    github.com-johncgriffin-overflow-native \
    github.com-klauspost-asmfmt-native \
    github.com-klauspost-compress-native \
    github.com-minio-asm2plan9s-native \
    github.com-minio-c2goasm-native \
    github.com-pierrec-lz4-v4-native \
    github.com-stretchr-testify-native \
    github.com-zeebo-xxh3-native \
    golang.org-x-exp-native \
    golang.org-x-sync-native \
    golang.org-x-sys-native \
    golang.org-x-tools-native \
    golang.org-x-xerrors-native \
    gonum.org-v1-gonum-native \
    google.golang.org-grpc-native \
    google.golang.org-protobuf-native \
    modernc.org-sqlite-native \
"

GO_IMPORT = "github.com/apache/arrow/go/v12"

inherit gosrc
inherit native
