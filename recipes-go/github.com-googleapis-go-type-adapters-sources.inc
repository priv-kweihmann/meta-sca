SRC_URI += "https://proxy.golang.org/github.com/googleapis/go-type-adapters/@v/v1.0.0.zip;srcoutput=github.com/googleapis/go-type-adapters;srcinput=github.com/googleapis/go-type-adapters@v1.0.0;downloadfilename=github-com-googleapis-go-type-adapters-1.0.0.zip;name=github-com-googleapis-go-type-adapters"
SRC_URI[github-com-googleapis-go-type-adapters.sha256sum] = "34319a3a8572d65bfc0cee5108e585348e102b7d293ddbeea5c44c7077c22742"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/googleapis/go-type-adapters/LICENSE;md5=f093bb7d6815960117804becfa7cba8d \
"

GOSRC_INCLUDEGUARD += "github.com-googleapis-go-type-adapters-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
