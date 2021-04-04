SRC_URI += "https://proxy.golang.org/github.com/jcmturner/gokrb5/v8/@v/v8.4.2.zip;srcoutput=github.com/jcmturner/gokrb5/v8;srcinput=github.com/jcmturner/gokrb5/v8@v8.4.2;downloadfilename=github-com-jcmturner-gokrb5-v8-8.4.2.zip;name=github-com-jcmturner-gokrb5-v8"
SRC_URI[github-com-jcmturner-gokrb5-v8.sha256sum] = "eecd7120363321bb6b58b015395089958720271b3211659d802447d417af5970"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jcmturner/gokrb5/v8/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"

GOSRC_INCLUDEGUARD += "github.com-jcmturner-gokrb5-v8-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gorilla-sessions-sources.inc', '', 'github.com-gorilla-sessions-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-uuid-sources.inc', '', 'github.com-hashicorp-go-uuid-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jcmturner-aescts-v2-sources.inc', '', 'github.com-jcmturner-aescts-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jcmturner-dnsutils-v2-sources.inc', '', 'github.com-jcmturner-dnsutils-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jcmturner-gofork-sources.inc', '', 'github.com-jcmturner-gofork-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jcmturner-goidentity-v6-sources.inc', '', 'github.com-jcmturner-goidentity-v6-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-jcmturner-rpc-v2-sources.inc', '', 'github.com-jcmturner-rpc-v2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-crypto-sources.inc', '', 'golang.org-x-crypto-sources.inc', d)}
