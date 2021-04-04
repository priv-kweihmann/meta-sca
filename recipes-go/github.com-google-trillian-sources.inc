SRC_URI += "https://proxy.golang.org/github.com/google/trillian/@v/v1.3.13.zip;srcoutput=github.com/google/trillian;srcinput=github.com/google/trillian@v1.3.13;downloadfilename=github-com-google-trillian-1.3.13.zip;name=github-com-google-trillian"
SRC_URI[github-com-google-trillian.sha256sum] = "7590c664eab4cda1161bf88b0e6cec04657370d793793a48bfce96b421563d1a"
GOSRC_REMOVEDIRS += "github.com/google/trillian/cmd/internal/serverutil"
GOSRC_REMOVEDIRS += "github.com/google/trillian/cmd"
GOSRC_REMOVEDIRS += "github.com/google/trillian/monitoring/prometheus/etcdiscover"
GOSRC_REMOVEDIRS += "github.com/google/trillian/testonly"
GOSRC_REMOVEDIRS += "github.com/google/trillian/storage/testonly"
GOSRC_REMOVEDIRS += "github.com/google/trillian/integration/storagetest"
GOSRC_REMOVEDIRS += "github.com/google/trillian/merkle/testonly"
GOSRC_REMOVEDIRS += "github.com/google/trillian/storage/postgres/testdb"
GOSRC_REMOVEDIRS += "github.com/google/trillian/storage/testdb"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/google/trillian/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-google-trillian-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'bitbucket.org-creachadair-shell-sources.inc', '', 'bitbucket.org-creachadair-shell-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-spanner-sources.inc', '', 'cloud.google.com-go-spanner-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'contrib.go.opencensus.io-exporter-stackdriver-sources.inc', '', 'contrib.go.opencensus.io-exporter-stackdriver-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-apache-beam-sources.inc', '', 'github.com-apache-beam-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-fullstorydev-grpcurl-sources.inc', '', 'github.com-fullstorydev-grpcurl-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-redis-redis-sources.inc', '', 'github.com-go-redis-redis-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-sql-driver-mysql-sources.inc', '', 'github.com-go-sql-driver-mysql-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-glog-sources.inc', '', 'github.com-golang-glog-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-mock-sources.inc', '', 'github.com-golang-mock-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-btree-sources.inc', '', 'github.com-google-btree-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-certificate-transparency-go-sources.inc', '', 'github.com-google-certificate-transparency-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-grpc-ecosystem-go-grpc-middleware-sources.inc', '', 'github.com-grpc-ecosystem-go-grpc-middleware-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-letsencrypt-pkcs11key-v4-sources.inc', '', 'github.com-letsencrypt-pkcs11key-v4-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lib-pq-sources.inc', '', 'github.com-lib-pq-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-client-golang-sources.inc', '', 'github.com-prometheus-client-golang-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-client-model-sources.inc', '', 'github.com-prometheus-client-model-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pseudomuto-protoc-gen-doc-sources.inc', '', 'github.com-pseudomuto-protoc-gen-doc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.etcd.io-etcd-sources.inc', '', 'go.etcd.io-etcd-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'go.opencensus.io-sources.inc', '', 'go.opencensus.io-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-tools-sources.inc', '', 'golang.org-x-tools-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
