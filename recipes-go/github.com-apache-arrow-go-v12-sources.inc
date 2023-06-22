SRC_URI += "https://proxy.golang.org/github.com/apache/arrow/go/v12/@v/v12.0.1.zip;srcoutput=github.com/apache/arrow/go/v12;srcinput=github.com/apache/arrow/go/v12@v12.0.1;downloadfilename=github-com-apache-arrow-go-v12-12.0.1.zip;name=github-com-apache-arrow-go-v12"
SRC_URI[github-com-apache-arrow-go-v12.sha256sum] = "5eb05ed9c2c5e164503b00912b7b2456400578de29e7e8a8956a41acd861ab5b"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-2-Clause \
    BSD-3-Clause \
    BSD-3-Clause-Clear \
    BSL-1.0 \
    CC-BY-3.0 \
    CC-BY-4.0 \
    MIT \
    NCSA \
    NTP \
    OpenSSL \
    ZPL-2.1 \
    Zlib \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/apache/arrow/go/v12/LICENSE.txt;md5=ae04216442b5cd056b954ad7640a76aa \
"

GOSRC_INCLUDEGUARD += "github.com-apache-arrow-go-v12-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-andybalholm-brotli-sources.inc', '', 'github.com-andybalholm-brotli-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-apache-thrift-sources.inc', '', 'github.com-apache-thrift-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-docopt-docopt-go-sources.inc', '', 'github.com-docopt-docopt-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-goccy-go-json-sources.inc', '', 'github.com-goccy-go-json-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-snappy-sources.inc', '', 'github.com-golang-snappy-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-flatbuffers-sources.inc', '', 'github.com-google-flatbuffers-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-uuid-sources.inc', '', 'github.com-google-uuid-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-johncgriffin-overflow-sources.inc', '', 'github.com-johncgriffin-overflow-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-klauspost-asmfmt-sources.inc', '', 'github.com-klauspost-asmfmt-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-klauspost-compress-sources.inc', '', 'github.com-klauspost-compress-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-minio-asm2plan9s-sources.inc', '', 'github.com-minio-asm2plan9s-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-minio-c2goasm-sources.inc', '', 'github.com-minio-c2goasm-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pierrec-lz4-v4-sources.inc', '', 'github.com-pierrec-lz4-v4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-testify-sources.inc', '', 'github.com-stretchr-testify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-zeebo-xxh3-sources.inc', '', 'github.com-zeebo-xxh3-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-exp-sources.inc', '', 'golang.org-x-exp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-xerrors-sources.inc', '', 'golang.org-x-xerrors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gonum.org-v1-gonum-sources.inc', '', 'gonum.org-v1-gonum-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'modernc.org-sqlite-sources.inc', '', 'modernc.org-sqlite-sources.inc', d)}
