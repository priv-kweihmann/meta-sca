SRC_URI += "https://proxy.golang.org/github.com/jcmturner/goidentity/v6/@v/v6.0.1.zip;srcoutput=github.com/jcmturner/goidentity/v6;srcinput=github.com/jcmturner/goidentity/v6@v6.0.1;downloadfilename=github-com-jcmturner-goidentity-v6-6.0.1.zip;name=github-com-jcmturner-goidentity-v6"
SRC_URI[github-com-jcmturner-goidentity-v6.sha256sum] = "243e6fd6ea9f3094eea32c55febade6d8aaa1b563db655b0c5327940e4719beb"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jcmturner/goidentity/v6/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"

GOSRC_INCLUDEGUARD += "github.com-jcmturner-goidentity-v6-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-uuid-sources.inc', '', 'github.com-hashicorp-go-uuid-sources.inc', d)}
