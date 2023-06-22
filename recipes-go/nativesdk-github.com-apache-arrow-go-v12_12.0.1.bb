SUMMARY = "go.mod: github.com/apache/arrow/go/v12"
HOMEPAGE = "https://pkg.go.dev/github.com/apache/arrow/go/v12"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
# License is determined by the modules included and will be therefore computed
LICENSE = "${@' & '.join(sorted(set(x for x in (d.getVar('GOSRC_LICENSE') or '').split(' ') if x)))}"

# inject the needed sources
require github.com-apache-arrow-go-v12-sources.inc

EXTRA_DEPENDS += "\
    nativesdk-github.com-andybalholm-brotli \
    nativesdk-github.com-apache-thrift \
    nativesdk-github.com-docopt-docopt-go \
    nativesdk-github.com-goccy-go-json \
    nativesdk-github.com-golang-snappy \
    nativesdk-github.com-google-flatbuffers \
    nativesdk-github.com-google-uuid \
    nativesdk-github.com-johncgriffin-overflow \
    nativesdk-github.com-klauspost-asmfmt \
    nativesdk-github.com-klauspost-compress \
    nativesdk-github.com-minio-asm2plan9s \
    nativesdk-github.com-minio-c2goasm \
    nativesdk-github.com-pierrec-lz4-v4 \
    nativesdk-github.com-stretchr-testify \
    nativesdk-github.com-zeebo-xxh3 \
    nativesdk-golang.org-x-exp \
    nativesdk-golang.org-x-sync \
    nativesdk-golang.org-x-sys \
    nativesdk-golang.org-x-tools \
    nativesdk-golang.org-x-xerrors \
    nativesdk-gonum.org-v1-gonum \
    nativesdk-google.golang.org-grpc \
    nativesdk-google.golang.org-protobuf \
    nativesdk-modernc.org-sqlite \
"
GO_IMPORT = "github.com/apache/arrow/go/v12"
inherit gosrc
inherit nativesdk
